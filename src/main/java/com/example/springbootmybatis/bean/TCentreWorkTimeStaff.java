package com.example.springbootmybatis.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TCentreWorkTimeStaff implements Serializable {
    private String configId;

    private String workTimeId;

    private String staffName;

    private String staffId;

    private String groupId;

    private String groupName;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private Date beganDate;

    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
    private Date endDate;

    private String daySpan;

    private String state;

    private String provinceCode;

    private Date cmosModifyTime;

    public String getConfigId() {
        return configId;
    }

    public void setConfigId(String configId) {
        this.configId = configId == null ? null : configId.trim();
    }

    public String getWorkTimeId() {
        return workTimeId;
    }

    public void setWorkTimeId(String workTimeId) {
        this.workTimeId = workTimeId == null ? null : workTimeId.trim();
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId == null ? null : staffId.trim();
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    public String getBeganDate() {
        return beganDate == null ? null : new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(beganDate);
    }

    public void setBeganDate(Date beganDate) {
        this.beganDate = beganDate;
    }

    public String getEndDate() {
        return endDate == null ? null : new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(endDate);
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getDaySpan() {
        return daySpan;
    }

    public void setDaySpan(String daySpan) {
        this.daySpan = daySpan == null ? null : daySpan.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode == null ? null : provinceCode.trim();
    }

    public Date getCmosModifyTime() {
        return cmosModifyTime;
    }

    public void setCmosModifyTime(Date cmosModifyTime) {
        this.cmosModifyTime = cmosModifyTime;
    }
}