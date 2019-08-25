package com.design.pattern.creational.abstractFactory;

/**
 * @ClassName Test
 * @Author chenchen
 * @Date 2019/8/12 21:49
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory=new JavaCourseFactory();
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();
        video.produce();
        article.produce();

    }
}
