package com.design.principle.singleresponsibility;

/**
 * @ClassName Method
 * @Author chenchen
 * @Date 2019/8/10 22:28
 * @Version 1.0
 **/
public class Method {
    private void updateUserInfo(String userName,String address){
        userName="Two";
        address="beijing";
    }
    private void updateUserInfo(String userName,String... properties){
        userName="李四";
    }

    private void updateUserName(String userName){
        userName="Two";
    }

    private void updateUserAddress(String address){
        address="Two";
    }

    private void updateUserInfo(String userName,String address,boolean bool){
        if(bool){
            //todo something1
        }else{
            //todo something2
        }
        userName="Two";
        address="beijing";
    }
}
