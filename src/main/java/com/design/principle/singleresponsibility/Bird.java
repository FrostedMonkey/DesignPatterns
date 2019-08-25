package com.design.principle.singleresponsibility;

/**
 * @ClassName Bird
 * @Author chenchen
 * @Date 2019/8/10 22:15
 * @Version 1.0
 **/
public class Bird {
    public void mainMoveMode(String birdName){
        if("鸵鸟".equals(birdName)){
            System.out.println(birdName+"走");
        }else{
            System.out.println(birdName+"fly");
        }
    }
}
