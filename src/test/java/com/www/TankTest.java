package com.www;

import com.www.strategy.LightTank;
import com.www.strategy.StrongFire;
import com.www.strategy.Tank;

/**
 * @ProjectName: DesignPattern
 * @Package: PACKAGE_NAME
 * @ClassName: com.www.TankTest
 * @Description: 策略模式
 * @Author: wensijia
 * @CreateDate: 2020/4/1 14:27
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/1 14:27
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
public class TankTest {
    public static void main(String[] args) {
        Tank tank = new LightTank();
        // 使用默认的委托类
        tank.performFire();
        // 动态替换委托类
        tank.setFlyBehavior(new StrongFire());
        tank.performFire();
    }
}
