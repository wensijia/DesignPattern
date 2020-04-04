package com.www.mediator;

/**
 * @ProjectName: DesignPattern
 * @Package: com.www.mediator
 * @ClassName: SZPlane
 * @Description: java类作用描述
 * @Author: wensijia
 * @CreateDate: 2020/4/3 17:19
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/3 17:19
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
public class SZPlane extends Plane {
    public void readyState(String state) {
        System.out.println(state + "，请深航做好起飞准备");
    }

    public void flyState(String state, Dispatcher dispatcher) {
        System.out.println("深航已离地，"+state);
        dispatcher.SZPlaneFly(state);
    }
}
