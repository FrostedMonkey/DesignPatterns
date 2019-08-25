package com.design.pattern.creational.singleton;

/**
 * @ClassName Test
 * @Author chenchen
 * @Date 2019/8/24 13:26
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
       // LazySingleton lazySingleton=LazySingleton.getInstance();
        Thread t1=new Thread(new T());
        Thread t2=new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("ok");
    }
}
