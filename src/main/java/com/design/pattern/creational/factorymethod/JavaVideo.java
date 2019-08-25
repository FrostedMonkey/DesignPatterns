package com.design.pattern.creational.factorymethod;

/**
 * @ClassName JavaVideo
 * @Author chenchen
 * @Date 2019/8/11 12:54
 * @Version 1.0
 **/
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java视频");
    }
}
