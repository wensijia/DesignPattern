package com.www;

import com.www.decorate.*;

/**
 * @ProjectName: DesignPattern
 * @Package: PACKAGE_NAME
 * @ClassName: com.www.DecorateTest
 * @Description: 装饰器模式
 * @Author: wensijia
 * @CreateDate: 2020/4/4 17:36
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/4 17:36
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
public class DecorateTest {
    public static void main(String[] args) {
        ICar car = new Car();
        car.run();
        System.out.println("\n赋予汽车新的技能");
        AICar aiCar = new AICar(car);
        aiCar.run();

        System.out.println("\n再次赋予汽车新的技能");
        FlyCar flyCar = new FlyCar(car);
        flyCar.run();

        System.out.println("\n再再次赋予汽车新的技能");
        WaterCar waterCar = new WaterCar(car);
        waterCar.run();

        System.out.println("\n以上代码可以简写为：");
        FlyCar flyCar1 = new FlyCar(new AICar(new Car()));
        flyCar1.run();

        System.out.println("\n随意组合");
        WaterCar waterCar1 = new WaterCar(new AICar(new FlyCar(new Car())));
        waterCar1.run();
    }
}
