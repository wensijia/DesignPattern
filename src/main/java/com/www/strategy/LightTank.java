package com.www.strategy;

/**
 * @ProjectName: DesignPattern
 * @Package: com.www
 * @ClassName: LightTank
 * @Description: java类作用描述
 * @Author: wensijia
 * @CreateDate: 2020/4/1 14:25
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/1 14:25
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
public class LightTank extends Tank {

    public LightTank(){
        super.fireBehavior = new LightFire();
    }

    public void display() {
        System.out.println("I'm a real Light Tank!");
    }
}
