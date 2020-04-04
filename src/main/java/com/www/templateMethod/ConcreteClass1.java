package com.www.templateMethod;

/**
 * @ProjectName: DesignPattern
 * @Package: com.www.templateMethod
 * @ClassName: ConcreteClass1
 * @Description: java类作用描述
 * @Author: wensijia
 * @CreateDate: 2020/4/4 21:16
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/4 21:16
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
public class ConcreteClass1 extends AbstractClass {
    protected void doSomething() {
        System.out.println("ConcreteClass1 doSomething");
    }

    protected void doAnything() {
        System.out.println("ConcreteClass1 doAnything");
    }
}
