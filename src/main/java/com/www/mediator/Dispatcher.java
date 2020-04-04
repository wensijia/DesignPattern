package com.www.mediator;

/**
 * @ProjectName: DesignPattern
 * @Package: com.www.mediator
 * @ClassName: Dispatcher
 * @Description: java类作用描述
 * @Author: wensijia
 * @CreateDate: 2020/4/3 17:14
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/3 17:14
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
public abstract class Dispatcher {
    //保留所有飞机的引用是为了当接收指令时可以唤醒其他飞机的操作
    SCPlane sc;
    SZPlane sz;
    ACPlane ac;

    public Dispatcher(SCPlane sc,SZPlane sz,ACPlane ac){
        super();
        this.ac = ac;
        this.sc = sc;
        this.sz = sz;
    }

    public abstract void SCPlaneFly(String state);
    public abstract void SZPlaneFly(String state);
    public abstract void ACPlaneFly(String state);
}
