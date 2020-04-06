package com.www.builder;

import java.util.ArrayList;

/**
 * @ProjectName: DesignPattern
 * @Package: com.www.builder
 * @ClassName: MobileBuilder
 * @Description: java类作用描述
 * @Author: wensijia
 * @CreateDate: 2020/4/4 22:36
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/4 22:36
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
public abstract class MobileBuilder {
    //创建模型，给组装顺序
    public abstract void setSequence(ArrayList<String> sequence);
    //设置完组装顺序后，直接可以拿到组装生产线
    public abstract MobilleModel getMobilleModel();
}
