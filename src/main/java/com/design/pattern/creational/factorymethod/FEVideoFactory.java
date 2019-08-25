package com.design.pattern.creational.factorymethod;

/**
 * @ClassName FEVideoFactory
 * @Author chenchen
 * @Date 2019/8/12 20:21
 * @Version 1.0
 **/
public class FEVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new FEVideo();
    }
}
