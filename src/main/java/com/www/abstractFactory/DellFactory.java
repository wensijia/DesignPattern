package com.www.abstractFactory;

/**
 * @ProjectName: DesignPattern
 * @Package: com.www.abstractFactory
 * @ClassName: KeyboardFactory
 * @Description: java类作用描述
 * @Author: wensijia
 * @CreateDate: 2020/4/2 15:54
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/2 15:54
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
public class DellFactory extends AbstractFactory {
    public Keyboard getKeybord() {
        return new DellKeyboard();
    }

    public Mouse getMouse() {
        return new DellMouse();
    }
}
