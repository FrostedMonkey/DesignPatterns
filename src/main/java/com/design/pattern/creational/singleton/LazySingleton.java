package com.design.pattern.creational.singleton;

/**
 * @ClassName LazySingleton
 * @Author chenchen
 * @Date 2019/8/24 13:24
 * @Version 1.0
 **/
public class LazySingleton {
    private static LazySingleton lazySingleton=null;
    private LazySingleton(){

    }
    //V1
    /*public  static LazySingleton getInstance(){
        //线程不安全
        if(lazySingleton==null){
            lazySingleton=new LazySingleton();
        }
        return lazySingleton;
    }*/
    //V2
    public synchronized static LazySingleton getInstance(){
        //线程不安全
        if(lazySingleton==null){
            lazySingleton=new LazySingleton();
        }
        return lazySingleton;
    }
}
