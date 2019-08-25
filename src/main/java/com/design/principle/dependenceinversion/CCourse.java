package com.design.principle.dependenceinversion;

/**
 * @ClassName CCourse
 * @Author chenchen
 * @Date 2019/8/10 18:57
 * @Version 1.0
 **/
public class CCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("学习C");
    }
}
