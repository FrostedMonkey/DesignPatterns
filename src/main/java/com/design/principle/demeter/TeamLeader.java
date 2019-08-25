package com.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName TeamLeader
 * @Author chenchen
 * @Date 2019/8/10 22:58
 * @Version 1.0
 **/
public class TeamLeader {
    public void checkNumberOfCourse(){
        List<Course> courseList=new ArrayList<>();
        for(int i=0;i<20;i++){
            courseList.add(new Course());
        }
        System.out.println("数量为："+courseList.size());

    }
}
