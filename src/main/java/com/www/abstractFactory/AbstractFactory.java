package com.www.abstractFactory;

/**
 * @ProjectName: DesignPattern
 * @Package: com.www.abstractFactory
 * @ClassName: Factory
 * @Description: java类作用描述
 * @Author: wensijia
 * @CreateDate: 2020/4/2 15:34
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/2 15:34
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
public abstract class AbstractFactory {
    //创建键盘
    public abstract Keyboard getKeybord();
    //创建鼠标
    public abstract Mouse getMouse() ;
}
