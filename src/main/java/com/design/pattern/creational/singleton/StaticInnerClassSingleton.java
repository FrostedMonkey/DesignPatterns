package com.design.pattern.creational.singleton;

/**
 * @ClassName StaticInnerClassSingleton
 * @Author chenchen
 * @Date 2019/8/24 17:36
 * @Version 1.0
 **/
public class StaticInnerClassSingleton {
    private static class InnerClass{
        private static StaticInnerClassSingleton staticInnerClassSingleton=new StaticInnerClassSingleton();
    }
    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.staticInnerClassSingleton;
    }
    private StaticInnerClassSingleton(){}
}
