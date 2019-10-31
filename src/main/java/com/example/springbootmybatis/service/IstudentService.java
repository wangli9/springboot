package com.example.springbootmybatis.service;

import com.example.springbootmybatis.bean.Student;

import java.util.List;
import java.util.Map;

public interface IstudentService {

    List<Student> query(Map<String,Object> map);
}
