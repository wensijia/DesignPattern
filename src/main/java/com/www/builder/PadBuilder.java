package com.www.builder;

import java.util.ArrayList;

/**
 * @ProjectName: DesignPattern
 * @Package: com.www.builder
 * @ClassName: PadBuilder
 * @Description: java类作用描述
 * @Author: wensijia
 * @CreateDate: 2020/4/4 22:39
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/4 22:39
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
public class PadBuilder extends MobileBuilder{
    private PadModel padModel = new PadModel();
    public void setSequence(ArrayList<String> sequence) {
        this.padModel.setSequence(sequence);
    }

    public MobilleModel getMobilleModel() {
        return this.padModel;
    }
}
