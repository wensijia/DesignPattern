package com.www.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @ProjectName: DesignPattern
 * @Package: com.www.flyweight
 * @ClassName: Factory
 * @Description: java类作用描述
 * @Author: wensijia
 * @CreateDate: 2020/4/8 22:07
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/8 22:07
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
public class Factory {

    // 容器
    private static final Map<String, Dog> DOG_MAP = new HashMap<>();

    private Factory() {
        throw new UnsupportedOperationException("不支持创建实例！");
    }

    public static Dog get(String color) {
        Dog dog = DOG_MAP.get(color);
        // 当容器中没有相似对象时，就创建一个，并放进容器
        if (Objects.isNull(dog)) {
            System.out.println("创建新对象...");
            dog = new Dog();
            dog.setColor(color);
            DOG_MAP.put(color, dog);
        }
        return dog;
    }
}
