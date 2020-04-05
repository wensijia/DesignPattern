package com.www.builder;

import java.util.ArrayList;

/**
 * @ProjectName: DesignPattern
 * @Package: com.www.builder
 * @ClassName: PhoneBuilder
 * @Description: java类作用描述
 * @Author: wensijia
 * @CreateDate: 2020/4/4 22:38
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/4 22:38
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
public class PhoneBuilder extends MobileBuilder {
    private PhoneModel phoneModel = new PhoneModel();
    public void setSequence(ArrayList<String> sequence) {
        this.phoneModel.setSequence(sequence);
    }

    public MobilleModel getMobilleModel() {
        return this.phoneModel;
    }
}
