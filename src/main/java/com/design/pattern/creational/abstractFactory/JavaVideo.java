package com.design.pattern.creational.abstractFactory;

/**
 * @ClassName JavaVideo
 * @Author chenchen
 * @Date 2019/8/12 21:23
 * @Version 1.0
 **/
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制java视频");
    }
}
