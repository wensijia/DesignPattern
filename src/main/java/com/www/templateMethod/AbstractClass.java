package com.www.templateMethod;

/**
 * @ProjectName: DesignPattern
 * @Package: com.www.templateMethod
 * @ClassName: AbstractClass
 * @Description: 模版抽象类
 * @Author: wensijia
 * @CreateDate: 2020/4/4 21:13
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/4 21:13
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
public abstract class AbstractClass {
    //基本方法
    protected abstract void doSomething();
    protected abstract void doAnything();
    //模版方法
    public final void templateMethod(){
        //调用基本方法，完成逻辑
        doSomething();
        doAnything();
    }
}
