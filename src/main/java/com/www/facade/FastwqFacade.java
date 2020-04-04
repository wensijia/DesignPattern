package com.www.facade;

/**
 * @ProjectName: DesignPattern
 * @Package: com.www.facade
 * @ClassName: FastwqFacade
 * @Description: java类作用描述
 * @Author: wensijia
 * @CreateDate: 2020/4/3 14:20
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/3 14:20
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
public class FastwqFacade {

    IKeyboard iKeyboard;
    IMouse iMouse;

    public FastwqFacade(IKeyboard iKeyboard,IMouse iMouse){
        super();
        this.iKeyboard = iKeyboard;
        this.iMouse = iMouse;
    }

    /**
     * 一系列操作封装成一个方法
     */
    public void fasewq(){
        iMouse.left();
        iKeyboard.w();
        iKeyboard.q();
    }
}
