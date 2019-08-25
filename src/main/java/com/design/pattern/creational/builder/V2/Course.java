package com.design.pattern.creational.builder.V2;

/**
 * @ClassName Course
 * @Author chenchen
 * @Date 2019/8/14 22:31
 * @Version 1.0
 * 把具体的实体类，和实体类builder创建在一起（通过内部类的形式）
 **/
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
    public Course(CourseBuilder courseBuilder){
        this.courseName=courseBuilder.courseName;
        this.coursePPT=courseBuilder.coursePPT;
        this.courseVideo=courseBuilder.courseVideo;
        this.courseArticle=courseBuilder.courseArticle;
        this.courseOA=courseBuilder.courseOA;
    }
    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", coursePPT='" + coursePPT + '\'' +
                ", courseVideo='" + courseVideo + '\'' +
                ", courseArticle='" + courseArticle + '\'' +
                ", courseOA='" + courseOA + '\'' +
                '}';
    }
    public static class CourseBuilder{
        private String courseName;
        private String coursePPT;
        private String courseVideo;
        private String courseArticle;
        private String courseOA;

        public CourseBuilder builderCourseName(String courseName) {
            this.courseName=courseName;
            return this;
        }

        public CourseBuilder builderCoursePPT(String coursePPT) {
            this.coursePPT=coursePPT;
            return this;
        }

        public CourseBuilder builderCourseVideo(String courseVideo) {
            this.courseVideo=courseVideo;
            return this;

        }

        public CourseBuilder builderCourseArticle(String courseArticle) {
            this.courseArticle=courseArticle;
            return this;
        }

        public CourseBuilder builderCourseOA(String courseOA){
            this.courseOA=courseOA;
            return this;
        }
        public Course build(){
            return new Course(this);
        }
    }
}
