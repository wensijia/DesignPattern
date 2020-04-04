package com.www.strategy;

/**
 * @ProjectName: DesignPattern
 * @Package: com.www
 * @ClassName: Tank
 * @Description: java类作用描述
 * @Author: wensijia
 * @CreateDate: 2020/4/1 14:21
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/1 14:21
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
public abstract class Tank {
    //委托类（超类或接口）
    FireBehavior fireBehavior;

    public Tank(){}

    public abstract void display();

    // 核心：FireBehavior
    public void setFlyBehavior(FireBehavior fireBehavior) {
        this.fireBehavior = fireBehavior;
    }

    // 委托
    public void performFire() {
        fireBehavior.fire();
    }
}
