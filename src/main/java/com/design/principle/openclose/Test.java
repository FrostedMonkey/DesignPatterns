package com.design.principle.openclose;

/**
 * @ClassName Test
 * @Author chenchen
 * @Date 2019/8/10 18:27
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        ICourse javaCourse=new javaDiscountCourse(96,"java",348d);
        javaDiscountCourse javaDiscountCourse=(javaDiscountCourse)javaCourse;
        System.out.println("id:"+javaCourse.getId()+" 名字："+javaCourse.getName()+"价格："+javaCourse.getPrice()+"   "+javaDiscountCourse.getOriginPrice());
    }
}
