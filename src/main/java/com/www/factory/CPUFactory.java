package com.www.factory;

/**
 * @ProjectName: DesignPattern
 * @Package: com.www.factory
 * @ClassName: CPUFactory
 * @Description: java类作用描述
 * @Author: wensijia
 * @CreateDate: 2020/4/1 21:55
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/1 21:55
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
public class CPUFactory {
    /**第一种实现方式：传入不同参数生成不同对象**/
    public static CPU create(CPUType type) {
        switch (type) {
            case AMD:
                return new AMD();
            case Intel:
                return new Intel();
            default:
                throw new IllegalArgumentException();
        }
    }

    public enum CPUType {
        AMD, Intel
    }

    /**第二种实现方式：调用不同方法生成不同对象**/
    public static AMD creatAMD(){
        return new AMD();
    }

    public static Intel creatIntel(){
        return new Intel();
    }
}
