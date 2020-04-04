package com.www;

import com.www.mediator.ACPlane;
import com.www.mediator.AirDispatcher;
import com.www.mediator.SCPlane;
import com.www.mediator.SZPlane;

/**
 * @ProjectName: DesignPattern
 * @Package: PACKAGE_NAME
 * @ClassName: com.www.mediatorTest
 * @Description: 中介者（调停者）
 * @Author: wensijia
 * @CreateDate: 2020/4/3 17:36
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/3 17:36
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
public class mediatorTest {
    public static void main(String[] args) {
        SCPlane sc = new SCPlane();
        SZPlane sz = new SZPlane();
        ACPlane ac = new ACPlane();

        AirDispatcher airDispatcher = new AirDispatcher(sc,sz,ac);

        sc.flyState("跑道已空出",airDispatcher);
        System.out.println("*********fly分割线*********");
        sz.flyState("跑道已空出",airDispatcher);
    }
}
