package com.design.principle.dependenceinversion;

/**
 * @ClassName JavaCourse
 * @Author chenchen
 * @Date 2019/8/10 18:56
 * @Version 1.0
 **/
public class JavaCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("学习java");
    }
}
