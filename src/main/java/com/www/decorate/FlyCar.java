package com.www.decorate;

/**
 * @ProjectName: DesignPattern
 * @Package: com.www.decorate
 * @ClassName: FlyCar
 * @Description: java类作用描述
 * @Author: wensijia
 * @CreateDate: 2020/4/4 17:31
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/4 17:31
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
public class FlyCar extends SuperCar {
    public FlyCar(ICar car) {
        super(car);
    }

    @Override
    public void run() {
        super.run();
        fly();
    }

    public void fly(){
        System.out.println("插上翅膀，自由飞翔");
    }
}
