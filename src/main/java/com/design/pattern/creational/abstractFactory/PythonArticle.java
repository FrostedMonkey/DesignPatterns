package com.design.pattern.creational.abstractFactory;

/**
 * @ClassName PythonArticle
 * @Author chenchen
 * @Date 2019/8/12 21:25
 * @Version 1.0
 **/
public class PythonArticle extends Article{
    @Override
    public void produce() {
        System.out.println("录制python课程手记");
    }
}
