package com.www.abstractFactory;

/**
 * @ProjectName: DesignPattern
 * @Package: com.www.abstractFactory
 * @ClassName: FactoryProducter
 * @Description: java类作用描述
 * @Author: wensijia
 * @CreateDate: 2020/4/2 16:01
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/2 16:01
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
public class FactoryProducter {
    public static AbstractFactory getFactory(String type){
        if("Lenovo".equals(type)){
            return new LenovoFactory();
        } else if("Dell".equals(type)){
            return new DellFactory();
        }
        return null;
    }
}
