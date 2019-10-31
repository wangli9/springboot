package com.example.springbootmybatis.controll;

import com.example.springbootmybatis.bean.Student;
import com.example.springbootmybatis.service.IstudentService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *  定时任务
 */
@Component
public class ScheduledControl {

    @Resource
    private IstudentService istudentService;
    @Async
    @Scheduled(fixedDelay = 500000)
    public void test(){
//        Map map = new HashMap();
//        map.put("name","王大雷");
//        map.put("age",22);
//        List<Student> list = istudentService.query(map);
        System.err.println("fixedDelay==========1");
    }
    @Async
    @Scheduled(fixedRate = 500000)
    public void test1(){
        System.err.println("fixedRate============2");
    }
//    @Async
//    @Scheduled(cron = "0/5 * * * * *")
//    public void test3(){
//        System.err.println("cron==============3");
//    }
}
