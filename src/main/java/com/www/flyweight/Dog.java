package com.www.flyweight;

import java.util.Random;

/**
 * @ProjectName: DesignPattern
 * @Package: com.www.flyweight
 * @ClassName: Dog
 * @Description: java类作用描述
 * @Author: wensijia
 * @CreateDate: 2020/4/8 22:06
 * @UpdateUser: <Updateuser>
 * @UpdateDate: 2020/4/8 22:06
 * @UpdateRemark: <Updateremark>
 * @Version: 1.0
 */
public class Dog {

    // 永远产生随机数
    private static final Random RANDOM = new Random();

    /** 颜色 */
    private String color;

    /** 颜值 */
    private Integer faceScore = RANDOM.nextInt(100);

    /** 运动量 */
    private Integer exerciseVolume = RANDOM.nextInt(100);

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getFaceScore() {
        return faceScore;
    }

    public void setFaceScore(Integer faceScore) {
        this.faceScore = faceScore;
    }

    public Integer getExerciseVolume() {
        return exerciseVolume;
    }

    public void setExerciseVolume(Integer exerciseVolume) {
        this.exerciseVolume = exerciseVolume;
    }

    @Override
    public String toString() {
        return "Dog [颜色：" + color + ", 颜值：" + faceScore + ", 运动量：" + exerciseVolume + "]";
    }
}
