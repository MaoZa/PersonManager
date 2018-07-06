package com.hxzy.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbPayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbPayExample() {
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

        public Criteria andPayEmnumberIsNull() {
            addCriterion("pay_emNumber is null");
            return (Criteria) this;
        }

        public Criteria andPayEmnumberIsNotNull() {
            addCriterion("pay_emNumber is not null");
            return (Criteria) this;
        }

        public Criteria andPayEmnumberEqualTo(String value) {
            addCriterion("pay_emNumber =", value, "payEmnumber");
            return (Criteria) this;
        }

        public Criteria andPayEmnumberNotEqualTo(String value) {
            addCriterion("pay_emNumber <>", value, "payEmnumber");
            return (Criteria) this;
        }

        public Criteria andPayEmnumberGreaterThan(String value) {
            addCriterion("pay_emNumber >", value, "payEmnumber");
            return (Criteria) this;
        }

        public Criteria andPayEmnumberGreaterThanOrEqualTo(String value) {
            addCriterion("pay_emNumber >=", value, "payEmnumber");
            return (Criteria) this;
        }

        public Criteria andPayEmnumberLessThan(String value) {
            addCriterion("pay_emNumber <", value, "payEmnumber");
            return (Criteria) this;
        }

        public Criteria andPayEmnumberLessThanOrEqualTo(String value) {
            addCriterion("pay_emNumber <=", value, "payEmnumber");
            return (Criteria) this;
        }

        public Criteria andPayEmnumberLike(String value) {
            addCriterion("pay_emNumber like", value, "payEmnumber");
            return (Criteria) this;
        }

        public Criteria andPayEmnumberNotLike(String value) {
            addCriterion("pay_emNumber not like", value, "payEmnumber");
            return (Criteria) this;
        }

        public Criteria andPayEmnumberIn(List<String> values) {
            addCriterion("pay_emNumber in", values, "payEmnumber");
            return (Criteria) this;
        }

        public Criteria andPayEmnumberNotIn(List<String> values) {
            addCriterion("pay_emNumber not in", values, "payEmnumber");
            return (Criteria) this;
        }

        public Criteria andPayEmnumberBetween(String value1, String value2) {
            addCriterion("pay_emNumber between", value1, value2, "payEmnumber");
            return (Criteria) this;
        }

        public Criteria andPayEmnumberNotBetween(String value1, String value2) {
            addCriterion("pay_emNumber not between", value1, value2, "payEmnumber");
            return (Criteria) this;
        }

        public Criteria andPayEmnameIsNull() {
            addCriterion("pay_emName is null");
            return (Criteria) this;
        }

        public Criteria andPayEmnameIsNotNull() {
            addCriterion("pay_emName is not null");
            return (Criteria) this;
        }

        public Criteria andPayEmnameEqualTo(String value) {
            addCriterion("pay_emName =", value, "payEmname");
            return (Criteria) this;
        }

        public Criteria andPayEmnameNotEqualTo(String value) {
            addCriterion("pay_emName <>", value, "payEmname");
            return (Criteria) this;
        }

        public Criteria andPayEmnameGreaterThan(String value) {
            addCriterion("pay_emName >", value, "payEmname");
            return (Criteria) this;
        }

        public Criteria andPayEmnameGreaterThanOrEqualTo(String value) {
            addCriterion("pay_emName >=", value, "payEmname");
            return (Criteria) this;
        }

        public Criteria andPayEmnameLessThan(String value) {
            addCriterion("pay_emName <", value, "payEmname");
            return (Criteria) this;
        }

        public Criteria andPayEmnameLessThanOrEqualTo(String value) {
            addCriterion("pay_emName <=", value, "payEmname");
            return (Criteria) this;
        }

        public Criteria andPayEmnameLike(String value) {
            addCriterion("pay_emName like", value, "payEmname");
            return (Criteria) this;
        }

        public Criteria andPayEmnameNotLike(String value) {
            addCriterion("pay_emName not like", value, "payEmname");
            return (Criteria) this;
        }

        public Criteria andPayEmnameIn(List<String> values) {
            addCriterion("pay_emName in", values, "payEmname");
            return (Criteria) this;
        }

        public Criteria andPayEmnameNotIn(List<String> values) {
            addCriterion("pay_emName not in", values, "payEmname");
            return (Criteria) this;
        }

        public Criteria andPayEmnameBetween(String value1, String value2) {
            addCriterion("pay_emName between", value1, value2, "payEmname");
            return (Criteria) this;
        }

        public Criteria andPayEmnameNotBetween(String value1, String value2) {
            addCriterion("pay_emName not between", value1, value2, "payEmname");
            return (Criteria) this;
        }

        public Criteria andPayMonthIsNull() {
            addCriterion("pay_month is null");
            return (Criteria) this;
        }

        public Criteria andPayMonthIsNotNull() {
            addCriterion("pay_month is not null");
            return (Criteria) this;
        }

        public Criteria andPayMonthEqualTo(String value) {
            addCriterion("pay_month =", value, "payMonth");
            return (Criteria) this;
        }

        public Criteria andPayMonthNotEqualTo(String value) {
            addCriterion("pay_month <>", value, "payMonth");
            return (Criteria) this;
        }

        public Criteria andPayMonthGreaterThan(String value) {
            addCriterion("pay_month >", value, "payMonth");
            return (Criteria) this;
        }

        public Criteria andPayMonthGreaterThanOrEqualTo(String value) {
            addCriterion("pay_month >=", value, "payMonth");
            return (Criteria) this;
        }

        public Criteria andPayMonthLessThan(String value) {
            addCriterion("pay_month <", value, "payMonth");
            return (Criteria) this;
        }

        public Criteria andPayMonthLessThanOrEqualTo(String value) {
            addCriterion("pay_month <=", value, "payMonth");
            return (Criteria) this;
        }

        public Criteria andPayMonthLike(String value) {
            addCriterion("pay_month like", value, "payMonth");
            return (Criteria) this;
        }

        public Criteria andPayMonthNotLike(String value) {
            addCriterion("pay_month not like", value, "payMonth");
            return (Criteria) this;
        }

        public Criteria andPayMonthIn(List<String> values) {
            addCriterion("pay_month in", values, "payMonth");
            return (Criteria) this;
        }

        public Criteria andPayMonthNotIn(List<String> values) {
            addCriterion("pay_month not in", values, "payMonth");
            return (Criteria) this;
        }

        public Criteria andPayMonthBetween(String value1, String value2) {
            addCriterion("pay_month between", value1, value2, "payMonth");
            return (Criteria) this;
        }

        public Criteria andPayMonthNotBetween(String value1, String value2) {
            addCriterion("pay_month not between", value1, value2, "payMonth");
            return (Criteria) this;
        }

        public Criteria andPayBasemoneyIsNull() {
            addCriterion("pay_baseMoney is null");
            return (Criteria) this;
        }

        public Criteria andPayBasemoneyIsNotNull() {
            addCriterion("pay_baseMoney is not null");
            return (Criteria) this;
        }

        public Criteria andPayBasemoneyEqualTo(Integer value) {
            addCriterion("pay_baseMoney =", value, "payBasemoney");
            return (Criteria) this;
        }

        public Criteria andPayBasemoneyNotEqualTo(Integer value) {
            addCriterion("pay_baseMoney <>", value, "payBasemoney");
            return (Criteria) this;
        }

        public Criteria andPayBasemoneyGreaterThan(Integer value) {
            addCriterion("pay_baseMoney >", value, "payBasemoney");
            return (Criteria) this;
        }

        public Criteria andPayBasemoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_baseMoney >=", value, "payBasemoney");
            return (Criteria) this;
        }

        public Criteria andPayBasemoneyLessThan(Integer value) {
            addCriterion("pay_baseMoney <", value, "payBasemoney");
            return (Criteria) this;
        }

        public Criteria andPayBasemoneyLessThanOrEqualTo(Integer value) {
            addCriterion("pay_baseMoney <=", value, "payBasemoney");
            return (Criteria) this;
        }

        public Criteria andPayBasemoneyIn(List<Integer> values) {
            addCriterion("pay_baseMoney in", values, "payBasemoney");
            return (Criteria) this;
        }

        public Criteria andPayBasemoneyNotIn(List<Integer> values) {
            addCriterion("pay_baseMoney not in", values, "payBasemoney");
            return (Criteria) this;
        }

        public Criteria andPayBasemoneyBetween(Integer value1, Integer value2) {
            addCriterion("pay_baseMoney between", value1, value2, "payBasemoney");
            return (Criteria) this;
        }

        public Criteria andPayBasemoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_baseMoney not between", value1, value2, "payBasemoney");
            return (Criteria) this;
        }

        public Criteria andPayOvertimeIsNull() {
            addCriterion("pay_overtime is null");
            return (Criteria) this;
        }

        public Criteria andPayOvertimeIsNotNull() {
            addCriterion("pay_overtime is not null");
            return (Criteria) this;
        }

        public Criteria andPayOvertimeEqualTo(Integer value) {
            addCriterion("pay_overtime =", value, "payOvertime");
            return (Criteria) this;
        }

        public Criteria andPayOvertimeNotEqualTo(Integer value) {
            addCriterion("pay_overtime <>", value, "payOvertime");
            return (Criteria) this;
        }

        public Criteria andPayOvertimeGreaterThan(Integer value) {
            addCriterion("pay_overtime >", value, "payOvertime");
            return (Criteria) this;
        }

        public Criteria andPayOvertimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_overtime >=", value, "payOvertime");
            return (Criteria) this;
        }

        public Criteria andPayOvertimeLessThan(Integer value) {
            addCriterion("pay_overtime <", value, "payOvertime");
            return (Criteria) this;
        }

        public Criteria andPayOvertimeLessThanOrEqualTo(Integer value) {
            addCriterion("pay_overtime <=", value, "payOvertime");
            return (Criteria) this;
        }

        public Criteria andPayOvertimeIn(List<Integer> values) {
            addCriterion("pay_overtime in", values, "payOvertime");
            return (Criteria) this;
        }

        public Criteria andPayOvertimeNotIn(List<Integer> values) {
            addCriterion("pay_overtime not in", values, "payOvertime");
            return (Criteria) this;
        }

        public Criteria andPayOvertimeBetween(Integer value1, Integer value2) {
            addCriterion("pay_overtime between", value1, value2, "payOvertime");
            return (Criteria) this;
        }

        public Criteria andPayOvertimeNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_overtime not between", value1, value2, "payOvertime");
            return (Criteria) this;
        }

        public Criteria andPayAgeIsNull() {
            addCriterion("pay_age is null");
            return (Criteria) this;
        }

        public Criteria andPayAgeIsNotNull() {
            addCriterion("pay_age is not null");
            return (Criteria) this;
        }

        public Criteria andPayAgeEqualTo(Integer value) {
            addCriterion("pay_age =", value, "payAge");
            return (Criteria) this;
        }

        public Criteria andPayAgeNotEqualTo(Integer value) {
            addCriterion("pay_age <>", value, "payAge");
            return (Criteria) this;
        }

        public Criteria andPayAgeGreaterThan(Integer value) {
            addCriterion("pay_age >", value, "payAge");
            return (Criteria) this;
        }

        public Criteria andPayAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_age >=", value, "payAge");
            return (Criteria) this;
        }

        public Criteria andPayAgeLessThan(Integer value) {
            addCriterion("pay_age <", value, "payAge");
            return (Criteria) this;
        }

        public Criteria andPayAgeLessThanOrEqualTo(Integer value) {
            addCriterion("pay_age <=", value, "payAge");
            return (Criteria) this;
        }

        public Criteria andPayAgeIn(List<Integer> values) {
            addCriterion("pay_age in", values, "payAge");
            return (Criteria) this;
        }

        public Criteria andPayAgeNotIn(List<Integer> values) {
            addCriterion("pay_age not in", values, "payAge");
            return (Criteria) this;
        }

        public Criteria andPayAgeBetween(Integer value1, Integer value2) {
            addCriterion("pay_age between", value1, value2, "payAge");
            return (Criteria) this;
        }

        public Criteria andPayAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_age not between", value1, value2, "payAge");
            return (Criteria) this;
        }

        public Criteria andPayCheckIsNull() {
            addCriterion("pay_check is null");
            return (Criteria) this;
        }

        public Criteria andPayCheckIsNotNull() {
            addCriterion("pay_check is not null");
            return (Criteria) this;
        }

        public Criteria andPayCheckEqualTo(Float value) {
            addCriterion("pay_check =", value, "payCheck");
            return (Criteria) this;
        }

        public Criteria andPayCheckNotEqualTo(Float value) {
            addCriterion("pay_check <>", value, "payCheck");
            return (Criteria) this;
        }

        public Criteria andPayCheckGreaterThan(Float value) {
            addCriterion("pay_check >", value, "payCheck");
            return (Criteria) this;
        }

        public Criteria andPayCheckGreaterThanOrEqualTo(Float value) {
            addCriterion("pay_check >=", value, "payCheck");
            return (Criteria) this;
        }

        public Criteria andPayCheckLessThan(Float value) {
            addCriterion("pay_check <", value, "payCheck");
            return (Criteria) this;
        }

        public Criteria andPayCheckLessThanOrEqualTo(Float value) {
            addCriterion("pay_check <=", value, "payCheck");
            return (Criteria) this;
        }

        public Criteria andPayCheckIn(List<Float> values) {
            addCriterion("pay_check in", values, "payCheck");
            return (Criteria) this;
        }

        public Criteria andPayCheckNotIn(List<Float> values) {
            addCriterion("pay_check not in", values, "payCheck");
            return (Criteria) this;
        }

        public Criteria andPayCheckBetween(Float value1, Float value2) {
            addCriterion("pay_check between", value1, value2, "payCheck");
            return (Criteria) this;
        }

        public Criteria andPayCheckNotBetween(Float value1, Float value2) {
            addCriterion("pay_check not between", value1, value2, "payCheck");
            return (Criteria) this;
        }

        public Criteria andPayAbsentIsNull() {
            addCriterion("pay_absent is null");
            return (Criteria) this;
        }

        public Criteria andPayAbsentIsNotNull() {
            addCriterion("pay_absent is not null");
            return (Criteria) this;
        }

        public Criteria andPayAbsentEqualTo(Float value) {
            addCriterion("pay_absent =", value, "payAbsent");
            return (Criteria) this;
        }

        public Criteria andPayAbsentNotEqualTo(Float value) {
            addCriterion("pay_absent <>", value, "payAbsent");
            return (Criteria) this;
        }

        public Criteria andPayAbsentGreaterThan(Float value) {
            addCriterion("pay_absent >", value, "payAbsent");
            return (Criteria) this;
        }

        public Criteria andPayAbsentGreaterThanOrEqualTo(Float value) {
            addCriterion("pay_absent >=", value, "payAbsent");
            return (Criteria) this;
        }

        public Criteria andPayAbsentLessThan(Float value) {
            addCriterion("pay_absent <", value, "payAbsent");
            return (Criteria) this;
        }

        public Criteria andPayAbsentLessThanOrEqualTo(Float value) {
            addCriterion("pay_absent <=", value, "payAbsent");
            return (Criteria) this;
        }

        public Criteria andPayAbsentIn(List<Float> values) {
            addCriterion("pay_absent in", values, "payAbsent");
            return (Criteria) this;
        }

        public Criteria andPayAbsentNotIn(List<Float> values) {
            addCriterion("pay_absent not in", values, "payAbsent");
            return (Criteria) this;
        }

        public Criteria andPayAbsentBetween(Float value1, Float value2) {
            addCriterion("pay_absent between", value1, value2, "payAbsent");
            return (Criteria) this;
        }

        public Criteria andPayAbsentNotBetween(Float value1, Float value2) {
            addCriterion("pay_absent not between", value1, value2, "payAbsent");
            return (Criteria) this;
        }

        public Criteria andPaySafetyIsNull() {
            addCriterion("pay_safety is null");
            return (Criteria) this;
        }

        public Criteria andPaySafetyIsNotNull() {
            addCriterion("pay_safety is not null");
            return (Criteria) this;
        }

        public Criteria andPaySafetyEqualTo(Float value) {
            addCriterion("pay_safety =", value, "paySafety");
            return (Criteria) this;
        }

        public Criteria andPaySafetyNotEqualTo(Float value) {
            addCriterion("pay_safety <>", value, "paySafety");
            return (Criteria) this;
        }

        public Criteria andPaySafetyGreaterThan(Float value) {
            addCriterion("pay_safety >", value, "paySafety");
            return (Criteria) this;
        }

        public Criteria andPaySafetyGreaterThanOrEqualTo(Float value) {
            addCriterion("pay_safety >=", value, "paySafety");
            return (Criteria) this;
        }

        public Criteria andPaySafetyLessThan(Float value) {
            addCriterion("pay_safety <", value, "paySafety");
            return (Criteria) this;
        }

        public Criteria andPaySafetyLessThanOrEqualTo(Float value) {
            addCriterion("pay_safety <=", value, "paySafety");
            return (Criteria) this;
        }

        public Criteria andPaySafetyIn(List<Float> values) {
            addCriterion("pay_safety in", values, "paySafety");
            return (Criteria) this;
        }

        public Criteria andPaySafetyNotIn(List<Float> values) {
            addCriterion("pay_safety not in", values, "paySafety");
            return (Criteria) this;
        }

        public Criteria andPaySafetyBetween(Float value1, Float value2) {
            addCriterion("pay_safety between", value1, value2, "paySafety");
            return (Criteria) this;
        }

        public Criteria andPaySafetyNotBetween(Float value1, Float value2) {
            addCriterion("pay_safety not between", value1, value2, "paySafety");
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