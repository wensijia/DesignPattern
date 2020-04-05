package com.www;

import com.www.templateMethod.AbstractClass;
import com.www.templateMethod.ConcreteClass1;
import com.www.templateMethod.ConcreteClass2;

/**
 * @ProjectName: DesignPattern
 * @Package: com.www
 * @ClassName: TemplateMethodTest
 * @Description: 模版方法模式
 * @Author: wensijia
 * @CreateDate: 2020/4/4 21:19
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/4 21:19
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
public class TemplateMethodTest {
    public static void main(String[] args) {
        AbstractClass class1 = new ConcreteClass1();
        AbstractClass class2 = new ConcreteClass2();
        //调用模版方法
        class1.templateMethod();
        class2.templateMethod();
    }
}
