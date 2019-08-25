package com.design.principle.dependenceinversion;

/**
 * @ClassName Test
 * @Author chenchen
 * @Date 2019/8/10 18:53
 * @Version 1.0
 * 高层次模块
 **/
public class Test {
   /* public static void main(String[] args) {
        zhangSan zhangSan=new zhangSan();
        zhangSan.studyJavaCourse();
        zhangSan.studyC();
    }*/
  /* public static void main(String[] args) {
       zhangSan zhangSan=new zhangSan();
       zhangSan.study(new JavaCourse());
       zhangSan.study(new CCourse());
       zhangSan.study(new PythonCourse());
   }*/
 /*  public static void main(String[] args) {
       zhangSan zhangSan=new zhangSan(new JavaCourse());
       zhangSan.study();
   }*/

    public static void main(String[] args) {
        zhangSan zhangSan=new zhangSan();
        zhangSan.setiCourse(new JavaCourse());
        zhangSan.study();
        zhangSan.setiCourse(new CCourse());
        zhangSan.study();
    }
}
