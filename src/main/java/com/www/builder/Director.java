package com.www.builder;

import java.util.ArrayList;

/**
 * @ProjectName: DesignPattern
 * @Package: com.www.builder
 * @ClassName: Director
 * @Description: java类作用描述
 * @Author: wensijia
 * @CreateDate: 2020/4/5 9:59
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/5 9:59
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
public class Director {
    private ArrayList<String> sequence = new ArrayList<String>();
    private PhoneBuilder phoneBuilder = new PhoneBuilder();
    private PadBuilder padBuilder = new PadBuilder();

    //功能机
    public PhoneModel getNotSmartPhone(){
        this.sequence.clear();
        sequence.add("element");
        sequence.add("call");
        sequence.add("shell");
        this.phoneBuilder.setSequence(sequence);
        return (PhoneModel) this.phoneBuilder.getMobilleModel();
    }

    //智能机
    public PhoneModel getSmartPhone(){
        this.sequence.clear();
        sequence.add("element");
        sequence.add("call");
        sequence.add("music");
        sequence.add("video");
        sequence.add("shell");
        this.phoneBuilder.setSequence(sequence);
        return (PhoneModel) this.phoneBuilder.getMobilleModel();
    }

    //可以插卡通话的pad
    public PadModel getCallPad(){
        this.sequence.clear();
        sequence.add("element");
        sequence.add("call");
        sequence.add("music");
        sequence.add("video");
        sequence.add("shell");
        this.padBuilder.setSequence(sequence);
        return (PadModel) this.padBuilder.getMobilleModel();
    }

    //无通话功能的pad
    public PadModel getNOTCallPad(){
        this.sequence.clear();
        sequence.add("element");
        sequence.add("music");
        sequence.add("video");
        sequence.add("shell");
        this.padBuilder.setSequence(sequence);
        return (PadModel) this.padBuilder.getMobilleModel();
    }
}
