package com.example.springbootmybatis.service.impl;

import com.example.springbootmybatis.bean.TCentreWorkTimeStaff;
import com.example.springbootmybatis.dao.TCentreWorkTimeStaffMapper;
import com.example.springbootmybatis.service.IStaffService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class StaffImpl implements IStaffService {
    @Resource
    private TCentreWorkTimeStaffMapper tCentreWorkTimeStaffMapper;

    /**
     * 查询员工信息
     * @param map
     * @return
     */
    @Transactional(readOnly = true)
    @Override
    public List<TCentreWorkTimeStaff> queryTCentreWorkTimeStaff(Map<String, Object> map) throws Exception {

        return  tCentreWorkTimeStaffMapper.queryTCentreWorkTimeStaff(map);

    }
}
