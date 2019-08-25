package com.design.pattern.creational.abstractFactory;


/**
 * @ClassName PythonCourseFactory
 * @Author chenchen
 * @Date 2019/8/12 21:27
 * @Version 1.0
 **/
public class PythonCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
