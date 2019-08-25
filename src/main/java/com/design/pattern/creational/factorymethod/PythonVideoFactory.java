package com.design.pattern.creational.factorymethod;

/**
 * @ClassName PathonVideoFactory
 * @Author chenchen
 * @Date 2019/8/12 20:16
 * @Version 1.0
 **/
public class PythonVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
