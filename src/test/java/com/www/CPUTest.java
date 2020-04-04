package com.www;

import com.www.factory.CPU;
import com.www.factory.CPUFactory;

/**
 * @ProjectName: DesignPattern
 * @Package: PACKAGE_NAME
 * @ClassName: com.www.CPUTest
 * @Description: 工厂模式
 * @Author: wensijia
 * @CreateDate: 2020/4/1 22:00
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/1 22:00
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
public class CPUTest {
    public static void main(String[] args) {
        CPU cpu = null;

        //********** 第一种实现方式：传入不同参数生成不同对象 **********//
        System.out.println("********** 第一种实现方式：传入不同参数生成不同对象 **********");
        cpu = CPUFactory.create(CPUFactory.CPUType.Intel);
        cpu.overclock();

        cpu = CPUFactory.create(CPUFactory.CPUType.AMD);
        cpu.overclock();

        //********** 第二种实现方式：调用不同方法生成不同对象 **********//
        System.out.println("********** 第二种实现方式：调用不同方法生成不同对象 **********");
        cpu = CPUFactory.creatIntel();
        cpu.overclock();

        cpu = CPUFactory.creatAMD();
        cpu.overclock();
        
    }
}

