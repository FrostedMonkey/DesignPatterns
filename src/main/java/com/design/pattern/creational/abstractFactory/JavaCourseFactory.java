package com.design.pattern.creational.abstractFactory;


/**
 * @ClassName JavaCourseFactory
 * @Author chenchen
 * @Date 2019/8/12 21:22
 * @Version 1.0
 **/
public class JavaCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
