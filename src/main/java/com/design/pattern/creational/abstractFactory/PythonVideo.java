package com.design.pattern.creational.abstractFactory;

/**
 * @ClassName PythonVideo
 * @Author chenchen
 * @Date 2019/8/12 21:25
 * @Version 1.0
 **/
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制jpython课程视频");
    }
}
