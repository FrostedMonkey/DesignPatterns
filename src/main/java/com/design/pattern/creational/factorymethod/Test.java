package com.design.pattern.creational.factorymethod;

/**
 * @ClassName Test
 * @Author chenchen
 * @Date 2019/8/11 12:55
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory=new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
        VideoFactory videoFactory1=new PythonVideoFactory();
        Video video1 = videoFactory1.getVideo();
        video1.produce();
    }
}
