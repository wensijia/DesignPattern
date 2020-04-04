package com.www.decorate;

/**
 * @ProjectName: DesignPattern
 * @Package: com.www.decorate
 * @ClassName: Car
 * @Description: java类作用描述
 * @Author: wensijia
 * @CreateDate: 2020/4/4 17:21
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/4 17:21
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
public class Car implements ICar {

    public void run() {
        System.out.println("滴滴滴，跑起来");
    }
}
