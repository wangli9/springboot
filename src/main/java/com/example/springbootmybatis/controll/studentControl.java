package com.example.springbootmybatis.controll;


import com.example.springbootmybatis.bean.Student;
import com.example.springbootmybatis.service.IstudentService;
import com.example.springbootmybatis.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class studentControl {

    @Resource
    private IstudentService istudentService;

    @Autowired
    RedisUtil redisUtil;


    @RequestMapping("/query")
    public List<Student> query(String name,Integer age , String id){
        Map<String,Object> map = new HashMap<>();
        map.put("name",name);
        map.put("age",age);
        map.put("id",id);
        return istudentService.query(map);
    }

    @PostMapping("/select")
    public List<Student> select(@RequestBody Map<String,Object> map){
//        redisUtil.lSet("nn",istudentService.query(map));
        if(redisUtil.hasKey("nn")){
            List<Object> list = redisUtil.lGet("nn",0,10);
            List<Student> list1 = new ArrayList<>();
            for (Object o: list) {
                if(((ArrayList) o).get(0) instanceof Student){
                    Student s = (Student) ((ArrayList) o).get(0);
                    list1.add(s);
                }
            }
           return list1;
        }else{
            return istudentService.query(map);
        }
    }
}
