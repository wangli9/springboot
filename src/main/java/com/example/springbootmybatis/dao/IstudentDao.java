package com.example.springbootmybatis.dao;

import com.example.springbootmybatis.bean.Student;

import java.util.List;
import java.util.Map;

public interface IstudentDao {
    List<Student> query(Map<String,Object> map);
}
