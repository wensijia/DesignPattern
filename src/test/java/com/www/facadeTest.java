package com.www;

import com.www.facade.FastwqFacade;
import com.www.facade.IKeyboard;
import com.www.facade.IMouse;

/**
 * @ProjectName: DesignPattern
 * @Package: PACKAGE_NAME
 * @ClassName: com.www.facadeTest
 * @Description: 门面模式（外观模式）
 * @Author: wensijia
 * @CreateDate: 2020/4/3 14:15
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/3 14:15
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
public class facadeTest {
    public static void main(String[] args) {
        IKeyboard ikeyboard = new IKeyboard();
        IMouse imouse = new IMouse();
        imouse.left();
        ikeyboard.w();
        ikeyboard.q();

        System.out.println("************分割线*************");

        FastwqFacade fastwqFacade = new FastwqFacade(ikeyboard,imouse);
        fastwqFacade.fasewq();
    }
}
