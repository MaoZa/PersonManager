package com.hxzy.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TbEmployeeExample{

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbEmployeeExample() {
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

        public Criteria andEmSerialnumberIsNull() {
            addCriterion("em_serialNumber is null");
            return (Criteria) this;
        }

        public Criteria andEmSerialnumberIsNotNull() {
            addCriterion("em_serialNumber is not null");
            return (Criteria) this;
        }

        public Criteria andEmSerialnumberEqualTo(String value) {
            addCriterion("em_serialNumber =", value, "emSerialnumber");
            return (Criteria) this;
        }

        public Criteria andEmSerialnumberNotEqualTo(String value) {
            addCriterion("em_serialNumber <>", value, "emSerialnumber");
            return (Criteria) this;
        }

        public Criteria andEmSerialnumberGreaterThan(String value) {
            addCriterion("em_serialNumber >", value, "emSerialnumber");
            return (Criteria) this;
        }

        public Criteria andEmSerialnumberGreaterThanOrEqualTo(String value) {
            addCriterion("em_serialNumber >=", value, "emSerialnumber");
            return (Criteria) this;
        }

        public Criteria andEmSerialnumberLessThan(String value) {
            addCriterion("em_serialNumber <", value, "emSerialnumber");
            return (Criteria) this;
        }

        public Criteria andEmSerialnumberLessThanOrEqualTo(String value) {
            addCriterion("em_serialNumber <=", value, "emSerialnumber");
            return (Criteria) this;
        }

        public Criteria andEmSerialnumberLike(String value) {
            addCriterion("em_serialNumber like", value, "emSerialnumber");
            return (Criteria) this;
        }

        public Criteria andEmSerialnumberNotLike(String value) {
            addCriterion("em_serialNumber not like", value, "emSerialnumber");
            return (Criteria) this;
        }

        public Criteria andEmSerialnumberIn(List<String> values) {
            addCriterion("em_serialNumber in", values, "emSerialnumber");
            return (Criteria) this;
        }

        public Criteria andEmSerialnumberNotIn(List<String> values) {
            addCriterion("em_serialNumber not in", values, "emSerialnumber");
            return (Criteria) this;
        }

        public Criteria andEmSerialnumberBetween(String value1, String value2) {
            addCriterion("em_serialNumber between", value1, value2, "emSerialnumber");
            return (Criteria) this;
        }

        public Criteria andEmSerialnumberNotBetween(String value1, String value2) {
            addCriterion("em_serialNumber not between", value1, value2, "emSerialnumber");
            return (Criteria) this;
        }

        public Criteria andEmNameIsNull() {
            addCriterion("em_name is null");
            return (Criteria) this;
        }

        public Criteria andEmNameIsNotNull() {
            addCriterion("em_name is not null");
            return (Criteria) this;
        }

        public Criteria andEmNameEqualTo(String value) {
            addCriterion("em_name =", value, "emName");
            return (Criteria) this;
        }

        public Criteria andEmNameNotEqualTo(String value) {
            addCriterion("em_name <>", value, "emName");
            return (Criteria) this;
        }

        public Criteria andEmNameGreaterThan(String value) {
            addCriterion("em_name >", value, "emName");
            return (Criteria) this;
        }

        public Criteria andEmNameGreaterThanOrEqualTo(String value) {
            addCriterion("em_name >=", value, "emName");
            return (Criteria) this;
        }

        public Criteria andEmNameLessThan(String value) {
            addCriterion("em_name <", value, "emName");
            return (Criteria) this;
        }

        public Criteria andEmNameLessThanOrEqualTo(String value) {
            addCriterion("em_name <=", value, "emName");
            return (Criteria) this;
        }

        public Criteria andEmNameLike(String value) {
            addCriterion("em_name like", value, "emName");
            return (Criteria) this;
        }

        public Criteria andEmNameNotLike(String value) {
            addCriterion("em_name not like", value, "emName");
            return (Criteria) this;
        }

        public Criteria andEmNameIn(List<String> values) {
            addCriterion("em_name in", values, "emName");
            return (Criteria) this;
        }

        public Criteria andEmNameNotIn(List<String> values) {
            addCriterion("em_name not in", values, "emName");
            return (Criteria) this;
        }

        public Criteria andEmNameBetween(String value1, String value2) {
            addCriterion("em_name between", value1, value2, "emName");
            return (Criteria) this;
        }

        public Criteria andEmNameNotBetween(String value1, String value2) {
            addCriterion("em_name not between", value1, value2, "emName");
            return (Criteria) this;
        }

        public Criteria andEmSexIsNull() {
            addCriterion("em_sex is null");
            return (Criteria) this;
        }

        public Criteria andEmSexIsNotNull() {
            addCriterion("em_sex is not null");
            return (Criteria) this;
        }

        public Criteria andEmSexEqualTo(String value) {
            addCriterion("em_sex =", value, "emSex");
            return (Criteria) this;
        }

        public Criteria andEmSexNotEqualTo(String value) {
            addCriterion("em_sex <>", value, "emSex");
            return (Criteria) this;
        }

        public Criteria andEmSexGreaterThan(String value) {
            addCriterion("em_sex >", value, "emSex");
            return (Criteria) this;
        }

        public Criteria andEmSexGreaterThanOrEqualTo(String value) {
            addCriterion("em_sex >=", value, "emSex");
            return (Criteria) this;
        }

        public Criteria andEmSexLessThan(String value) {
            addCriterion("em_sex <", value, "emSex");
            return (Criteria) this;
        }

        public Criteria andEmSexLessThanOrEqualTo(String value) {
            addCriterion("em_sex <=", value, "emSex");
            return (Criteria) this;
        }

        public Criteria andEmSexLike(String value) {
            addCriterion("em_sex like", value, "emSex");
            return (Criteria) this;
        }

        public Criteria andEmSexNotLike(String value) {
            addCriterion("em_sex not like", value, "emSex");
            return (Criteria) this;
        }

        public Criteria andEmSexIn(List<String> values) {
            addCriterion("em_sex in", values, "emSex");
            return (Criteria) this;
        }

        public Criteria andEmSexNotIn(List<String> values) {
            addCriterion("em_sex not in", values, "emSex");
            return (Criteria) this;
        }

        public Criteria andEmSexBetween(String value1, String value2) {
            addCriterion("em_sex between", value1, value2, "emSex");
            return (Criteria) this;
        }

        public Criteria andEmSexNotBetween(String value1, String value2) {
            addCriterion("em_sex not between", value1, value2, "emSex");
            return (Criteria) this;
        }

        public Criteria andEmAgeIsNull() {
            addCriterion("em_age is null");
            return (Criteria) this;
        }

        public Criteria andEmAgeIsNotNull() {
            addCriterion("em_age is not null");
            return (Criteria) this;
        }

        public Criteria andEmAgeEqualTo(Integer value) {
            addCriterion("em_age =", value, "emAge");
            return (Criteria) this;
        }

        public Criteria andEmAgeNotEqualTo(Integer value) {
            addCriterion("em_age <>", value, "emAge");
            return (Criteria) this;
        }

        public Criteria andEmAgeGreaterThan(Integer value) {
            addCriterion("em_age >", value, "emAge");
            return (Criteria) this;
        }

        public Criteria andEmAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("em_age >=", value, "emAge");
            return (Criteria) this;
        }

        public Criteria andEmAgeLessThan(Integer value) {
            addCriterion("em_age <", value, "emAge");
            return (Criteria) this;
        }

        public Criteria andEmAgeLessThanOrEqualTo(Integer value) {
            addCriterion("em_age <=", value, "emAge");
            return (Criteria) this;
        }

        public Criteria andEmAgeIn(List<Integer> values) {
            addCriterion("em_age in", values, "emAge");
            return (Criteria) this;
        }

        public Criteria andEmAgeNotIn(List<Integer> values) {
            addCriterion("em_age not in", values, "emAge");
            return (Criteria) this;
        }

        public Criteria andEmAgeBetween(Integer value1, Integer value2) {
            addCriterion("em_age between", value1, value2, "emAge");
            return (Criteria) this;
        }

        public Criteria andEmAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("em_age not between", value1, value2, "emAge");
            return (Criteria) this;
        }

        public Criteria andEmIdcardIsNull() {
            addCriterion("em_IDCard is null");
            return (Criteria) this;
        }

        public Criteria andEmIdcardIsNotNull() {
            addCriterion("em_IDCard is not null");
            return (Criteria) this;
        }

        public Criteria andEmIdcardEqualTo(String value) {
            addCriterion("em_IDCard =", value, "emIdcard");
            return (Criteria) this;
        }

        public Criteria andEmIdcardNotEqualTo(String value) {
            addCriterion("em_IDCard <>", value, "emIdcard");
            return (Criteria) this;
        }

        public Criteria andEmIdcardGreaterThan(String value) {
            addCriterion("em_IDCard >", value, "emIdcard");
            return (Criteria) this;
        }

        public Criteria andEmIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("em_IDCard >=", value, "emIdcard");
            return (Criteria) this;
        }

        public Criteria andEmIdcardLessThan(String value) {
            addCriterion("em_IDCard <", value, "emIdcard");
            return (Criteria) this;
        }

        public Criteria andEmIdcardLessThanOrEqualTo(String value) {
            addCriterion("em_IDCard <=", value, "emIdcard");
            return (Criteria) this;
        }

        public Criteria andEmIdcardLike(String value) {
            addCriterion("em_IDCard like", value, "emIdcard");
            return (Criteria) this;
        }

        public Criteria andEmIdcardNotLike(String value) {
            addCriterion("em_IDCard not like", value, "emIdcard");
            return (Criteria) this;
        }

        public Criteria andEmIdcardIn(List<String> values) {
            addCriterion("em_IDCard in", values, "emIdcard");
            return (Criteria) this;
        }

        public Criteria andEmIdcardNotIn(List<String> values) {
            addCriterion("em_IDCard not in", values, "emIdcard");
            return (Criteria) this;
        }

        public Criteria andEmIdcardBetween(String value1, String value2) {
            addCriterion("em_IDCard between", value1, value2, "emIdcard");
            return (Criteria) this;
        }

        public Criteria andEmIdcardNotBetween(String value1, String value2) {
            addCriterion("em_IDCard not between", value1, value2, "emIdcard");
            return (Criteria) this;
        }

        public Criteria andEmBornIsNull() {
            addCriterion("em_born is null");
            return (Criteria) this;
        }

        public Criteria andEmBornIsNotNull() {
            addCriterion("em_born is not null");
            return (Criteria) this;
        }

        public Criteria andEmBornEqualTo(String value) {
            addCriterion("em_born =", value, "emBorn");
            return (Criteria) this;
        }

        public Criteria andEmBornNotEqualTo(String value) {
            addCriterion("em_born <>", value, "emBorn");
            return (Criteria) this;
        }

        public Criteria andEmBornGreaterThan(String value) {
            addCriterion("em_born >", value, "emBorn");
            return (Criteria) this;
        }

        public Criteria andEmBornGreaterThanOrEqualTo(String value) {
            addCriterion("em_born >=", value, "emBorn");
            return (Criteria) this;
        }

        public Criteria andEmBornLessThan(String value) {
            addCriterion("em_born <", value, "emBorn");
            return (Criteria) this;
        }

        public Criteria andEmBornLessThanOrEqualTo(String value) {
            addCriterion("em_born <=", value, "emBorn");
            return (Criteria) this;
        }

        public Criteria andEmBornLike(String value) {
            addCriterion("em_born like", value, "emBorn");
            return (Criteria) this;
        }

        public Criteria andEmBornNotLike(String value) {
            addCriterion("em_born not like", value, "emBorn");
            return (Criteria) this;
        }

        public Criteria andEmBornIn(List<String> values) {
            addCriterion("em_born in", values, "emBorn");
            return (Criteria) this;
        }

        public Criteria andEmBornNotIn(List<String> values) {
            addCriterion("em_born not in", values, "emBorn");
            return (Criteria) this;
        }

        public Criteria andEmBornBetween(String value1, String value2) {
            addCriterion("em_born between", value1, value2, "emBorn");
            return (Criteria) this;
        }

        public Criteria andEmBornNotBetween(String value1, String value2) {
            addCriterion("em_born not between", value1, value2, "emBorn");
            return (Criteria) this;
        }

        public Criteria andEmNationIsNull() {
            addCriterion("em_nation is null");
            return (Criteria) this;
        }

        public Criteria andEmNationIsNotNull() {
            addCriterion("em_nation is not null");
            return (Criteria) this;
        }

        public Criteria andEmNationEqualTo(String value) {
            addCriterion("em_nation =", value, "emNation");
            return (Criteria) this;
        }

        public Criteria andEmNationNotEqualTo(String value) {
            addCriterion("em_nation <>", value, "emNation");
            return (Criteria) this;
        }

        public Criteria andEmNationGreaterThan(String value) {
            addCriterion("em_nation >", value, "emNation");
            return (Criteria) this;
        }

        public Criteria andEmNationGreaterThanOrEqualTo(String value) {
            addCriterion("em_nation >=", value, "emNation");
            return (Criteria) this;
        }

        public Criteria andEmNationLessThan(String value) {
            addCriterion("em_nation <", value, "emNation");
            return (Criteria) this;
        }

        public Criteria andEmNationLessThanOrEqualTo(String value) {
            addCriterion("em_nation <=", value, "emNation");
            return (Criteria) this;
        }

        public Criteria andEmNationLike(String value) {
            addCriterion("em_nation like", value, "emNation");
            return (Criteria) this;
        }

        public Criteria andEmNationNotLike(String value) {
            addCriterion("em_nation not like", value, "emNation");
            return (Criteria) this;
        }

        public Criteria andEmNationIn(List<String> values) {
            addCriterion("em_nation in", values, "emNation");
            return (Criteria) this;
        }

        public Criteria andEmNationNotIn(List<String> values) {
            addCriterion("em_nation not in", values, "emNation");
            return (Criteria) this;
        }

        public Criteria andEmNationBetween(String value1, String value2) {
            addCriterion("em_nation between", value1, value2, "emNation");
            return (Criteria) this;
        }

        public Criteria andEmNationNotBetween(String value1, String value2) {
            addCriterion("em_nation not between", value1, value2, "emNation");
            return (Criteria) this;
        }

        public Criteria andEmMarriageIsNull() {
            addCriterion("em_marriage is null");
            return (Criteria) this;
        }

        public Criteria andEmMarriageIsNotNull() {
            addCriterion("em_marriage is not null");
            return (Criteria) this;
        }

        public Criteria andEmMarriageEqualTo(String value) {
            addCriterion("em_marriage =", value, "emMarriage");
            return (Criteria) this;
        }

        public Criteria andEmMarriageNotEqualTo(String value) {
            addCriterion("em_marriage <>", value, "emMarriage");
            return (Criteria) this;
        }

        public Criteria andEmMarriageGreaterThan(String value) {
            addCriterion("em_marriage >", value, "emMarriage");
            return (Criteria) this;
        }

        public Criteria andEmMarriageGreaterThanOrEqualTo(String value) {
            addCriterion("em_marriage >=", value, "emMarriage");
            return (Criteria) this;
        }

        public Criteria andEmMarriageLessThan(String value) {
            addCriterion("em_marriage <", value, "emMarriage");
            return (Criteria) this;
        }

        public Criteria andEmMarriageLessThanOrEqualTo(String value) {
            addCriterion("em_marriage <=", value, "emMarriage");
            return (Criteria) this;
        }

        public Criteria andEmMarriageLike(String value) {
            addCriterion("em_marriage like", value, "emMarriage");
            return (Criteria) this;
        }

        public Criteria andEmMarriageNotLike(String value) {
            addCriterion("em_marriage not like", value, "emMarriage");
            return (Criteria) this;
        }

        public Criteria andEmMarriageIn(List<String> values) {
            addCriterion("em_marriage in", values, "emMarriage");
            return (Criteria) this;
        }

        public Criteria andEmMarriageNotIn(List<String> values) {
            addCriterion("em_marriage not in", values, "emMarriage");
            return (Criteria) this;
        }

        public Criteria andEmMarriageBetween(String value1, String value2) {
            addCriterion("em_marriage between", value1, value2, "emMarriage");
            return (Criteria) this;
        }

        public Criteria andEmMarriageNotBetween(String value1, String value2) {
            addCriterion("em_marriage not between", value1, value2, "emMarriage");
            return (Criteria) this;
        }

        public Criteria andEmVisageIsNull() {
            addCriterion("em_visage is null");
            return (Criteria) this;
        }

        public Criteria andEmVisageIsNotNull() {
            addCriterion("em_visage is not null");
            return (Criteria) this;
        }

        public Criteria andEmVisageEqualTo(String value) {
            addCriterion("em_visage =", value, "emVisage");
            return (Criteria) this;
        }

        public Criteria andEmVisageNotEqualTo(String value) {
            addCriterion("em_visage <>", value, "emVisage");
            return (Criteria) this;
        }

        public Criteria andEmVisageGreaterThan(String value) {
            addCriterion("em_visage >", value, "emVisage");
            return (Criteria) this;
        }

        public Criteria andEmVisageGreaterThanOrEqualTo(String value) {
            addCriterion("em_visage >=", value, "emVisage");
            return (Criteria) this;
        }

        public Criteria andEmVisageLessThan(String value) {
            addCriterion("em_visage <", value, "emVisage");
            return (Criteria) this;
        }

        public Criteria andEmVisageLessThanOrEqualTo(String value) {
            addCriterion("em_visage <=", value, "emVisage");
            return (Criteria) this;
        }

        public Criteria andEmVisageLike(String value) {
            addCriterion("em_visage like", value, "emVisage");
            return (Criteria) this;
        }

        public Criteria andEmVisageNotLike(String value) {
            addCriterion("em_visage not like", value, "emVisage");
            return (Criteria) this;
        }

        public Criteria andEmVisageIn(List<String> values) {
            addCriterion("em_visage in", values, "emVisage");
            return (Criteria) this;
        }

        public Criteria andEmVisageNotIn(List<String> values) {
            addCriterion("em_visage not in", values, "emVisage");
            return (Criteria) this;
        }

        public Criteria andEmVisageBetween(String value1, String value2) {
            addCriterion("em_visage between", value1, value2, "emVisage");
            return (Criteria) this;
        }

        public Criteria andEmVisageNotBetween(String value1, String value2) {
            addCriterion("em_visage not between", value1, value2, "emVisage");
            return (Criteria) this;
        }

        public Criteria andEmAncestralhomeIsNull() {
            addCriterion("em_ancestralHome is null");
            return (Criteria) this;
        }

        public Criteria andEmAncestralhomeIsNotNull() {
            addCriterion("em_ancestralHome is not null");
            return (Criteria) this;
        }

        public Criteria andEmAncestralhomeEqualTo(String value) {
            addCriterion("em_ancestralHome =", value, "emAncestralhome");
            return (Criteria) this;
        }

        public Criteria andEmAncestralhomeNotEqualTo(String value) {
            addCriterion("em_ancestralHome <>", value, "emAncestralhome");
            return (Criteria) this;
        }

        public Criteria andEmAncestralhomeGreaterThan(String value) {
            addCriterion("em_ancestralHome >", value, "emAncestralhome");
            return (Criteria) this;
        }

        public Criteria andEmAncestralhomeGreaterThanOrEqualTo(String value) {
            addCriterion("em_ancestralHome >=", value, "emAncestralhome");
            return (Criteria) this;
        }

        public Criteria andEmAncestralhomeLessThan(String value) {
            addCriterion("em_ancestralHome <", value, "emAncestralhome");
            return (Criteria) this;
        }

        public Criteria andEmAncestralhomeLessThanOrEqualTo(String value) {
            addCriterion("em_ancestralHome <=", value, "emAncestralhome");
            return (Criteria) this;
        }

        public Criteria andEmAncestralhomeLike(String value) {
            addCriterion("em_ancestralHome like", value, "emAncestralhome");
            return (Criteria) this;
        }

        public Criteria andEmAncestralhomeNotLike(String value) {
            addCriterion("em_ancestralHome not like", value, "emAncestralhome");
            return (Criteria) this;
        }

        public Criteria andEmAncestralhomeIn(List<String> values) {
            addCriterion("em_ancestralHome in", values, "emAncestralhome");
            return (Criteria) this;
        }

        public Criteria andEmAncestralhomeNotIn(List<String> values) {
            addCriterion("em_ancestralHome not in", values, "emAncestralhome");
            return (Criteria) this;
        }

        public Criteria andEmAncestralhomeBetween(String value1, String value2) {
            addCriterion("em_ancestralHome between", value1, value2, "emAncestralhome");
            return (Criteria) this;
        }

        public Criteria andEmAncestralhomeNotBetween(String value1, String value2) {
            addCriterion("em_ancestralHome not between", value1, value2, "emAncestralhome");
            return (Criteria) this;
        }

        public Criteria andEmTelIsNull() {
            addCriterion("em_tel is null");
            return (Criteria) this;
        }

        public Criteria andEmTelIsNotNull() {
            addCriterion("em_tel is not null");
            return (Criteria) this;
        }

        public Criteria andEmTelEqualTo(String value) {
            addCriterion("em_tel =", value, "emTel");
            return (Criteria) this;
        }

        public Criteria andEmTelNotEqualTo(String value) {
            addCriterion("em_tel <>", value, "emTel");
            return (Criteria) this;
        }

        public Criteria andEmTelGreaterThan(String value) {
            addCriterion("em_tel >", value, "emTel");
            return (Criteria) this;
        }

        public Criteria andEmTelGreaterThanOrEqualTo(String value) {
            addCriterion("em_tel >=", value, "emTel");
            return (Criteria) this;
        }

        public Criteria andEmTelLessThan(String value) {
            addCriterion("em_tel <", value, "emTel");
            return (Criteria) this;
        }

        public Criteria andEmTelLessThanOrEqualTo(String value) {
            addCriterion("em_tel <=", value, "emTel");
            return (Criteria) this;
        }

        public Criteria andEmTelLike(String value) {
            addCriterion("em_tel like", value, "emTel");
            return (Criteria) this;
        }

        public Criteria andEmTelNotLike(String value) {
            addCriterion("em_tel not like", value, "emTel");
            return (Criteria) this;
        }

        public Criteria andEmTelIn(List<String> values) {
            addCriterion("em_tel in", values, "emTel");
            return (Criteria) this;
        }

        public Criteria andEmTelNotIn(List<String> values) {
            addCriterion("em_tel not in", values, "emTel");
            return (Criteria) this;
        }

        public Criteria andEmTelBetween(String value1, String value2) {
            addCriterion("em_tel between", value1, value2, "emTel");
            return (Criteria) this;
        }

        public Criteria andEmTelNotBetween(String value1, String value2) {
            addCriterion("em_tel not between", value1, value2, "emTel");
            return (Criteria) this;
        }

        public Criteria andEmAddressIsNull() {
            addCriterion("em_address is null");
            return (Criteria) this;
        }

        public Criteria andEmAddressIsNotNull() {
            addCriterion("em_address is not null");
            return (Criteria) this;
        }

        public Criteria andEmAddressEqualTo(String value) {
            addCriterion("em_address =", value, "emAddress");
            return (Criteria) this;
        }

        public Criteria andEmAddressNotEqualTo(String value) {
            addCriterion("em_address <>", value, "emAddress");
            return (Criteria) this;
        }

        public Criteria andEmAddressGreaterThan(String value) {
            addCriterion("em_address >", value, "emAddress");
            return (Criteria) this;
        }

        public Criteria andEmAddressGreaterThanOrEqualTo(String value) {
            addCriterion("em_address >=", value, "emAddress");
            return (Criteria) this;
        }

        public Criteria andEmAddressLessThan(String value) {
            addCriterion("em_address <", value, "emAddress");
            return (Criteria) this;
        }

        public Criteria andEmAddressLessThanOrEqualTo(String value) {
            addCriterion("em_address <=", value, "emAddress");
            return (Criteria) this;
        }

        public Criteria andEmAddressLike(String value) {
            addCriterion("em_address like", value, "emAddress");
            return (Criteria) this;
        }

        public Criteria andEmAddressNotLike(String value) {
            addCriterion("em_address not like", value, "emAddress");
            return (Criteria) this;
        }

        public Criteria andEmAddressIn(List<String> values) {
            addCriterion("em_address in", values, "emAddress");
            return (Criteria) this;
        }

        public Criteria andEmAddressNotIn(List<String> values) {
            addCriterion("em_address not in", values, "emAddress");
            return (Criteria) this;
        }

        public Criteria andEmAddressBetween(String value1, String value2) {
            addCriterion("em_address between", value1, value2, "emAddress");
            return (Criteria) this;
        }

        public Criteria andEmAddressNotBetween(String value1, String value2) {
            addCriterion("em_address not between", value1, value2, "emAddress");
            return (Criteria) this;
        }

        public Criteria andEmAfterschoolIsNull() {
            addCriterion("em_afterSchool is null");
            return (Criteria) this;
        }

        public Criteria andEmAfterschoolIsNotNull() {
            addCriterion("em_afterSchool is not null");
            return (Criteria) this;
        }

        public Criteria andEmAfterschoolEqualTo(String value) {
            addCriterion("em_afterSchool =", value, "emAfterschool");
            return (Criteria) this;
        }

        public Criteria andEmAfterschoolNotEqualTo(String value) {
            addCriterion("em_afterSchool <>", value, "emAfterschool");
            return (Criteria) this;
        }

        public Criteria andEmAfterschoolGreaterThan(String value) {
            addCriterion("em_afterSchool >", value, "emAfterschool");
            return (Criteria) this;
        }

        public Criteria andEmAfterschoolGreaterThanOrEqualTo(String value) {
            addCriterion("em_afterSchool >=", value, "emAfterschool");
            return (Criteria) this;
        }

        public Criteria andEmAfterschoolLessThan(String value) {
            addCriterion("em_afterSchool <", value, "emAfterschool");
            return (Criteria) this;
        }

        public Criteria andEmAfterschoolLessThanOrEqualTo(String value) {
            addCriterion("em_afterSchool <=", value, "emAfterschool");
            return (Criteria) this;
        }

        public Criteria andEmAfterschoolLike(String value) {
            addCriterion("em_afterSchool like", value, "emAfterschool");
            return (Criteria) this;
        }

        public Criteria andEmAfterschoolNotLike(String value) {
            addCriterion("em_afterSchool not like", value, "emAfterschool");
            return (Criteria) this;
        }

        public Criteria andEmAfterschoolIn(List<String> values) {
            addCriterion("em_afterSchool in", values, "emAfterschool");
            return (Criteria) this;
        }

        public Criteria andEmAfterschoolNotIn(List<String> values) {
            addCriterion("em_afterSchool not in", values, "emAfterschool");
            return (Criteria) this;
        }

        public Criteria andEmAfterschoolBetween(String value1, String value2) {
            addCriterion("em_afterSchool between", value1, value2, "emAfterschool");
            return (Criteria) this;
        }

        public Criteria andEmAfterschoolNotBetween(String value1, String value2) {
            addCriterion("em_afterSchool not between", value1, value2, "emAfterschool");
            return (Criteria) this;
        }

        public Criteria andEmSpecialityIsNull() {
            addCriterion("em_speciality is null");
            return (Criteria) this;
        }

        public Criteria andEmSpecialityIsNotNull() {
            addCriterion("em_speciality is not null");
            return (Criteria) this;
        }

        public Criteria andEmSpecialityEqualTo(String value) {
            addCriterion("em_speciality =", value, "emSpeciality");
            return (Criteria) this;
        }

        public Criteria andEmSpecialityNotEqualTo(String value) {
            addCriterion("em_speciality <>", value, "emSpeciality");
            return (Criteria) this;
        }

        public Criteria andEmSpecialityGreaterThan(String value) {
            addCriterion("em_speciality >", value, "emSpeciality");
            return (Criteria) this;
        }

        public Criteria andEmSpecialityGreaterThanOrEqualTo(String value) {
            addCriterion("em_speciality >=", value, "emSpeciality");
            return (Criteria) this;
        }

        public Criteria andEmSpecialityLessThan(String value) {
            addCriterion("em_speciality <", value, "emSpeciality");
            return (Criteria) this;
        }

        public Criteria andEmSpecialityLessThanOrEqualTo(String value) {
            addCriterion("em_speciality <=", value, "emSpeciality");
            return (Criteria) this;
        }

        public Criteria andEmSpecialityLike(String value) {
            addCriterion("em_speciality like", value, "emSpeciality");
            return (Criteria) this;
        }

        public Criteria andEmSpecialityNotLike(String value) {
            addCriterion("em_speciality not like", value, "emSpeciality");
            return (Criteria) this;
        }

        public Criteria andEmSpecialityIn(List<String> values) {
            addCriterion("em_speciality in", values, "emSpeciality");
            return (Criteria) this;
        }

        public Criteria andEmSpecialityNotIn(List<String> values) {
            addCriterion("em_speciality not in", values, "emSpeciality");
            return (Criteria) this;
        }

        public Criteria andEmSpecialityBetween(String value1, String value2) {
            addCriterion("em_speciality between", value1, value2, "emSpeciality");
            return (Criteria) this;
        }

        public Criteria andEmSpecialityNotBetween(String value1, String value2) {
            addCriterion("em_speciality not between", value1, value2, "emSpeciality");
            return (Criteria) this;
        }

        public Criteria andEmCultureIsNull() {
            addCriterion("em_culture is null");
            return (Criteria) this;
        }

        public Criteria andEmCultureIsNotNull() {
            addCriterion("em_culture is not null");
            return (Criteria) this;
        }

        public Criteria andEmCultureEqualTo(String value) {
            addCriterion("em_culture =", value, "emCulture");
            return (Criteria) this;
        }

        public Criteria andEmCultureNotEqualTo(String value) {
            addCriterion("em_culture <>", value, "emCulture");
            return (Criteria) this;
        }

        public Criteria andEmCultureGreaterThan(String value) {
            addCriterion("em_culture >", value, "emCulture");
            return (Criteria) this;
        }

        public Criteria andEmCultureGreaterThanOrEqualTo(String value) {
            addCriterion("em_culture >=", value, "emCulture");
            return (Criteria) this;
        }

        public Criteria andEmCultureLessThan(String value) {
            addCriterion("em_culture <", value, "emCulture");
            return (Criteria) this;
        }

        public Criteria andEmCultureLessThanOrEqualTo(String value) {
            addCriterion("em_culture <=", value, "emCulture");
            return (Criteria) this;
        }

        public Criteria andEmCultureLike(String value) {
            addCriterion("em_culture like", value, "emCulture");
            return (Criteria) this;
        }

        public Criteria andEmCultureNotLike(String value) {
            addCriterion("em_culture not like", value, "emCulture");
            return (Criteria) this;
        }

        public Criteria andEmCultureIn(List<String> values) {
            addCriterion("em_culture in", values, "emCulture");
            return (Criteria) this;
        }

        public Criteria andEmCultureNotIn(List<String> values) {
            addCriterion("em_culture not in", values, "emCulture");
            return (Criteria) this;
        }

        public Criteria andEmCultureBetween(String value1, String value2) {
            addCriterion("em_culture between", value1, value2, "emCulture");
            return (Criteria) this;
        }

        public Criteria andEmCultureNotBetween(String value1, String value2) {
            addCriterion("em_culture not between", value1, value2, "emCulture");
            return (Criteria) this;
        }

        public Criteria andEmStartimeIsNull() {
            addCriterion("em_startime is null");
            return (Criteria) this;
        }

        public Criteria andEmStartimeIsNotNull() {
            addCriterion("em_startime is not null");
            return (Criteria) this;
        }

        public Criteria andEmStartimeEqualTo(String value) {
            addCriterion("em_startime =", value, "emStartime");
            return (Criteria) this;
        }

        public Criteria andEmStartimeNotEqualTo(String value) {
            addCriterion("em_startime <>", value, "emStartime");
            return (Criteria) this;
        }

        public Criteria andEmStartimeGreaterThan(String value) {
            addCriterion("em_startime >", value, "emStartime");
            return (Criteria) this;
        }

        public Criteria andEmStartimeGreaterThanOrEqualTo(String value) {
            addCriterion("em_startime >=", value, "emStartime");
            return (Criteria) this;
        }

        public Criteria andEmStartimeLessThan(String value) {
            addCriterion("em_startime <", value, "emStartime");
            return (Criteria) this;
        }

        public Criteria andEmStartimeLessThanOrEqualTo(String value) {
            addCriterion("em_startime <=", value, "emStartime");
            return (Criteria) this;
        }

        public Criteria andEmStartimeLike(String value) {
            addCriterion("em_startime like", value, "emStartime");
            return (Criteria) this;
        }

        public Criteria andEmStartimeNotLike(String value) {
            addCriterion("em_startime not like", value, "emStartime");
            return (Criteria) this;
        }

        public Criteria andEmStartimeIn(List<String> values) {
            addCriterion("em_startime in", values, "emStartime");
            return (Criteria) this;
        }

        public Criteria andEmStartimeNotIn(List<String> values) {
            addCriterion("em_startime not in", values, "emStartime");
            return (Criteria) this;
        }

        public Criteria andEmStartimeBetween(String value1, String value2) {
            addCriterion("em_startime between", value1, value2, "emStartime");
            return (Criteria) this;
        }

        public Criteria andEmStartimeNotBetween(String value1, String value2) {
            addCriterion("em_startime not between", value1, value2, "emStartime");
            return (Criteria) this;
        }

        public Criteria andEmDepartmentidIsNull() {
            addCriterion("em_departmentId is null");
            return (Criteria) this;
        }

        public Criteria andEmDepartmentidIsNotNull() {
            addCriterion("em_departmentId is not null");
            return (Criteria) this;
        }

        public Criteria andEmDepartmentidEqualTo(Integer value) {
            addCriterion("em_departmentId =", value, "emDepartmentid");
            return (Criteria) this;
        }

        public Criteria andEmDepartmentidNotEqualTo(Integer value) {
            addCriterion("em_departmentId <>", value, "emDepartmentid");
            return (Criteria) this;
        }

        public Criteria andEmDepartmentidGreaterThan(Integer value) {
            addCriterion("em_departmentId >", value, "emDepartmentid");
            return (Criteria) this;
        }

        public Criteria andEmDepartmentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("em_departmentId >=", value, "emDepartmentid");
            return (Criteria) this;
        }

        public Criteria andEmDepartmentidLessThan(Integer value) {
            addCriterion("em_departmentId <", value, "emDepartmentid");
            return (Criteria) this;
        }

        public Criteria andEmDepartmentidLessThanOrEqualTo(Integer value) {
            addCriterion("em_departmentId <=", value, "emDepartmentid");
            return (Criteria) this;
        }

        public Criteria andEmDepartmentidIn(List<Integer> values) {
            addCriterion("em_departmentId in", values, "emDepartmentid");
            return (Criteria) this;
        }

        public Criteria andEmDepartmentidNotIn(List<Integer> values) {
            addCriterion("em_departmentId not in", values, "emDepartmentid");
            return (Criteria) this;
        }

        public Criteria andEmDepartmentidBetween(Integer value1, Integer value2) {
            addCriterion("em_departmentId between", value1, value2, "emDepartmentid");
            return (Criteria) this;
        }

        public Criteria andEmDepartmentidNotBetween(Integer value1, Integer value2) {
            addCriterion("em_departmentId not between", value1, value2, "emDepartmentid");
            return (Criteria) this;
        }

        public Criteria andEmTypeworkIsNull() {
            addCriterion("em_typeWork is null");
            return (Criteria) this;
        }

        public Criteria andEmTypeworkIsNotNull() {
            addCriterion("em_typeWork is not null");
            return (Criteria) this;
        }

        public Criteria andEmTypeworkEqualTo(String value) {
            addCriterion("em_typeWork =", value, "emTypework");
            return (Criteria) this;
        }

        public Criteria andEmTypeworkNotEqualTo(String value) {
            addCriterion("em_typeWork <>", value, "emTypework");
            return (Criteria) this;
        }

        public Criteria andEmTypeworkGreaterThan(String value) {
            addCriterion("em_typeWork >", value, "emTypework");
            return (Criteria) this;
        }

        public Criteria andEmTypeworkGreaterThanOrEqualTo(String value) {
            addCriterion("em_typeWork >=", value, "emTypework");
            return (Criteria) this;
        }

        public Criteria andEmTypeworkLessThan(String value) {
            addCriterion("em_typeWork <", value, "emTypework");
            return (Criteria) this;
        }

        public Criteria andEmTypeworkLessThanOrEqualTo(String value) {
            addCriterion("em_typeWork <=", value, "emTypework");
            return (Criteria) this;
        }

        public Criteria andEmTypeworkLike(String value) {
            addCriterion("em_typeWork like", value, "emTypework");
            return (Criteria) this;
        }

        public Criteria andEmTypeworkNotLike(String value) {
            addCriterion("em_typeWork not like", value, "emTypework");
            return (Criteria) this;
        }

        public Criteria andEmTypeworkIn(List<String> values) {
            addCriterion("em_typeWork in", values, "emTypework");
            return (Criteria) this;
        }

        public Criteria andEmTypeworkNotIn(List<String> values) {
            addCriterion("em_typeWork not in", values, "emTypework");
            return (Criteria) this;
        }

        public Criteria andEmTypeworkBetween(String value1, String value2) {
            addCriterion("em_typeWork between", value1, value2, "emTypework");
            return (Criteria) this;
        }

        public Criteria andEmTypeworkNotBetween(String value1, String value2) {
            addCriterion("em_typeWork not between", value1, value2, "emTypework");
            return (Criteria) this;
        }

        public Criteria andEmCreatimeIsNull() {
            addCriterion("em_creatime is null");
            return (Criteria) this;
        }

        public Criteria andEmCreatimeIsNotNull() {
            addCriterion("em_creatime is not null");
            return (Criteria) this;
        }

        public Criteria andEmCreatimeEqualTo(String value) {
            addCriterion("em_creatime =", value, "emCreatime");
            return (Criteria) this;
        }

        public Criteria andEmCreatimeNotEqualTo(String value) {
            addCriterion("em_creatime <>", value, "emCreatime");
            return (Criteria) this;
        }

        public Criteria andEmCreatimeGreaterThan(String value) {
            addCriterion("em_creatime >", value, "emCreatime");
            return (Criteria) this;
        }

        public Criteria andEmCreatimeGreaterThanOrEqualTo(String value) {
            addCriterion("em_creatime >=", value, "emCreatime");
            return (Criteria) this;
        }

        public Criteria andEmCreatimeLessThan(String value) {
            addCriterion("em_creatime <", value, "emCreatime");
            return (Criteria) this;
        }

        public Criteria andEmCreatimeLessThanOrEqualTo(String value) {
            addCriterion("em_creatime <=", value, "emCreatime");
            return (Criteria) this;
        }

        public Criteria andEmCreatimeLike(String value) {
            addCriterion("em_creatime like", value, "emCreatime");
            return (Criteria) this;
        }

        public Criteria andEmCreatimeNotLike(String value) {
            addCriterion("em_creatime not like", value, "emCreatime");
            return (Criteria) this;
        }

        public Criteria andEmCreatimeIn(List<String> values) {
            addCriterion("em_creatime in", values, "emCreatime");
            return (Criteria) this;
        }

        public Criteria andEmCreatimeNotIn(List<String> values) {
            addCriterion("em_creatime not in", values, "emCreatime");
            return (Criteria) this;
        }

        public Criteria andEmCreatimeBetween(String value1, String value2) {
            addCriterion("em_creatime between", value1, value2, "emCreatime");
            return (Criteria) this;
        }

        public Criteria andEmCreatimeNotBetween(String value1, String value2) {
            addCriterion("em_creatime not between", value1, value2, "emCreatime");
            return (Criteria) this;
        }

        public Criteria andEmCreatenameIsNull() {
            addCriterion("em_createName is null");
            return (Criteria) this;
        }

        public Criteria andEmCreatenameIsNotNull() {
            addCriterion("em_createName is not null");
            return (Criteria) this;
        }

        public Criteria andEmCreatenameEqualTo(String value) {
            addCriterion("em_createName =", value, "emCreatename");
            return (Criteria) this;
        }

        public Criteria andEmCreatenameNotEqualTo(String value) {
            addCriterion("em_createName <>", value, "emCreatename");
            return (Criteria) this;
        }

        public Criteria andEmCreatenameGreaterThan(String value) {
            addCriterion("em_createName >", value, "emCreatename");
            return (Criteria) this;
        }

        public Criteria andEmCreatenameGreaterThanOrEqualTo(String value) {
            addCriterion("em_createName >=", value, "emCreatename");
            return (Criteria) this;
        }

        public Criteria andEmCreatenameLessThan(String value) {
            addCriterion("em_createName <", value, "emCreatename");
            return (Criteria) this;
        }

        public Criteria andEmCreatenameLessThanOrEqualTo(String value) {
            addCriterion("em_createName <=", value, "emCreatename");
            return (Criteria) this;
        }

        public Criteria andEmCreatenameLike(String value) {
            addCriterion("em_createName like", value, "emCreatename");
            return (Criteria) this;
        }

        public Criteria andEmCreatenameNotLike(String value) {
            addCriterion("em_createName not like", value, "emCreatename");
            return (Criteria) this;
        }

        public Criteria andEmCreatenameIn(List<String> values) {
            addCriterion("em_createName in", values, "emCreatename");
            return (Criteria) this;
        }

        public Criteria andEmCreatenameNotIn(List<String> values) {
            addCriterion("em_createName not in", values, "emCreatename");
            return (Criteria) this;
        }

        public Criteria andEmCreatenameBetween(String value1, String value2) {
            addCriterion("em_createName between", value1, value2, "emCreatename");
            return (Criteria) this;
        }

        public Criteria andEmCreatenameNotBetween(String value1, String value2) {
            addCriterion("em_createName not between", value1, value2, "emCreatename");
            return (Criteria) this;
        }

        public Criteria andEmBzIsNull() {
            addCriterion("em_bz is null");
            return (Criteria) this;
        }

        public Criteria andEmBzIsNotNull() {
            addCriterion("em_bz is not null");
            return (Criteria) this;
        }

        public Criteria andEmBzEqualTo(String value) {
            addCriterion("em_bz =", value, "emBz");
            return (Criteria) this;
        }

        public Criteria andEmBzNotEqualTo(String value) {
            addCriterion("em_bz <>", value, "emBz");
            return (Criteria) this;
        }

        public Criteria andEmBzGreaterThan(String value) {
            addCriterion("em_bz >", value, "emBz");
            return (Criteria) this;
        }

        public Criteria andEmBzGreaterThanOrEqualTo(String value) {
            addCriterion("em_bz >=", value, "emBz");
            return (Criteria) this;
        }

        public Criteria andEmBzLessThan(String value) {
            addCriterion("em_bz <", value, "emBz");
            return (Criteria) this;
        }

        public Criteria andEmBzLessThanOrEqualTo(String value) {
            addCriterion("em_bz <=", value, "emBz");
            return (Criteria) this;
        }

        public Criteria andEmBzLike(String value) {
            addCriterion("em_bz like", value, "emBz");
            return (Criteria) this;
        }

        public Criteria andEmBzNotLike(String value) {
            addCriterion("em_bz not like", value, "emBz");
            return (Criteria) this;
        }

        public Criteria andEmBzIn(List<String> values) {
            addCriterion("em_bz in", values, "emBz");
            return (Criteria) this;
        }

        public Criteria andEmBzNotIn(List<String> values) {
            addCriterion("em_bz not in", values, "emBz");
            return (Criteria) this;
        }

        public Criteria andEmBzBetween(String value1, String value2) {
            addCriterion("em_bz between", value1, value2, "emBz");
            return (Criteria) this;
        }

        public Criteria andEmBzNotBetween(String value1, String value2) {
            addCriterion("em_bz not between", value1, value2, "emBz");
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