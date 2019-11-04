package com.example.springbootmybatis.dao;

import com.example.springbootmybatis.bean.TCentreWorkTimeStaff;
import com.example.springbootmybatis.bean.TCentreWorkTimeStaffExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface TCentreWorkTimeStaffMapper {
    long countByExample(TCentreWorkTimeStaffExample example);

    int deleteByExample(TCentreWorkTimeStaffExample example);

    int deleteByPrimaryKey(String configId);

    int insert(TCentreWorkTimeStaff record);

    int insertSelective(TCentreWorkTimeStaff record);

    List<TCentreWorkTimeStaff> selectByExample(TCentreWorkTimeStaffExample example);

    TCentreWorkTimeStaff selectByPrimaryKey(String configId);

    int updateByExampleSelective(@Param("record") TCentreWorkTimeStaff record, @Param("example") TCentreWorkTimeStaffExample example);

    int updateByExample(@Param("record") TCentreWorkTimeStaff record, @Param("example") TCentreWorkTimeStaffExample example);

    int updateByPrimaryKeySelective(TCentreWorkTimeStaff record);

    int updateByPrimaryKey(TCentreWorkTimeStaff record);

    /**
     * 查询
     * @param map
     * @return
     */
    List<TCentreWorkTimeStaff> queryTCentreWorkTimeStaff(Map<String, Object> map);
}