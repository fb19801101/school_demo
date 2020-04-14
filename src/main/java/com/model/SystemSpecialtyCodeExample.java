package com.model;

import java.util.ArrayList;
import java.util.List;

public class SystemSpecialtyCodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public SystemSpecialtyCodeExample() {
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

        public Criteria andSscCodeIsNull() {
            addCriterion("ssc_code is null");
            return (Criteria) this;
        }

        public Criteria andSscCodeIsNotNull() {
            addCriterion("ssc_code is not null");
            return (Criteria) this;
        }

        public Criteria andSscCodeEqualTo(String value) {
            addCriterion("ssc_code =", value, "sscCode");
            return (Criteria) this;
        }

        public Criteria andSscCodeNotEqualTo(String value) {
            addCriterion("ssc_code <>", value, "sscCode");
            return (Criteria) this;
        }

        public Criteria andSscCodeGreaterThan(String value) {
            addCriterion("ssc_code >", value, "sscCode");
            return (Criteria) this;
        }

        public Criteria andSscCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ssc_code >=", value, "sscCode");
            return (Criteria) this;
        }

        public Criteria andSscCodeLessThan(String value) {
            addCriterion("ssc_code <", value, "sscCode");
            return (Criteria) this;
        }

        public Criteria andSscCodeLessThanOrEqualTo(String value) {
            addCriterion("ssc_code <=", value, "sscCode");
            return (Criteria) this;
        }

        public Criteria andSscCodeLike(String value) {
            addCriterion("ssc_code like", value, "sscCode");
            return (Criteria) this;
        }

        public Criteria andSscCodeNotLike(String value) {
            addCriterion("ssc_code not like", value, "sscCode");
            return (Criteria) this;
        }

        public Criteria andSscCodeIn(List<String> values) {
            addCriterion("ssc_code in", values, "sscCode");
            return (Criteria) this;
        }

        public Criteria andSscCodeNotIn(List<String> values) {
            addCriterion("ssc_code not in", values, "sscCode");
            return (Criteria) this;
        }

        public Criteria andSscCodeBetween(String value1, String value2) {
            addCriterion("ssc_code between", value1, value2, "sscCode");
            return (Criteria) this;
        }

        public Criteria andSscCodeNotBetween(String value1, String value2) {
            addCriterion("ssc_code not between", value1, value2, "sscCode");
            return (Criteria) this;
        }

        public Criteria andSscNameIsNull() {
            addCriterion("ssc_name is null");
            return (Criteria) this;
        }

        public Criteria andSscNameIsNotNull() {
            addCriterion("ssc_name is not null");
            return (Criteria) this;
        }

        public Criteria andSscNameEqualTo(String value) {
            addCriterion("ssc_name =", value, "sscName");
            return (Criteria) this;
        }

        public Criteria andSscNameNotEqualTo(String value) {
            addCriterion("ssc_name <>", value, "sscName");
            return (Criteria) this;
        }

        public Criteria andSscNameGreaterThan(String value) {
            addCriterion("ssc_name >", value, "sscName");
            return (Criteria) this;
        }

        public Criteria andSscNameGreaterThanOrEqualTo(String value) {
            addCriterion("ssc_name >=", value, "sscName");
            return (Criteria) this;
        }

        public Criteria andSscNameLessThan(String value) {
            addCriterion("ssc_name <", value, "sscName");
            return (Criteria) this;
        }

        public Criteria andSscNameLessThanOrEqualTo(String value) {
            addCriterion("ssc_name <=", value, "sscName");
            return (Criteria) this;
        }

        public Criteria andSscNameLike(String value) {
            addCriterion("ssc_name like", value, "sscName");
            return (Criteria) this;
        }

        public Criteria andSscNameNotLike(String value) {
            addCriterion("ssc_name not like", value, "sscName");
            return (Criteria) this;
        }

        public Criteria andSscNameIn(List<String> values) {
            addCriterion("ssc_name in", values, "sscName");
            return (Criteria) this;
        }

        public Criteria andSscNameNotIn(List<String> values) {
            addCriterion("ssc_name not in", values, "sscName");
            return (Criteria) this;
        }

        public Criteria andSscNameBetween(String value1, String value2) {
            addCriterion("ssc_name between", value1, value2, "sscName");
            return (Criteria) this;
        }

        public Criteria andSscNameNotBetween(String value1, String value2) {
            addCriterion("ssc_name not between", value1, value2, "sscName");
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