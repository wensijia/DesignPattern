package com.www.builder;

/**
 * @ProjectName: DesignPattern
 * @Package: com.www.builder
 * @ClassName: PhoneModel
 * @Description: java类作用描述
 * @Author: wensijia
 * @CreateDate: 2020/4/4 22:29
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/4 22:29
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
public class PhoneModel extends MobilleModel {
    protected void getElement() {
        System.out.println("组装手机基础组件，处理器等等");
    }

    protected void getCall() {
        System.out.println("组装手机通话组件，可以打电话");
    }

    protected void getMusic() {
        System.out.println("组装手机音乐组件，可以放音乐");
    }

    protected void getVideo() {
        System.out.println("组装手机视频组件，可以播视频");
    }

    protected void getShell() {
        System.out.println("组装手机外壳，组装好了，出厂");
    }
}
