package com.design.principle.demeter;

/**
 * @ClassName Test
 * @Author chenchen
 * @Date 2019/8/10 23:03
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        Boss boss=new Boss();
        TeamLeader teamLeader=new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }
}
