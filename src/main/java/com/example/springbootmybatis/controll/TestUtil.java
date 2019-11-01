package com.example.springbootmybatis.controll;


import com.example.springbootmybatis.util.RedisUtil;

import org.springframework.beans.factory.annotation.Autowired;

public class TestUtil {
    @Autowired
    RedisUtil redisUtil;



    public void test(){
        if(redisUtil.hasKey("name")){
            System.err.println(1);
        }else{
            System.err.println("err");
        }
    }

//    public static void main(String[] args) {
//        String[] b = {"1","2","3"};
//        String s = Conver.toStr(b);
//        System.err.println(s);
//        System.err.println(RandomUtil.randomUUID());
//
//    }
}
