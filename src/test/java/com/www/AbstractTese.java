package com.www;

import com.www.abstractFactory.*;

/**
 * @ProjectName: DesignPattern
 * @Package: PACKAGE_NAME
 * @ClassName: com.www.AbstractTese
 * @Description: 抽象工厂模式
 * @Author: wensijia
 * @CreateDate: 2020/4/2 15:56
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/2 15:56
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
public class AbstractTese {
    public static void main(String[] args) {
        //定义出两个工厂
        AbstractFactory lenovoFactory = new LenovoFactory();
        AbstractFactory dellFactory = new DellFactory();

        //生产鼠标一
        Mouse mouse1 = lenovoFactory.getMouse();
        //生产鼠标二
        Mouse mouse2 = dellFactory.getMouse();
        //生产键盘一
        Keyboard keyboard1 = lenovoFactory.getKeybord();
        //生产键盘二
        Keyboard keyboard2 = dellFactory.getKeybord();

        //产品贴牌
        mouse1.getMouseBrand();
        mouse2.getMouseBrand();
        keyboard1.getKeyboardBrand();
        keyboard2.getKeyboardBrand();
    }
}
