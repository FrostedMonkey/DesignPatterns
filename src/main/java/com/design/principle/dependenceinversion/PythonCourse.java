package com.design.principle.dependenceinversion;

/**
 * @ClassName PythonCourse
 * @Author chenchen
 * @Date 2019/8/10 19:04
 * @Version 1.0
 **/
public class PythonCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("学习python");
    }
}
