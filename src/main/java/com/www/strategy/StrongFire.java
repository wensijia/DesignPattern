package com.www.strategy;

/**
 * @ProjectName: DesignPattern
 * @Package: com.www
 * @ClassName: StrongFire
 * @Description: java类作用描述
 * @Author: wensijia
 * @CreateDate: 2020/4/1 14:17
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/1 14:17
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
public class StrongFire implements FireBehavior {
    public void fire() {
        System.out.println("Full firepower!!!");
    }
}
