package com.design.pattern.creational.abstractFactory;

/**
 * @ClassName CourseFactory
 * @Author chenchen
 * @Date 2019/8/12 21:19
 * @Version 1.0
 **/
public interface CourseFactory {
    Video getVideo();
    Article getArticle();
}
