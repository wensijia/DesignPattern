package com.www.builder;

/**
 * @ProjectName: DesignPattern
 * @Package: com.www.builder
 * @ClassName: MP3
 * @Description: java类作用描述
 * @Author: wensijia
 * @CreateDate: 2020/4/4 22:33
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/4 22:33
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
public class PadModel extends MobilleModel {
    protected void getElement() {
        System.out.println("组装Pad基础组件，处理器等");
    }

    protected void getCall() {
        System.out.println("组装Pad通话组件，可以通话");
    }

    protected void getMusic() {
        System.out.println("组装Pad音乐组件，可以通话");
    }

    protected void getVideo() {
        System.out.println("组装Pad视频组件，可以视频");
    }

    protected void getShell() {
        System.out.println("组装Pad外壳，组装好，出厂");
    }
}
