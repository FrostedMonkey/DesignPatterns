package com.design.principle.dependenceinversion;

/**
 * @ClassName zhangSan
 * @Author chenchen
 * @Date 2019/8/10 18:52
 * @Version 1.0
 * 底层模块
 **/
public class zhangSan {
   /* public void studyJavaCourse(){
        System.out.println("学习java");
    }
    public void studyC(){
        System.out.println("学习C");
    }
    public void studyPython(){
        System.out.println("学习Python");
    }*/
   private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void study(){
       iCourse.studyCourse();
   }
}
