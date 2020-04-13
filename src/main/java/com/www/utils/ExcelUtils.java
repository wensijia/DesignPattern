package com.www.utils;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

/**
 * @ProjectName: DesignPattern
 * @Package: com.www.utils
 * @ClassName: ExcelUtils
 * @Description: Excel相关工具类
 * @Author: wensijia
 * @CreateDate: 2020/4/13 22:06
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/13 22:06
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
public class ExcelUtils {
    private static Workbook wb;

    //demo
    public static void main(String[] args) throws Exception {
        createTable("src/main/resources/demo.xlsx");
    }

    /**
     * 生成建表语句
     * @param path
     * @throws Exception
     */
    public static void createTable(String path) throws Exception {

        checkAndCreateSheet(path);

        for (int i = 0; i < wb.getNumberOfSheets(); i++) {
            //开始解析
            Sheet sheet = wb.getSheetAt(i);     //读取sheet
            int lastRowIndex = sheet.getLastRowNum();

            StringBuilder sb = new StringBuilder();
            String tableName = sheet.getRow(1).getCell(1).toString();
            sb.append("DROP TABLE IF EXISTS ").append(tableName).append(";");
            sb.append("\n");
            sb.append("CREATE TABLE ").append(tableName).append(" ( ");
            sb.append("\n");
            String primaryKey = "";
            for (int rIndex = 3; rIndex <= lastRowIndex; rIndex++) {   //遍历行
                Row row = sheet.getRow(rIndex);
                if (row != null) {
                    int firstCellIndex = row.getFirstCellNum();//字段注释

                    for (int cIndex = firstCellIndex + 1; cIndex <=6; cIndex++) {   //遍历列 ，到第6列 是否非空

                        Cell cell = row.getCell(cIndex);
                        if (cell == null) continue;
                        switch (cIndex) {
                            case 1://field
                                sb.append(cell.toString() + " ");
                                break;
                            case 2://type
                                String s = cell.toString().toLowerCase();
                                if (s.contains("date") || s.contains("time")) {
                                    sb.append(s);
                                } else if (s.contains("(")) {
                                    int temp = s.indexOf("(");
                                    String substring = s.substring(0, temp);
                                    sb.append(substring + "(");

                                    int numericCellValue = (int) row.getCell(3).getNumericCellValue();
                                    sb.append(numericCellValue);
                                    //小数点后位数
                                    if(substring.toLowerCase().contains("decimal")){
                                        int dotCellValue = (int) row.getCell(4).getNumericCellValue();
                                        sb.append(",").append(dotCellValue);

                                    }
                                    sb.append(") ");
                                } else if ("".equals(row.getCell(3).toString().trim())) {
                                    sb.append(s);
                                } else {
                                    sb.append(s + "(" + (int) row.getCell(3).getNumericCellValue() + ")").append(" ");
                                }
                                break;
                            case 4://PK
                                if (("*").equals(cell.toString())) {
                                    primaryKey = row.getCell(1).toString();
                                }
                                break;
                            case 5://NOT NULL
                                if (("*").equals(cell.toString())) {
                                    sb.append(" NOT NULL ");
                                } else {
                                    sb.append(" DEFAULT NULL ");
                                }
                                break;
                        }

                    }
                    sb.append(" COMMENT ").append("'").append(row.getCell(0).toString()).append("'").append(",");
                    sb.append("\n");
                }
            }
            sb.append("PRIMARY KEY (").append(primaryKey).append(")").append(" USING BTREE ");
            sb.append("\n");

            sb.append(") ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci ROW_FORMAT=COMPACT COMMENT='").append(sheet.getRow(0).getCell(1).toString()).append("';");
            sb.append("\n");
            System.out.println(sb);
        }
    }

    public static void createLabel(String path) throws Exception{
        checkAndCreateSheet(path);
        for (int i = 0; i < wb.getNumberOfSheets(); i++) {
            Sheet sheet = wb.getSheetAt(i);     //读取sheet
            StringBuilder sb = new StringBuilder();
            String tableName = sheet.getRow(1).getCell(2).toString().toLowerCase();
            sb.append("<table tableName=\"").append(tableName).append("\" domainObjectName=\"");
            String[] s = tableName.split("_");
            for(int j =1;j<s.length;j++){
                String substring = s[j].substring(0,1).toUpperCase();
                String substring1 = s[j].substring(1);
                if(s[0].equals("pls")){
                    sb.append(substring+substring1);
                }else {
                    System.out.println("<!--特殊"+tableName+"-->");
                }
            }
            sb.append("\"").append("\n\t").append("enableCountByExample=\"false\" enableUpdateByExample=\"false\" enableDeleteByExample=\"false\" enableSelectByExample=\"false\" selectByExampleQueryId=\"false\"></table>");
            System.out.println(sb);

        }
    }

    private static void checkAndCreateSheet(String path) throws Exception{
        if (path == null) return;
        String excelPath = path;
        File excel = new File(excelPath);
        String[] split = excel.getName().split("\\.");  //.是特殊字符，需要转义！！！！！
        //根据文件后缀（xls/xlsx）进行判断
        if ("xls".equals(split[1])) {
            FileInputStream fis = new FileInputStream(excel);   //文件流对象
            wb = new HSSFWorkbook(fis);
        } else if ("xlsx".equals(split[1])) {
            wb = new XSSFWorkbook(excel);
        } else {
            throw new Exception("文件类型错误!");
        }
    }
}
