package com.hxzy.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TbDepartmentExample{

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbDepartmentExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDtNameIsNull() {
            addCriterion("dt_name is null");
            return (Criteria) this;
        }

        public Criteria andDtNameIsNotNull() {
            addCriterion("dt_name is not null");
            return (Criteria) this;
        }

        public Criteria andDtNameEqualTo(String value) {
            addCriterion("dt_name =", value, "dtName");
            return (Criteria) this;
        }

        public Criteria andDtNameNotEqualTo(String value) {
            addCriterion("dt_name <>", value, "dtName");
            return (Criteria) this;
        }

        public Criteria andDtNameGreaterThan(String value) {
            addCriterion("dt_name >", value, "dtName");
            return (Criteria) this;
        }

        public Criteria andDtNameGreaterThanOrEqualTo(String value) {
            addCriterion("dt_name >=", value, "dtName");
            return (Criteria) this;
        }

        public Criteria andDtNameLessThan(String value) {
            addCriterion("dt_name <", value, "dtName");
            return (Criteria) this;
        }

        public Criteria andDtNameLessThanOrEqualTo(String value) {
            addCriterion("dt_name <=", value, "dtName");
            return (Criteria) this;
        }

        public Criteria andDtNameLike(String value) {
            addCriterion("dt_name like", value, "dtName");
            return (Criteria) this;
        }

        public Criteria andDtNameNotLike(String value) {
            addCriterion("dt_name not like", value, "dtName");
            return (Criteria) this;
        }

        public Criteria andDtNameIn(List<String> values) {
            addCriterion("dt_name in", values, "dtName");
            return (Criteria) this;
        }

        public Criteria andDtNameNotIn(List<String> values) {
            addCriterion("dt_name not in", values, "dtName");
            return (Criteria) this;
        }

        public Criteria andDtNameBetween(String value1, String value2) {
            addCriterion("dt_name between", value1, value2, "dtName");
            return (Criteria) this;
        }

        public Criteria andDtNameNotBetween(String value1, String value2) {
            addCriterion("dt_name not between", value1, value2, "dtName");
            return (Criteria) this;
        }

        public Criteria andDtCreatetimeIsNull() {
            addCriterion("dt_createTime is null");
            return (Criteria) this;
        }

        public Criteria andDtCreatetimeIsNotNull() {
            addCriterion("dt_createTime is not null");
            return (Criteria) this;
        }

        public Criteria andDtCreatetimeEqualTo(String value) {
            addCriterion("dt_createTime =", value, "dtCreatetime");
            return (Criteria) this;
        }

        public Criteria andDtCreatetimeNotEqualTo(String value) {
            addCriterion("dt_createTime <>", value, "dtCreatetime");
            return (Criteria) this;
        }

        public Criteria andDtCreatetimeGreaterThan(String value) {
            addCriterion("dt_createTime >", value, "dtCreatetime");
            return (Criteria) this;
        }

        public Criteria andDtCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("dt_createTime >=", value, "dtCreatetime");
            return (Criteria) this;
        }

        public Criteria andDtCreatetimeLessThan(String value) {
            addCriterion("dt_createTime <", value, "dtCreatetime");
            return (Criteria) this;
        }

        public Criteria andDtCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("dt_createTime <=", value, "dtCreatetime");
            return (Criteria) this;
        }

        public Criteria andDtCreatetimeLike(String value) {
            addCriterion("dt_createTime like", value, "dtCreatetime");
            return (Criteria) this;
        }

        public Criteria andDtCreatetimeNotLike(String value) {
            addCriterion("dt_createTime not like", value, "dtCreatetime");
            return (Criteria) this;
        }

        public Criteria andDtCreatetimeIn(List<String> values) {
            addCriterion("dt_createTime in", values, "dtCreatetime");
            return (Criteria) this;
        }

        public Criteria andDtCreatetimeNotIn(List<String> values) {
            addCriterion("dt_createTime not in", values, "dtCreatetime");
            return (Criteria) this;
        }

        public Criteria andDtCreatetimeBetween(String value1, String value2) {
            addCriterion("dt_createTime between", value1, value2, "dtCreatetime");
            return (Criteria) this;
        }

        public Criteria andDtCreatetimeNotBetween(String value1, String value2) {
            addCriterion("dt_createTime not between", value1, value2, "dtCreatetime");
            return (Criteria) this;
        }

        public Criteria andDtBzIsNull() {
            addCriterion("dt_bz is null");
            return (Criteria) this;
        }

        public Criteria andDtBzIsNotNull() {
            addCriterion("dt_bz is not null");
            return (Criteria) this;
        }

        public Criteria andDtBzEqualTo(String value) {
            addCriterion("dt_bz =", value, "dtBz");
            return (Criteria) this;
        }

        public Criteria andDtBzNotEqualTo(String value) {
            addCriterion("dt_bz <>", value, "dtBz");
            return (Criteria) this;
        }

        public Criteria andDtBzGreaterThan(String value) {
            addCriterion("dt_bz >", value, "dtBz");
            return (Criteria) this;
        }

        public Criteria andDtBzGreaterThanOrEqualTo(String value) {
            addCriterion("dt_bz >=", value, "dtBz");
            return (Criteria) this;
        }

        public Criteria andDtBzLessThan(String value) {
            addCriterion("dt_bz <", value, "dtBz");
            return (Criteria) this;
        }

        public Criteria andDtBzLessThanOrEqualTo(String value) {
            addCriterion("dt_bz <=", value, "dtBz");
            return (Criteria) this;
        }

        public Criteria andDtBzLike(String value) {
            addCriterion("dt_bz like", value, "dtBz");
            return (Criteria) this;
        }

        public Criteria andDtBzNotLike(String value) {
            addCriterion("dt_bz not like", value, "dtBz");
            return (Criteria) this;
        }

        public Criteria andDtBzIn(List<String> values) {
            addCriterion("dt_bz in", values, "dtBz");
            return (Criteria) this;
        }

        public Criteria andDtBzNotIn(List<String> values) {
            addCriterion("dt_bz not in", values, "dtBz");
            return (Criteria) this;
        }

        public Criteria andDtBzBetween(String value1, String value2) {
            addCriterion("dt_bz between", value1, value2, "dtBz");
            return (Criteria) this;
        }

        public Criteria andDtBzNotBetween(String value1, String value2) {
            addCriterion("dt_bz not between", value1, value2, "dtBz");
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