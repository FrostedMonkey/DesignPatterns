package com.design.pattern.creational.simplefactory;

/**
 * @ClassName VideoFactory
 * @Author chenchen
 * @Date 2019/8/11 12:57
 * @Version 1.0
 **/
public class VideoFactory {
   /* public Video getVideo(String type){
        if("java".equalsIgnoreCase(type)){
            return new JavaVideo();
        }else if("python".equalsIgnoreCase(type)){
            return new PythonVideo();
        }else{
            return null;
        }
    }*/
   public Video getVideo(Class c){
       Video video=null;

       try{
           video=(Video) Class.forName(c.getName()).newInstance();
       } catch (IllegalAccessException e) {
           e.printStackTrace();
       } catch (InstantiationException e) {
           e.printStackTrace();
       } catch (ClassNotFoundException e) {
           e.printStackTrace();
       }
       return video;
   }
}
