package com.design.principle.singleresponsibility;

/**
 * @ClassName test
 * @Author chenchen
 * @Date 2019/8/10 22:15
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
      /*  Bird bird=new Bird();
        bird.mainMoveMode("大雁");
        bird.mainMoveMode("鸵鸟");*/
      FlyBird flyBird=new FlyBird();
      flyBird.mainMoveMode("大雁");
      WalkBird walkBird=new WalkBird();
      walkBird.mainMoveMode("鸵鸟");
    }
}
