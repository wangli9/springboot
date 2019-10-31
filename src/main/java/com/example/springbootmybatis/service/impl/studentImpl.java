package com.example.springbootmybatis.service.impl;

import com.example.springbootmybatis.bean.Student;
import com.example.springbootmybatis.dao.IstudentDao;
import com.example.springbootmybatis.service.IstudentService;
import org.apache.commons.collections.MapUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class studentImpl implements IstudentService {
    @Resource
    private IstudentDao istudentDao;
    @Override
    public List<Student> query(Map<String,Object> map) {
        Map<String,Object> map1 = new HashMap<>();
        map1.put("name", MapUtils.getString(map,"name"));
        map1.put("age",MapUtils.getString(map,"age"));
        return istudentDao.query(map1);
    }
}
