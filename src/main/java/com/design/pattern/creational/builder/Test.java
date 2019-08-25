package com.design.pattern.creational.builder;

/**
 * @ClassName Test
 * @Author chenchen
 * @Date 2019/8/14 22:17
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder=new CourseActualBuilder();
        Coach coach=new Coach();
        coach.setCourseBuilder(courseBuilder);
        Course course=coach.makeCourse("java","PPT","Video","Article","OA");
        System.out.println(course);
    }
}
