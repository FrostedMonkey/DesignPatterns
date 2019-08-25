package com.design.pattern.creational.abstractFactory;

/**
 * @ClassName JavaArticle
 * @Author chenchen
 * @Date 2019/8/12 21:24
 * @Version 1.0
 **/
public class JavaArticle extends Article {
    @Override
    public void produce() {
        System.out.println("编写java课程手记");
    }
}
