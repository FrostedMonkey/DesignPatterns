package com.design.pattern.creational.simplefactory;

/**
 * @ClassName Test
 * @Author chenchen
 * @Date 2019/8/11 12:55
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
       /* VideoFactory videoFactory=new VideoFactory();
        Video video=videoFactory.getVideo("java");
        if(video==null){
            return;
        }
        video.produce();*/

        VideoFactory videoFactory=new VideoFactory();
        Video video=videoFactory.getVideo(JavaVideo.class);
        if(video==null){
            return;
        }
        video.produce();
    }
}
