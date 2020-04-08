package com.www;

import com.www.flyweight.Dog;
import com.www.flyweight.Factory;

import java.util.Random;

/**
 * @ProjectName: DesignPattern
 * @Package: com.www
 * @ClassName: FlyweightTest
 * @Description: java类作用描述
 * @Author: wensijia
 * @CreateDate: 2020/4/8 22:09
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/8 22:09
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
public class FlyweightTest {
    public static void main(String[] args) {
        // 颜色数组
        String[] colors = {"black", "white", "flower", "yellow"};
        Random random = new Random();
        // 获取10只颜色随机的狗
        for (int i = 0; i < 10; i++) {
            Dog dog = Factory.get(colors[random.nextInt(colors.length)]);
            System.out.println(dog);
        }

    }
}
