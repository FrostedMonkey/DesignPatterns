package com.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Boss
 * @Author chenchen
 * @Date 2019/8/10 22:58
 * @Version 1.0
 **/
public class Boss {

  /*  public void commandCheckNumber(TeamLeader teamLeader){
        List<Course> courseList=new ArrayList<>();
        for(int i=0;i<20;i++){
             courseList.add(new Course());
        }
        teamLeader.checkNumberOfCourse(courseList);
    }*/
    public void commandCheckNumber(TeamLeader teamLeader){
        teamLeader.checkNumberOfCourse( );
    }
}
