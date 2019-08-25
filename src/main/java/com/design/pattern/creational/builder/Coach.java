package com.design.pattern.creational.builder;

/**
 * @ClassName Coach
 * @Author chenchen
 * @Date 2019/8/14 22:12
 * @Version 1.0
 **/
public class Coach {
    private CourseBuilder courseBuilder;
    public void setCourseBuilder(CourseBuilder courseBuilder){
        this.courseBuilder=courseBuilder;
    }
    public Course makeCourse(String courseName,String coursePPT,
                             String courseVideo,String courseArticle,String courseOA){
        this.courseBuilder.builderCourseArticle(courseArticle);
        this.courseBuilder.builderCourseName(courseName);
        this.courseBuilder.builderCourseOA(courseOA);
        this.courseBuilder.builderCoursePPT(coursePPT);
        this.courseBuilder.builderCourseVideo(courseVideo);
        return this.courseBuilder.makeCourse();
    }
}
