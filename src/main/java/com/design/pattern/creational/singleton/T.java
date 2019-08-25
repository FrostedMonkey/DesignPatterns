package com.design.pattern.creational.singleton;

/**
 * @ClassName T
 * @Author chenchen
 * @Date 2019/8/24 13:29
 * @Version 1.0
 **/
public class T implements Runnable{
    @Override
    public void run() {
        LazySingleton lazySingleton=LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+" "+lazySingleton);
    }
}
