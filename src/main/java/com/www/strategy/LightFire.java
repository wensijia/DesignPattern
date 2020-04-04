package com.www.strategy;

/**
 * @ProjectName: DesignPattern
 * @Package: com.www
 * @ClassName: LightFire
 * @Description: java类作用描述
 * @Author: wensijia
 * @CreateDate: 2020/4/1 14:19
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/1 14:19
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
public class LightFire implements FireBehavior {
    public void fire() {
        System.out.println("Just so so ,open fire!!!");
    }
}
