package com.www;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: DesignPattern
 * @Package: com.www
 * @ClassName: J8New
 * @Description: java类作用描述
 * @Author: wensijia
 * @CreateDate: 2020/4/23 15:30
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/23 15:30
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
public class J8New {
    public static void main(String[] args) {
        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");

        //过滤
        //stringCollection.stream().filter((s)->s.startsWith("a")).forEach(System.out::println);
        //排序
        //stringCollection.stream().sorted().forEach(System.out::println);
        //System.out.println(stringCollection);

        //Map 映射
        //stringCollection.stream().filter((s)->s.startsWith("a")).map(String::toUpperCase).forEach(System.out::println);

        //match
        //boolean flag = stringCollection.stream().noneMatch(s->s.contains("aaa"));
        //System.out.println(flag);

        //
    }
}
