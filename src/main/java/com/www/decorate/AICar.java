package com.www.decorate;

/**
 * @ProjectName: DesignPattern
 * @Package: com.www.decorate
 * @ClassName: AICar
 * @Description: java类作用描述
 * @Author: wensijia
 * @CreateDate: 2020/4/4 17:32
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/4 17:32
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
public class AICar extends SuperCar {
    public AICar(ICar car) {
        super(car);
    }

    @Override
    public void run(){
        super.run();
        autoDrive();
    }

    public void autoDrive(){
        System.out.println("AI自动驾驶");
    }
}
