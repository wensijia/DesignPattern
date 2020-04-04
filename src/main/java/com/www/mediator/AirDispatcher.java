package com.www.mediator;

/**
 * @ProjectName: DesignPattern
 * @Package: com.www.mediator
 * @ClassName: AirDispatcher
 * @Description: java类作用描述
 * @Author: wensijia
 * @CreateDate: 2020/4/3 17:27
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/3 17:27
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
public class AirDispatcher extends Dispatcher {

    public AirDispatcher(SCPlane sc, SZPlane sz, ACPlane ac) {
        super(sc, sz, ac);
    }

    public void SCPlaneFly(String state) {//川航起飞后，使其他飞机进入待飞状态
        sz.readyState(state);//调用深航待飞方法
    }

    public void SZPlaneFly(String state) {
        ac.readyState(state);
    }

    public void ACPlaneFly(String state) {
        sz.readyState(state);
    }
}
