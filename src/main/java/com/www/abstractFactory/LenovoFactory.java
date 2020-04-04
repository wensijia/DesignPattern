package com.www.abstractFactory;

/**
 * @ProjectName: DesignPattern
 * @Package: com.www.abstractFactory
 * @ClassName: MouseFactory
 * @Description: java类作用描述
 * @Author: wensijia
 * @CreateDate: 2020/4/2 15:50
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/2 15:50
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
public class LenovoFactory extends AbstractFactory {
    public Keyboard getKeybord() {
        return new LenovoKeyboard();
    }

    public Mouse getMouse() {
        return new LenovoMouse();
    }
}
