package com.example.springbootmybatis.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TCentreWorkTimeStaffExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCentreWorkTimeStaffExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andConfigIdIsNull() {
            addCriterion("CONFIG_ID is null");
            return (Criteria) this;
        }

        public Criteria andConfigIdIsNotNull() {
            addCriterion("CONFIG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andConfigIdEqualTo(String value) {
            addCriterion("CONFIG_ID =", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdNotEqualTo(String value) {
            addCriterion("CONFIG_ID <>", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdGreaterThan(String value) {
            addCriterion("CONFIG_ID >", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIG_ID >=", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdLessThan(String value) {
            addCriterion("CONFIG_ID <", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdLessThanOrEqualTo(String value) {
            addCriterion("CONFIG_ID <=", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdLike(String value) {
            addCriterion("CONFIG_ID like", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdNotLike(String value) {
            addCriterion("CONFIG_ID not like", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdIn(List<String> values) {
            addCriterion("CONFIG_ID in", values, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdNotIn(List<String> values) {
            addCriterion("CONFIG_ID not in", values, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdBetween(String value1, String value2) {
            addCriterion("CONFIG_ID between", value1, value2, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdNotBetween(String value1, String value2) {
            addCriterion("CONFIG_ID not between", value1, value2, "configId");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIdIsNull() {
            addCriterion("WORK_TIME_ID is null");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIdIsNotNull() {
            addCriterion("WORK_TIME_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIdEqualTo(String value) {
            addCriterion("WORK_TIME_ID =", value, "workTimeId");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIdNotEqualTo(String value) {
            addCriterion("WORK_TIME_ID <>", value, "workTimeId");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIdGreaterThan(String value) {
            addCriterion("WORK_TIME_ID >", value, "workTimeId");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIdGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_TIME_ID >=", value, "workTimeId");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIdLessThan(String value) {
            addCriterion("WORK_TIME_ID <", value, "workTimeId");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIdLessThanOrEqualTo(String value) {
            addCriterion("WORK_TIME_ID <=", value, "workTimeId");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIdLike(String value) {
            addCriterion("WORK_TIME_ID like", value, "workTimeId");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIdNotLike(String value) {
            addCriterion("WORK_TIME_ID not like", value, "workTimeId");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIdIn(List<String> values) {
            addCriterion("WORK_TIME_ID in", values, "workTimeId");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIdNotIn(List<String> values) {
            addCriterion("WORK_TIME_ID not in", values, "workTimeId");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIdBetween(String value1, String value2) {
            addCriterion("WORK_TIME_ID between", value1, value2, "workTimeId");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIdNotBetween(String value1, String value2) {
            addCriterion("WORK_TIME_ID not between", value1, value2, "workTimeId");
            return (Criteria) this;
        }

        public Criteria andStaffNameIsNull() {
            addCriterion("STAFF_NAME is null");
            return (Criteria) this;
        }

        public Criteria andStaffNameIsNotNull() {
            addCriterion("STAFF_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andStaffNameEqualTo(String value) {
            addCriterion("STAFF_NAME =", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotEqualTo(String value) {
            addCriterion("STAFF_NAME <>", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThan(String value) {
            addCriterion("STAFF_NAME >", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThanOrEqualTo(String value) {
            addCriterion("STAFF_NAME >=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThan(String value) {
            addCriterion("STAFF_NAME <", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThanOrEqualTo(String value) {
            addCriterion("STAFF_NAME <=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLike(String value) {
            addCriterion("STAFF_NAME like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotLike(String value) {
            addCriterion("STAFF_NAME not like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameIn(List<String> values) {
            addCriterion("STAFF_NAME in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotIn(List<String> values) {
            addCriterion("STAFF_NAME not in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameBetween(String value1, String value2) {
            addCriterion("STAFF_NAME between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotBetween(String value1, String value2) {
            addCriterion("STAFF_NAME not between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNull() {
            addCriterion("STAFF_ID is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNotNull() {
            addCriterion("STAFF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdEqualTo(String value) {
            addCriterion("STAFF_ID =", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotEqualTo(String value) {
            addCriterion("STAFF_ID <>", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThan(String value) {
            addCriterion("STAFF_ID >", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThanOrEqualTo(String value) {
            addCriterion("STAFF_ID >=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThan(String value) {
            addCriterion("STAFF_ID <", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThanOrEqualTo(String value) {
            addCriterion("STAFF_ID <=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLike(String value) {
            addCriterion("STAFF_ID like", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotLike(String value) {
            addCriterion("STAFF_ID not like", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIn(List<String> values) {
            addCriterion("STAFF_ID in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotIn(List<String> values) {
            addCriterion("STAFF_ID not in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdBetween(String value1, String value2) {
            addCriterion("STAFF_ID between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotBetween(String value1, String value2) {
            addCriterion("STAFF_ID not between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNull() {
            addCriterion("GROUP_ID is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("GROUP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(String value) {
            addCriterion("GROUP_ID =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(String value) {
            addCriterion("GROUP_ID <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(String value) {
            addCriterion("GROUP_ID >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("GROUP_ID >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(String value) {
            addCriterion("GROUP_ID <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(String value) {
            addCriterion("GROUP_ID <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLike(String value) {
            addCriterion("GROUP_ID like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotLike(String value) {
            addCriterion("GROUP_ID not like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<String> values) {
            addCriterion("GROUP_ID in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<String> values) {
            addCriterion("GROUP_ID not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(String value1, String value2) {
            addCriterion("GROUP_ID between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(String value1, String value2) {
            addCriterion("GROUP_ID not between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNull() {
            addCriterion("GROUP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNotNull() {
            addCriterion("GROUP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andGroupNameEqualTo(String value) {
            addCriterion("GROUP_NAME =", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotEqualTo(String value) {
            addCriterion("GROUP_NAME <>", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThan(String value) {
            addCriterion("GROUP_NAME >", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("GROUP_NAME >=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThan(String value) {
            addCriterion("GROUP_NAME <", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThanOrEqualTo(String value) {
            addCriterion("GROUP_NAME <=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLike(String value) {
            addCriterion("GROUP_NAME like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotLike(String value) {
            addCriterion("GROUP_NAME not like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameIn(List<String> values) {
            addCriterion("GROUP_NAME in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotIn(List<String> values) {
            addCriterion("GROUP_NAME not in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameBetween(String value1, String value2) {
            addCriterion("GROUP_NAME between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotBetween(String value1, String value2) {
            addCriterion("GROUP_NAME not between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andBeganDateIsNull() {
            addCriterion("BEGAN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andBeganDateIsNotNull() {
            addCriterion("BEGAN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andBeganDateEqualTo(Date value) {
            addCriterion("BEGAN_DATE =", value, "beganDate");
            return (Criteria) this;
        }

        public Criteria andBeganDateNotEqualTo(Date value) {
            addCriterion("BEGAN_DATE <>", value, "beganDate");
            return (Criteria) this;
        }

        public Criteria andBeganDateGreaterThan(Date value) {
            addCriterion("BEGAN_DATE >", value, "beganDate");
            return (Criteria) this;
        }

        public Criteria andBeganDateGreaterThanOrEqualTo(Date value) {
            addCriterion("BEGAN_DATE >=", value, "beganDate");
            return (Criteria) this;
        }

        public Criteria andBeganDateLessThan(Date value) {
            addCriterion("BEGAN_DATE <", value, "beganDate");
            return (Criteria) this;
        }

        public Criteria andBeganDateLessThanOrEqualTo(Date value) {
            addCriterion("BEGAN_DATE <=", value, "beganDate");
            return (Criteria) this;
        }

        public Criteria andBeganDateIn(List<Date> values) {
            addCriterion("BEGAN_DATE in", values, "beganDate");
            return (Criteria) this;
        }

        public Criteria andBeganDateNotIn(List<Date> values) {
            addCriterion("BEGAN_DATE not in", values, "beganDate");
            return (Criteria) this;
        }

        public Criteria andBeganDateBetween(Date value1, Date value2) {
            addCriterion("BEGAN_DATE between", value1, value2, "beganDate");
            return (Criteria) this;
        }

        public Criteria andBeganDateNotBetween(Date value1, Date value2) {
            addCriterion("BEGAN_DATE not between", value1, value2, "beganDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterion("END_DATE =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterion("END_DATE <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterion("END_DATE >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("END_DATE >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterion("END_DATE <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterion("END_DATE <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterion("END_DATE in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterion("END_DATE not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterion("END_DATE between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterion("END_DATE not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andDaySpanIsNull() {
            addCriterion("DAY_SPAN is null");
            return (Criteria) this;
        }

        public Criteria andDaySpanIsNotNull() {
            addCriterion("DAY_SPAN is not null");
            return (Criteria) this;
        }

        public Criteria andDaySpanEqualTo(String value) {
            addCriterion("DAY_SPAN =", value, "daySpan");
            return (Criteria) this;
        }

        public Criteria andDaySpanNotEqualTo(String value) {
            addCriterion("DAY_SPAN <>", value, "daySpan");
            return (Criteria) this;
        }

        public Criteria andDaySpanGreaterThan(String value) {
            addCriterion("DAY_SPAN >", value, "daySpan");
            return (Criteria) this;
        }

        public Criteria andDaySpanGreaterThanOrEqualTo(String value) {
            addCriterion("DAY_SPAN >=", value, "daySpan");
            return (Criteria) this;
        }

        public Criteria andDaySpanLessThan(String value) {
            addCriterion("DAY_SPAN <", value, "daySpan");
            return (Criteria) this;
        }

        public Criteria andDaySpanLessThanOrEqualTo(String value) {
            addCriterion("DAY_SPAN <=", value, "daySpan");
            return (Criteria) this;
        }

        public Criteria andDaySpanLike(String value) {
            addCriterion("DAY_SPAN like", value, "daySpan");
            return (Criteria) this;
        }

        public Criteria andDaySpanNotLike(String value) {
            addCriterion("DAY_SPAN not like", value, "daySpan");
            return (Criteria) this;
        }

        public Criteria andDaySpanIn(List<String> values) {
            addCriterion("DAY_SPAN in", values, "daySpan");
            return (Criteria) this;
        }

        public Criteria andDaySpanNotIn(List<String> values) {
            addCriterion("DAY_SPAN not in", values, "daySpan");
            return (Criteria) this;
        }

        public Criteria andDaySpanBetween(String value1, String value2) {
            addCriterion("DAY_SPAN between", value1, value2, "daySpan");
            return (Criteria) this;
        }

        public Criteria andDaySpanNotBetween(String value1, String value2) {
            addCriterion("DAY_SPAN not between", value1, value2, "daySpan");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("STATE like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("STATE not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIsNull() {
            addCriterion("PROVINCE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIsNotNull() {
            addCriterion("PROVINCE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeEqualTo(String value) {
            addCriterion("PROVINCE_CODE =", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotEqualTo(String value) {
            addCriterion("PROVINCE_CODE <>", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeGreaterThan(String value) {
            addCriterion("PROVINCE_CODE >", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PROVINCE_CODE >=", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLessThan(String value) {
            addCriterion("PROVINCE_CODE <", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLessThanOrEqualTo(String value) {
            addCriterion("PROVINCE_CODE <=", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLike(String value) {
            addCriterion("PROVINCE_CODE like", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotLike(String value) {
            addCriterion("PROVINCE_CODE not like", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIn(List<String> values) {
            addCriterion("PROVINCE_CODE in", values, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotIn(List<String> values) {
            addCriterion("PROVINCE_CODE not in", values, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeBetween(String value1, String value2) {
            addCriterion("PROVINCE_CODE between", value1, value2, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotBetween(String value1, String value2) {
            addCriterion("PROVINCE_CODE not between", value1, value2, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andCmosModifyTimeIsNull() {
            addCriterion("cmos_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andCmosModifyTimeIsNotNull() {
            addCriterion("cmos_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andCmosModifyTimeEqualTo(Date value) {
            addCriterion("cmos_modify_time =", value, "cmosModifyTime");
            return (Criteria) this;
        }

        public Criteria andCmosModifyTimeNotEqualTo(Date value) {
            addCriterion("cmos_modify_time <>", value, "cmosModifyTime");
            return (Criteria) this;
        }

        public Criteria andCmosModifyTimeGreaterThan(Date value) {
            addCriterion("cmos_modify_time >", value, "cmosModifyTime");
            return (Criteria) this;
        }

        public Criteria andCmosModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cmos_modify_time >=", value, "cmosModifyTime");
            return (Criteria) this;
        }

        public Criteria andCmosModifyTimeLessThan(Date value) {
            addCriterion("cmos_modify_time <", value, "cmosModifyTime");
            return (Criteria) this;
        }

        public Criteria andCmosModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("cmos_modify_time <=", value, "cmosModifyTime");
            return (Criteria) this;
        }

        public Criteria andCmosModifyTimeIn(List<Date> values) {
            addCriterion("cmos_modify_time in", values, "cmosModifyTime");
            return (Criteria) this;
        }

        public Criteria andCmosModifyTimeNotIn(List<Date> values) {
            addCriterion("cmos_modify_time not in", values, "cmosModifyTime");
            return (Criteria) this;
        }

        public Criteria andCmosModifyTimeBetween(Date value1, Date value2) {
            addCriterion("cmos_modify_time between", value1, value2, "cmosModifyTime");
            return (Criteria) this;
        }

        public Criteria andCmosModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("cmos_modify_time not between", value1, value2, "cmosModifyTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}