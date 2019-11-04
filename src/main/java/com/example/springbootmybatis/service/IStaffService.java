package com.example.springbootmybatis.service;

import com.example.springbootmybatis.bean.TCentreWorkTimeStaff;

import java.util.List;
import java.util.Map;

public interface IStaffService {
    /**
     * 查询员工信息
     * @param map
     * @return
     */
    List<TCentreWorkTimeStaff> queryTCentreWorkTimeStaff(Map<String, Object> map) throws Exception;
}
