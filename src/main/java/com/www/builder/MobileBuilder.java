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
    public abstract void setSequence(ArrayList<String> sequence);

    public abstract MobilleModel getMobilleModel();
}
