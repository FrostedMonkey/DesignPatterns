package com.design.pattern.creational.builder;

import lombok.Data;

/**
 * @ClassName Course
 * @Author chenchen
 * @Date 2019/8/14 21:49
 * @Version 1.0
 **/
@Data
public class Course {
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


}
