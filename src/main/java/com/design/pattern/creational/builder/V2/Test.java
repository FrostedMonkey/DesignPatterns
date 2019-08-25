package com.design.pattern.creational.builder.V2;

import java.util.*;

/**
 * @ClassName Test
 * @Author chenchen
 * @Date 2019/8/14 22:38
 * @Version 1.0
 * 链式调用
 * 可以按需调用比之前的更加灵活因为builderCourseXXX返回的还是一个CourseBuilder在创建完成之后再调用build方法返回一个Course
 **/
public class Test {
    public static void main(String[] args) {
        Integer a=59;
        int a2=59;
        Integer a3=Integer.valueOf(59);
        Integer a4=new Integer(59);
     /*   System.out.println(a==a2);
        System.out.println(a==a3);
        System.out.println(a3==a4);
        System.out.println(a2==a4);*/

       /* char ch1,ch2;
        ch1='D'+'8'-'3';
        ch2='9'-'1';
        System.out.println(ch1+" "+ch2);
        System.out.println(ch2);*/
        ((Test)null).a();
    }
    public static void a(){
        System.out.println("a");
    }
            

    public static int switchin(int i){
        int j=1;
        switch (i){
            case 1:j++;
            case 2:j++;
            case 3:j++;
            case 4:j++;

            case 5:j++;
            default:j++;
        }
        return j;
    }
}
