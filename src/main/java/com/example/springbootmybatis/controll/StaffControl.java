package com.example.springbootmybatis.controll;


import com.example.springbootmybatis.bean.TCentreWorkTimeStaff;
import com.example.springbootmybatis.service.IStaffService;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class StaffControl {

    private static Logger logger = Logger.getLogger(StaffControl.class);

    @Resource
    private IStaffService iStaffService;

    @RequestMapping(value = "/queryTCentreWorkTimeStaff",method = RequestMethod.POST)
    public List<TCentreWorkTimeStaff> queryTCentreWorkTimeStaff(@RequestBody Map<String,Object> map){
        logger.info("查询员工信息入参："+map.toString());
        List<TCentreWorkTimeStaff> list = null;
        try {
            list = iStaffService.queryTCentreWorkTimeStaff(map);
            logger.error("查询员工信息返回报文："+list.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @RequestMapping(value = "/insertTCentreWorkTimeStaff",method = RequestMethod.POST)
    public List<TCentreWorkTimeStaff> insertTCentreWorkTimeStaff(@RequestBody TCentreWorkTimeStaff tCentreWorkTimeStaff){
        List<TCentreWorkTimeStaff> list = null;
        try {
            list = iStaffService.queryTCentreWorkTimeStaff(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

}
