package com.design.principle.singleresponsibility;

/**
 * @ClassName CourseImpl
 * @Author chenchen
 * @Date 2019/8/10 22:26
 * @Version 1.0
 **/
public class CourseImpl implements ICourseManager,ICourseContent{

    @Override
    public String getCoursename() {
        return null;
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }

    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }
}
