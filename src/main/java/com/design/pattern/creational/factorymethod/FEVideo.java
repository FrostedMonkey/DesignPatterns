package com.design.pattern.creational.factorymethod;

/**
 * @ClassName FEVideo
 * @Author chenchen
 * @Date 2019/8/12 20:20
 * @Version 1.0
 **/
public class FEVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制FE视频");
    }
}
