package com.example.springbootmybatis.controll;


import com.example.springbootmybatis.bean.Student;
import com.example.springbootmybatis.service.IstudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class studentControl {

    @Resource
    private IstudentService istudentService;


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
        return istudentService.query(map);
    }
}
