package com.example.springbootmybatis.controll;


import com.example.springbootmybatis.bean.Student;
import com.example.springbootmybatis.util.RedisUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

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

    public static void main(String[] args) {


        Assert.notNull("","message is null");




        /**
         * ---批量插入数据
         */

//        for(int i=3;i<10000;i++) {
//            Student student = new Student();
//            student.setId(""+i);
//            student.setName("沉思的尺寸"+i);
//            student.setAge(12);
//
//        }

//        String[] b = {"1","2","3"};
//        String s = Conver.toStr(b);
//        System.err.println(s);
//        System.err.println(RandomUtil.randomUUID());

    }
}
