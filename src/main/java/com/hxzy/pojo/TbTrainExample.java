package com.hxzy.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbTrainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbTrainExample() {
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

        public Criteria andTnManIsNull() {
            addCriterion("tn_man is null");
            return (Criteria) this;
        }

        public Criteria andTnManIsNotNull() {
            addCriterion("tn_man is not null");
            return (Criteria) this;
        }

        public Criteria andTnManEqualTo(String value) {
            addCriterion("tn_man =", value, "tnMan");
            return (Criteria) this;
        }

        public Criteria andTnManNotEqualTo(String value) {
            addCriterion("tn_man <>", value, "tnMan");
            return (Criteria) this;
        }

        public Criteria andTnManGreaterThan(String value) {
            addCriterion("tn_man >", value, "tnMan");
            return (Criteria) this;
        }

        public Criteria andTnManGreaterThanOrEqualTo(String value) {
            addCriterion("tn_man >=", value, "tnMan");
            return (Criteria) this;
        }

        public Criteria andTnManLessThan(String value) {
            addCriterion("tn_man <", value, "tnMan");
            return (Criteria) this;
        }

        public Criteria andTnManLessThanOrEqualTo(String value) {
            addCriterion("tn_man <=", value, "tnMan");
            return (Criteria) this;
        }

        public Criteria andTnManLike(String value) {
            addCriterion("tn_man like", value, "tnMan");
            return (Criteria) this;
        }

        public Criteria andTnManNotLike(String value) {
            addCriterion("tn_man not like", value, "tnMan");
            return (Criteria) this;
        }

        public Criteria andTnManIn(List<String> values) {
            addCriterion("tn_man in", values, "tnMan");
            return (Criteria) this;
        }

        public Criteria andTnManNotIn(List<String> values) {
            addCriterion("tn_man not in", values, "tnMan");
            return (Criteria) this;
        }

        public Criteria andTnManBetween(String value1, String value2) {
            addCriterion("tn_man between", value1, value2, "tnMan");
            return (Criteria) this;
        }

        public Criteria andTnManNotBetween(String value1, String value2) {
            addCriterion("tn_man not between", value1, value2, "tnMan");
            return (Criteria) this;
        }

        public Criteria andTnTitleIsNull() {
            addCriterion("tn_title is null");
            return (Criteria) this;
        }

        public Criteria andTnTitleIsNotNull() {
            addCriterion("tn_title is not null");
            return (Criteria) this;
        }

        public Criteria andTnTitleEqualTo(String value) {
            addCriterion("tn_title =", value, "tnTitle");
            return (Criteria) this;
        }

        public Criteria andTnTitleNotEqualTo(String value) {
            addCriterion("tn_title <>", value, "tnTitle");
            return (Criteria) this;
        }

        public Criteria andTnTitleGreaterThan(String value) {
            addCriterion("tn_title >", value, "tnTitle");
            return (Criteria) this;
        }

        public Criteria andTnTitleGreaterThanOrEqualTo(String value) {
            addCriterion("tn_title >=", value, "tnTitle");
            return (Criteria) this;
        }

        public Criteria andTnTitleLessThan(String value) {
            addCriterion("tn_title <", value, "tnTitle");
            return (Criteria) this;
        }

        public Criteria andTnTitleLessThanOrEqualTo(String value) {
            addCriterion("tn_title <=", value, "tnTitle");
            return (Criteria) this;
        }

        public Criteria andTnTitleLike(String value) {
            addCriterion("tn_title like", value, "tnTitle");
            return (Criteria) this;
        }

        public Criteria andTnTitleNotLike(String value) {
            addCriterion("tn_title not like", value, "tnTitle");
            return (Criteria) this;
        }

        public Criteria andTnTitleIn(List<String> values) {
            addCriterion("tn_title in", values, "tnTitle");
            return (Criteria) this;
        }

        public Criteria andTnTitleNotIn(List<String> values) {
            addCriterion("tn_title not in", values, "tnTitle");
            return (Criteria) this;
        }

        public Criteria andTnTitleBetween(String value1, String value2) {
            addCriterion("tn_title between", value1, value2, "tnTitle");
            return (Criteria) this;
        }

        public Criteria andTnTitleNotBetween(String value1, String value2) {
            addCriterion("tn_title not between", value1, value2, "tnTitle");
            return (Criteria) this;
        }

        public Criteria andTnContentIsNull() {
            addCriterion("tn_content is null");
            return (Criteria) this;
        }

        public Criteria andTnContentIsNotNull() {
            addCriterion("tn_content is not null");
            return (Criteria) this;
        }

        public Criteria andTnContentEqualTo(String value) {
            addCriterion("tn_content =", value, "tnContent");
            return (Criteria) this;
        }

        public Criteria andTnContentNotEqualTo(String value) {
            addCriterion("tn_content <>", value, "tnContent");
            return (Criteria) this;
        }

        public Criteria andTnContentGreaterThan(String value) {
            addCriterion("tn_content >", value, "tnContent");
            return (Criteria) this;
        }

        public Criteria andTnContentGreaterThanOrEqualTo(String value) {
            addCriterion("tn_content >=", value, "tnContent");
            return (Criteria) this;
        }

        public Criteria andTnContentLessThan(String value) {
            addCriterion("tn_content <", value, "tnContent");
            return (Criteria) this;
        }

        public Criteria andTnContentLessThanOrEqualTo(String value) {
            addCriterion("tn_content <=", value, "tnContent");
            return (Criteria) this;
        }

        public Criteria andTnContentLike(String value) {
            addCriterion("tn_content like", value, "tnContent");
            return (Criteria) this;
        }

        public Criteria andTnContentNotLike(String value) {
            addCriterion("tn_content not like", value, "tnContent");
            return (Criteria) this;
        }

        public Criteria andTnContentIn(List<String> values) {
            addCriterion("tn_content in", values, "tnContent");
            return (Criteria) this;
        }

        public Criteria andTnContentNotIn(List<String> values) {
            addCriterion("tn_content not in", values, "tnContent");
            return (Criteria) this;
        }

        public Criteria andTnContentBetween(String value1, String value2) {
            addCriterion("tn_content between", value1, value2, "tnContent");
            return (Criteria) this;
        }

        public Criteria andTnContentNotBetween(String value1, String value2) {
            addCriterion("tn_content not between", value1, value2, "tnContent");
            return (Criteria) this;
        }

        public Criteria andTnTimeIsNull() {
            addCriterion("tn_time is null");
            return (Criteria) this;
        }

        public Criteria andTnTimeIsNotNull() {
            addCriterion("tn_time is not null");
            return (Criteria) this;
        }

        public Criteria andTnTimeEqualTo(String value) {
            addCriterion("tn_time =", value, "tnTime");
            return (Criteria) this;
        }

        public Criteria andTnTimeNotEqualTo(String value) {
            addCriterion("tn_time <>", value, "tnTime");
            return (Criteria) this;
        }

        public Criteria andTnTimeGreaterThan(String value) {
            addCriterion("tn_time >", value, "tnTime");
            return (Criteria) this;
        }

        public Criteria andTnTimeGreaterThanOrEqualTo(String value) {
            addCriterion("tn_time >=", value, "tnTime");
            return (Criteria) this;
        }

        public Criteria andTnTimeLessThan(String value) {
            addCriterion("tn_time <", value, "tnTime");
            return (Criteria) this;
        }

        public Criteria andTnTimeLessThanOrEqualTo(String value) {
            addCriterion("tn_time <=", value, "tnTime");
            return (Criteria) this;
        }

        public Criteria andTnTimeLike(String value) {
            addCriterion("tn_time like", value, "tnTime");
            return (Criteria) this;
        }

        public Criteria andTnTimeNotLike(String value) {
            addCriterion("tn_time not like", value, "tnTime");
            return (Criteria) this;
        }

        public Criteria andTnTimeIn(List<String> values) {
            addCriterion("tn_time in", values, "tnTime");
            return (Criteria) this;
        }

        public Criteria andTnTimeNotIn(List<String> values) {
            addCriterion("tn_time not in", values, "tnTime");
            return (Criteria) this;
        }

        public Criteria andTnTimeBetween(String value1, String value2) {
            addCriterion("tn_time between", value1, value2, "tnTime");
            return (Criteria) this;
        }

        public Criteria andTnTimeNotBetween(String value1, String value2) {
            addCriterion("tn_time not between", value1, value2, "tnTime");
            return (Criteria) this;
        }

        public Criteria andTnAddressIsNull() {
            addCriterion("tn_address is null");
            return (Criteria) this;
        }

        public Criteria andTnAddressIsNotNull() {
            addCriterion("tn_address is not null");
            return (Criteria) this;
        }

        public Criteria andTnAddressEqualTo(String value) {
            addCriterion("tn_address =", value, "tnAddress");
            return (Criteria) this;
        }

        public Criteria andTnAddressNotEqualTo(String value) {
            addCriterion("tn_address <>", value, "tnAddress");
            return (Criteria) this;
        }

        public Criteria andTnAddressGreaterThan(String value) {
            addCriterion("tn_address >", value, "tnAddress");
            return (Criteria) this;
        }

        public Criteria andTnAddressGreaterThanOrEqualTo(String value) {
            addCriterion("tn_address >=", value, "tnAddress");
            return (Criteria) this;
        }

        public Criteria andTnAddressLessThan(String value) {
            addCriterion("tn_address <", value, "tnAddress");
            return (Criteria) this;
        }

        public Criteria andTnAddressLessThanOrEqualTo(String value) {
            addCriterion("tn_address <=", value, "tnAddress");
            return (Criteria) this;
        }

        public Criteria andTnAddressLike(String value) {
            addCriterion("tn_address like", value, "tnAddress");
            return (Criteria) this;
        }

        public Criteria andTnAddressNotLike(String value) {
            addCriterion("tn_address not like", value, "tnAddress");
            return (Criteria) this;
        }

        public Criteria andTnAddressIn(List<String> values) {
            addCriterion("tn_address in", values, "tnAddress");
            return (Criteria) this;
        }

        public Criteria andTnAddressNotIn(List<String> values) {
            addCriterion("tn_address not in", values, "tnAddress");
            return (Criteria) this;
        }

        public Criteria andTnAddressBetween(String value1, String value2) {
            addCriterion("tn_address between", value1, value2, "tnAddress");
            return (Criteria) this;
        }

        public Criteria andTnAddressNotBetween(String value1, String value2) {
            addCriterion("tn_address not between", value1, value2, "tnAddress");
            return (Criteria) this;
        }

        public Criteria andTnJoinIsNull() {
            addCriterion("tn_join is null");
            return (Criteria) this;
        }

        public Criteria andTnJoinIsNotNull() {
            addCriterion("tn_join is not null");
            return (Criteria) this;
        }

        public Criteria andTnJoinEqualTo(String value) {
            addCriterion("tn_join =", value, "tnJoin");
            return (Criteria) this;
        }

        public Criteria andTnJoinNotEqualTo(String value) {
            addCriterion("tn_join <>", value, "tnJoin");
            return (Criteria) this;
        }

        public Criteria andTnJoinGreaterThan(String value) {
            addCriterion("tn_join >", value, "tnJoin");
            return (Criteria) this;
        }

        public Criteria andTnJoinGreaterThanOrEqualTo(String value) {
            addCriterion("tn_join >=", value, "tnJoin");
            return (Criteria) this;
        }

        public Criteria andTnJoinLessThan(String value) {
            addCriterion("tn_join <", value, "tnJoin");
            return (Criteria) this;
        }

        public Criteria andTnJoinLessThanOrEqualTo(String value) {
            addCriterion("tn_join <=", value, "tnJoin");
            return (Criteria) this;
        }

        public Criteria andTnJoinLike(String value) {
            addCriterion("tn_join like", value, "tnJoin");
            return (Criteria) this;
        }

        public Criteria andTnJoinNotLike(String value) {
            addCriterion("tn_join not like", value, "tnJoin");
            return (Criteria) this;
        }

        public Criteria andTnJoinIn(List<String> values) {
            addCriterion("tn_join in", values, "tnJoin");
            return (Criteria) this;
        }

        public Criteria andTnJoinNotIn(List<String> values) {
            addCriterion("tn_join not in", values, "tnJoin");
            return (Criteria) this;
        }

        public Criteria andTnJoinBetween(String value1, String value2) {
            addCriterion("tn_join between", value1, value2, "tnJoin");
            return (Criteria) this;
        }

        public Criteria andTnJoinNotBetween(String value1, String value2) {
            addCriterion("tn_join not between", value1, value2, "tnJoin");
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