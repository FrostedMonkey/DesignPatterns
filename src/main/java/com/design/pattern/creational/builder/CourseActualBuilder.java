package com.design.pattern.creational.builder;

/**
 * @ClassName CourseActualBuilder
 * @Author chenchen
 * @Date 2019/8/14 22:03
 * @Version 1.0
 **/
public class CourseActualBuilder extends CourseBuilder {
    private Course course=new Course();

    @Override
    public void builderCourseName(String courseName) {
        course.setCourseName(courseName);
    }

    @Override
    public void builderCoursePPT(String coursePPT) {
        course.setCoursePPT(coursePPT);
    }

    @Override
    public void builderCourseVideo(String courseVideo) {
        course.setCourseVideo(courseVideo);
    }

    @Override
    public void builderCourseArticle(String courseArticle) {
        course.setCourseArticle(courseArticle);
    }

    @Override
    public void builderCourseOA(String courseOA) {
        course.setCourseOA(courseOA);
    }

    @Override
    public Course makeCourse() {
        return course;
    }
}
