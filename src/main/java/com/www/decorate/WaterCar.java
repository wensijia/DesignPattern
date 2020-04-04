package com.www.decorate;

/**
 * @ProjectName: DesignPattern
 * @Package: com.www.decorate
 * @ClassName: Water
 * @Description: java类作用描述
 * @Author: wensijia
 * @CreateDate: 2020/4/4 17:34
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/4 17:34
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
public class WaterCar extends SuperCar {
    public WaterCar(ICar car) {
        super(car);
    }

    @Override
    public void run() {
        super.run();
        water();
    }

    public void water(){
        System.out.println("装上气垫，水上漂");
    }
}
