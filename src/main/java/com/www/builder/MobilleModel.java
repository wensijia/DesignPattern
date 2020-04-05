package com.www.builder;

import java.util.ArrayList;

/**
 * @ProjectName: DesignPattern
 * @Package: com.www.builder
 * @ClassName: MobilleModel
 * @Description: java类作用描述
 * @Author: wensijia
 * @CreateDate: 2020/4/4 22:11
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/4 22:11
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
public abstract class MobilleModel {
    private ArrayList<String> sequence = new ArrayList<String>();

    //获取基础组件
    protected abstract void getElement();

    //获取电话功能组件
    protected abstract void getCall();

    //获取音乐功能组件
    protected abstract void getMusic();

    //获取视频功能组件
    protected abstract void getVideo();

    //获取外壳，装好了
    protected abstract void getShell();

    //组装
    final public void packaging(){
        //循环，谁在前先执行谁
        for (String str : this.sequence){
            if(str.equals("element")){
                this.getElement();
            }else if(str.equals("call")){
                this.getCall();
            }else if(str.equals("music")){
                this.getMusic();
            }else if(str.equals("video")){
                this.getVideo();
            }else if(str.equals("shell")){
                this.getShell();
            }
        }
    }

    //把传递过来的值传递到类内
    final public void setSequence(ArrayList<String> sequence){
        this.sequence = sequence;
    }
}
