package com.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentRegisterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public StudentRegisterExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andStrIdIsNull() {
            addCriterion("str_id is null");
            return (Criteria) this;
        }

        public Criteria andStrIdIsNotNull() {
            addCriterion("str_id is not null");
            return (Criteria) this;
        }

        public Criteria andStrIdEqualTo(String value) {
            addCriterion("str_id =", value, "strId");
            return (Criteria) this;
        }

        public Criteria andStrIdNotEqualTo(String value) {
            addCriterion("str_id <>", value, "strId");
            return (Criteria) this;
        }

        public Criteria andStrIdGreaterThan(String value) {
            addCriterion("str_id >", value, "strId");
            return (Criteria) this;
        }

        public Criteria andStrIdGreaterThanOrEqualTo(String value) {
            addCriterion("str_id >=", value, "strId");
            return (Criteria) this;
        }

        public Criteria andStrIdLessThan(String value) {
            addCriterion("str_id <", value, "strId");
            return (Criteria) this;
        }

        public Criteria andStrIdLessThanOrEqualTo(String value) {
            addCriterion("str_id <=", value, "strId");
            return (Criteria) this;
        }

        public Criteria andStrIdLike(String value) {
            addCriterion("str_id like", value, "strId");
            return (Criteria) this;
        }

        public Criteria andStrIdNotLike(String value) {
            addCriterion("str_id not like", value, "strId");
            return (Criteria) this;
        }

        public Criteria andStrIdIn(List<String> values) {
            addCriterion("str_id in", values, "strId");
            return (Criteria) this;
        }

        public Criteria andStrIdNotIn(List<String> values) {
            addCriterion("str_id not in", values, "strId");
            return (Criteria) this;
        }

        public Criteria andStrIdBetween(String value1, String value2) {
            addCriterion("str_id between", value1, value2, "strId");
            return (Criteria) this;
        }

        public Criteria andStrIdNotBetween(String value1, String value2) {
            addCriterion("str_id not between", value1, value2, "strId");
            return (Criteria) this;
        }

        public Criteria andSciIdIsNull() {
            addCriterion("sci_id is null");
            return (Criteria) this;
        }

        public Criteria andSciIdIsNotNull() {
            addCriterion("sci_id is not null");
            return (Criteria) this;
        }

        public Criteria andSciIdEqualTo(String value) {
            addCriterion("sci_id =", value, "sciId");
            return (Criteria) this;
        }

        public Criteria andSciIdNotEqualTo(String value) {
            addCriterion("sci_id <>", value, "sciId");
            return (Criteria) this;
        }

        public Criteria andSciIdGreaterThan(String value) {
            addCriterion("sci_id >", value, "sciId");
            return (Criteria) this;
        }

        public Criteria andSciIdGreaterThanOrEqualTo(String value) {
            addCriterion("sci_id >=", value, "sciId");
            return (Criteria) this;
        }

        public Criteria andSciIdLessThan(String value) {
            addCriterion("sci_id <", value, "sciId");
            return (Criteria) this;
        }

        public Criteria andSciIdLessThanOrEqualTo(String value) {
            addCriterion("sci_id <=", value, "sciId");
            return (Criteria) this;
        }

        public Criteria andSciIdLike(String value) {
            addCriterion("sci_id like", value, "sciId");
            return (Criteria) this;
        }

        public Criteria andSciIdNotLike(String value) {
            addCriterion("sci_id not like", value, "sciId");
            return (Criteria) this;
        }

        public Criteria andSciIdIn(List<String> values) {
            addCriterion("sci_id in", values, "sciId");
            return (Criteria) this;
        }

        public Criteria andSciIdNotIn(List<String> values) {
            addCriterion("sci_id not in", values, "sciId");
            return (Criteria) this;
        }

        public Criteria andSciIdBetween(String value1, String value2) {
            addCriterion("sci_id between", value1, value2, "sciId");
            return (Criteria) this;
        }

        public Criteria andSciIdNotBetween(String value1, String value2) {
            addCriterion("sci_id not between", value1, value2, "sciId");
            return (Criteria) this;
        }

        public Criteria andStiIdIsNull() {
            addCriterion("sti_id is null");
            return (Criteria) this;
        }

        public Criteria andStiIdIsNotNull() {
            addCriterion("sti_id is not null");
            return (Criteria) this;
        }

        public Criteria andStiIdEqualTo(String value) {
            addCriterion("sti_id =", value, "stiId");
            return (Criteria) this;
        }

        public Criteria andStiIdNotEqualTo(String value) {
            addCriterion("sti_id <>", value, "stiId");
            return (Criteria) this;
        }

        public Criteria andStiIdGreaterThan(String value) {
            addCriterion("sti_id >", value, "stiId");
            return (Criteria) this;
        }

        public Criteria andStiIdGreaterThanOrEqualTo(String value) {
            addCriterion("sti_id >=", value, "stiId");
            return (Criteria) this;
        }

        public Criteria andStiIdLessThan(String value) {
            addCriterion("sti_id <", value, "stiId");
            return (Criteria) this;
        }

        public Criteria andStiIdLessThanOrEqualTo(String value) {
            addCriterion("sti_id <=", value, "stiId");
            return (Criteria) this;
        }

        public Criteria andStiIdLike(String value) {
            addCriterion("sti_id like", value, "stiId");
            return (Criteria) this;
        }

        public Criteria andStiIdNotLike(String value) {
            addCriterion("sti_id not like", value, "stiId");
            return (Criteria) this;
        }

        public Criteria andStiIdIn(List<String> values) {
            addCriterion("sti_id in", values, "stiId");
            return (Criteria) this;
        }

        public Criteria andStiIdNotIn(List<String> values) {
            addCriterion("sti_id not in", values, "stiId");
            return (Criteria) this;
        }

        public Criteria andStiIdBetween(String value1, String value2) {
            addCriterion("sti_id between", value1, value2, "stiId");
            return (Criteria) this;
        }

        public Criteria andStiIdNotBetween(String value1, String value2) {
            addCriterion("sti_id not between", value1, value2, "stiId");
            return (Criteria) this;
        }

        public Criteria andStrDjrqIsNull() {
            addCriterion("str_djrq is null");
            return (Criteria) this;
        }

        public Criteria andStrDjrqIsNotNull() {
            addCriterion("str_djrq is not null");
            return (Criteria) this;
        }

        public Criteria andStrDjrqEqualTo(Date value) {
            addCriterion("str_djrq =", value, "strDjrq");
            return (Criteria) this;
        }

        public Criteria andStrDjrqNotEqualTo(Date value) {
            addCriterion("str_djrq <>", value, "strDjrq");
            return (Criteria) this;
        }

        public Criteria andStrDjrqGreaterThan(Date value) {
            addCriterion("str_djrq >", value, "strDjrq");
            return (Criteria) this;
        }

        public Criteria andStrDjrqGreaterThanOrEqualTo(Date value) {
            addCriterion("str_djrq >=", value, "strDjrq");
            return (Criteria) this;
        }

        public Criteria andStrDjrqLessThan(Date value) {
            addCriterion("str_djrq <", value, "strDjrq");
            return (Criteria) this;
        }

        public Criteria andStrDjrqLessThanOrEqualTo(Date value) {
            addCriterion("str_djrq <=", value, "strDjrq");
            return (Criteria) this;
        }

        public Criteria andStrDjrqIn(List<Date> values) {
            addCriterion("str_djrq in", values, "strDjrq");
            return (Criteria) this;
        }

        public Criteria andStrDjrqNotIn(List<Date> values) {
            addCriterion("str_djrq not in", values, "strDjrq");
            return (Criteria) this;
        }

        public Criteria andStrDjrqBetween(Date value1, Date value2) {
            addCriterion("str_djrq between", value1, value2, "strDjrq");
            return (Criteria) this;
        }

        public Criteria andStrDjrqNotBetween(Date value1, Date value2) {
            addCriterion("str_djrq not between", value1, value2, "strDjrq");
            return (Criteria) this;
        }

        public Criteria andStrJbrIsNull() {
            addCriterion("str_jbr is null");
            return (Criteria) this;
        }

        public Criteria andStrJbrIsNotNull() {
            addCriterion("str_jbr is not null");
            return (Criteria) this;
        }

        public Criteria andStrJbrEqualTo(String value) {
            addCriterion("str_jbr =", value, "strJbr");
            return (Criteria) this;
        }

        public Criteria andStrJbrNotEqualTo(String value) {
            addCriterion("str_jbr <>", value, "strJbr");
            return (Criteria) this;
        }

        public Criteria andStrJbrGreaterThan(String value) {
            addCriterion("str_jbr >", value, "strJbr");
            return (Criteria) this;
        }

        public Criteria andStrJbrGreaterThanOrEqualTo(String value) {
            addCriterion("str_jbr >=", value, "strJbr");
            return (Criteria) this;
        }

        public Criteria andStrJbrLessThan(String value) {
            addCriterion("str_jbr <", value, "strJbr");
            return (Criteria) this;
        }

        public Criteria andStrJbrLessThanOrEqualTo(String value) {
            addCriterion("str_jbr <=", value, "strJbr");
            return (Criteria) this;
        }

        public Criteria andStrJbrLike(String value) {
            addCriterion("str_jbr like", value, "strJbr");
            return (Criteria) this;
        }

        public Criteria andStrJbrNotLike(String value) {
            addCriterion("str_jbr not like", value, "strJbr");
            return (Criteria) this;
        }

        public Criteria andStrJbrIn(List<String> values) {
            addCriterion("str_jbr in", values, "strJbr");
            return (Criteria) this;
        }

        public Criteria andStrJbrNotIn(List<String> values) {
            addCriterion("str_jbr not in", values, "strJbr");
            return (Criteria) this;
        }

        public Criteria andStrJbrBetween(String value1, String value2) {
            addCriterion("str_jbr between", value1, value2, "strJbr");
            return (Criteria) this;
        }

        public Criteria andStrJbrNotBetween(String value1, String value2) {
            addCriterion("str_jbr not between", value1, value2, "strJbr");
            return (Criteria) this;
        }

        public Criteria andStrLqfsIsNull() {
            addCriterion("str_lqfs is null");
            return (Criteria) this;
        }

        public Criteria andStrLqfsIsNotNull() {
            addCriterion("str_lqfs is not null");
            return (Criteria) this;
        }

        public Criteria andStrLqfsEqualTo(Double value) {
            addCriterion("str_lqfs =", value, "strLqfs");
            return (Criteria) this;
        }

        public Criteria andStrLqfsNotEqualTo(Double value) {
            addCriterion("str_lqfs <>", value, "strLqfs");
            return (Criteria) this;
        }

        public Criteria andStrLqfsGreaterThan(Double value) {
            addCriterion("str_lqfs >", value, "strLqfs");
            return (Criteria) this;
        }

        public Criteria andStrLqfsGreaterThanOrEqualTo(Double value) {
            addCriterion("str_lqfs >=", value, "strLqfs");
            return (Criteria) this;
        }

        public Criteria andStrLqfsLessThan(Double value) {
            addCriterion("str_lqfs <", value, "strLqfs");
            return (Criteria) this;
        }

        public Criteria andStrLqfsLessThanOrEqualTo(Double value) {
            addCriterion("str_lqfs <=", value, "strLqfs");
            return (Criteria) this;
        }

        public Criteria andStrLqfsIn(List<Double> values) {
            addCriterion("str_lqfs in", values, "strLqfs");
            return (Criteria) this;
        }

        public Criteria andStrLqfsNotIn(List<Double> values) {
            addCriterion("str_lqfs not in", values, "strLqfs");
            return (Criteria) this;
        }

        public Criteria andStrLqfsBetween(Double value1, Double value2) {
            addCriterion("str_lqfs between", value1, value2, "strLqfs");
            return (Criteria) this;
        }

        public Criteria andStrLqfsNotBetween(Double value1, Double value2) {
            addCriterion("str_lqfs not between", value1, value2, "strLqfs");
            return (Criteria) this;
        }

        public Criteria andStrZymcIsNull() {
            addCriterion("str_zymc is null");
            return (Criteria) this;
        }

        public Criteria andStrZymcIsNotNull() {
            addCriterion("str_zymc is not null");
            return (Criteria) this;
        }

        public Criteria andStrZymcEqualTo(String value) {
            addCriterion("str_zymc =", value, "strZymc");
            return (Criteria) this;
        }

        public Criteria andStrZymcNotEqualTo(String value) {
            addCriterion("str_zymc <>", value, "strZymc");
            return (Criteria) this;
        }

        public Criteria andStrZymcGreaterThan(String value) {
            addCriterion("str_zymc >", value, "strZymc");
            return (Criteria) this;
        }

        public Criteria andStrZymcGreaterThanOrEqualTo(String value) {
            addCriterion("str_zymc >=", value, "strZymc");
            return (Criteria) this;
        }

        public Criteria andStrZymcLessThan(String value) {
            addCriterion("str_zymc <", value, "strZymc");
            return (Criteria) this;
        }

        public Criteria andStrZymcLessThanOrEqualTo(String value) {
            addCriterion("str_zymc <=", value, "strZymc");
            return (Criteria) this;
        }

        public Criteria andStrZymcLike(String value) {
            addCriterion("str_zymc like", value, "strZymc");
            return (Criteria) this;
        }

        public Criteria andStrZymcNotLike(String value) {
            addCriterion("str_zymc not like", value, "strZymc");
            return (Criteria) this;
        }

        public Criteria andStrZymcIn(List<String> values) {
            addCriterion("str_zymc in", values, "strZymc");
            return (Criteria) this;
        }

        public Criteria andStrZymcNotIn(List<String> values) {
            addCriterion("str_zymc not in", values, "strZymc");
            return (Criteria) this;
        }

        public Criteria andStrZymcBetween(String value1, String value2) {
            addCriterion("str_zymc between", value1, value2, "strZymc");
            return (Criteria) this;
        }

        public Criteria andStrZymcNotBetween(String value1, String value2) {
            addCriterion("str_zymc not between", value1, value2, "strZymc");
            return (Criteria) this;
        }
    }

    /**
     */
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