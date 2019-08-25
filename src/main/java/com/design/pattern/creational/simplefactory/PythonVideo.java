package com.design.pattern.creational.simplefactory;

/**
 * @ClassName PythonVideo
 * @Author chenchen
 * @Date 2019/8/11 12:54
 * @Version 1.0
 **/
public class PythonVideo extends Video{
    @Override
    public void produce() {
        System.out.println("录制python视频");
    }
}
