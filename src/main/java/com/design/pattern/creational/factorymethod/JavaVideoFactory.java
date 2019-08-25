package com.design.pattern.creational.factorymethod;

/**
 * @ClassName JavaVideoFactory
 * @Author chenchen
 * @Date 2019/8/12 20:15
 * @Version 1.0
 **/
public class JavaVideoFactory extends VideoFactory{
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
