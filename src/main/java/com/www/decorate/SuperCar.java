package com.www.decorate;

/**
 * @ProjectName: DesignPattern
 * @Package: com.www.decorate
 * @ClassName: SuperCar
 * @Description: java类作用描述
 * @Author: wensijia
 * @CreateDate: 2020/4/4 17:29
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/4 17:29
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
public class SuperCar implements ICar {
    private ICar car;

    public SuperCar(ICar car){
        this.car = car;
    }

    public void run() {
        car.run();
    }
}
