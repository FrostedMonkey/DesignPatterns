package com.design.principle.singleresponsibility;

public interface ICourse {
    /**
     * 此时ICourse就有两个职责
     * 1、课程信息
     * 2、学/退课程
     */
    /**
     * 获得课程信息
     * @return
     */
    String getCoursename();
    byte[] getCourseVideo();

    /**
     * 学和退影响获得课程信息
     */
    void studyCourse();
    void refundCourse();
}
