package com.www.templateMethod;

/**
 * @ProjectName: DesignPattern
 * @Package: com.www.templateMethod
 * @ClassName: ConcreteClass2
 * @Description: java类作用描述
 * @Author: wensijia
 * @CreateDate: 2020/4/4 21:17
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/4 21:17
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
public class ConcreteClass2 extends AbstractClass {
    protected void doSomething() {
        System.out.println("ConcreteClass2 doSomething");
    }

    protected void doAnything() {
        System.out.println("ConcreteClass2 doAnything");
    }
}
