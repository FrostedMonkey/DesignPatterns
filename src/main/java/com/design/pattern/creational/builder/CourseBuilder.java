package com.design.pattern.creational.builder;

/**
 * @ClassName CourseBuilder
 * @Author chenchen
 * @Date 2019/8/14 22:01
 * @Version 1.0
 **/
public abstract class CourseBuilder {
    private String courseName;
    private String coursePPT;
    private String courseVideo;
    /**
     * 手记
     */
    private String courseArticle;
    /**
     * question & answer
     */
    private String courseOA;
    public abstract void builderCourseName(String courseName);
    public abstract void builderCoursePPT(String coursePPT);
    public abstract void builderCourseVideo(String courseVideo);
    public abstract void builderCourseArticle(String courseArticle);
    public abstract void builderCourseOA(String courseOA);
    public abstract Course makeCourse();

}
