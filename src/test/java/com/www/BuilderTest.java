package com.www;

import com.www.builder.*;

import java.util.ArrayList;

/**
 * @ProjectName: DesignPattern
 * @Package: com.www
 * @ClassName: BuilderTest
 * @Description: 建造者模式
 * @Author: wensijia
 * @CreateDate: 2020/4/4 22:41
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/4 22:41
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
public class BuilderTest {
    public static void main(String[] args) {
        //存放执行顺序
        ArrayList<String> sequence = new ArrayList<String>();
        sequence.add("element");
        sequence.add("call");
        sequence.add("music");
        sequence.add("video");
        sequence.add("shell");
        /*PhoneModel phoneModel = new PhoneModel();
        phoneModel.setSequence(sequence);
        phoneModel.packaging();
        PadModel padModel = new PadModel();
        padModel.setSequence(sequence);
        padModel.packaging();*/
        //要一部手机
        /*PhoneBuilder phoneBuilder = new PhoneBuilder();
        //把顺序给这个builerd类，组装出这样一部手机出来
        phoneBuilder.setSequence(sequence);
        PhoneModel phone = (PhoneModel) phoneBuilder.getMobilleModel();
        //组装出一部手机
        phone.packaging();
        //按照同样的顺序，组装一个pad
        PadBuilder padBuilder = new PadBuilder();
        padBuilder.setSequence(sequence);
        PadModel pad = (PadModel) padBuilder.getMobilleModel();
        pad.packaging();*/


        Director director = new Director();
        for (int i = 0; i < 1; i++) {
            director.getSmartPhone().packaging();
        }
        for (int i = 0; i < 2; i++) {
            director.getNotSmartPhone().packaging();
        }
        for (int i = 0; i < 3; i++) {
            director.getCallPad().packaging();
        }
        for (int i = 0; i < 4; i++) {
            director.getNOTCallPad().packaging();
        }
    }
}
