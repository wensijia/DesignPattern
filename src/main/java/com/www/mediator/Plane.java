package com.www.mediator;

/**
 * @ProjectName: DesignPattern
 * @Package: com.www.mediator
 * @ClassName: Plane
 * @Description: java类作用描述
 * @Author: wensijia
 * @CreateDate: 2020/4/3 17:10
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/3 17:10
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
public abstract class Plane {
    //跑道为闲置状态时，使飞机进入待飞状态
    public abstract void readyState(String state);
    //飞机起飞
    public abstract void flyState(String state, Dispatcher dispatcher);
}
