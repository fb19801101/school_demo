package com.model;

import java.util.ArrayList;
import java.util.List;

public class SystemGradeCodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public SystemGradeCodeExample() {
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

        public Criteria andSgcCodeIsNull() {
            addCriterion("sgc_code is null");
            return (Criteria) this;
        }

        public Criteria andSgcCodeIsNotNull() {
            addCriterion("sgc_code is not null");
            return (Criteria) this;
        }

        public Criteria andSgcCodeEqualTo(String value) {
            addCriterion("sgc_code =", value, "sgcCode");
            return (Criteria) this;
        }

        public Criteria andSgcCodeNotEqualTo(String value) {
            addCriterion("sgc_code <>", value, "sgcCode");
            return (Criteria) this;
        }

        public Criteria andSgcCodeGreaterThan(String value) {
            addCriterion("sgc_code >", value, "sgcCode");
            return (Criteria) this;
        }

        public Criteria andSgcCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sgc_code >=", value, "sgcCode");
            return (Criteria) this;
        }

        public Criteria andSgcCodeLessThan(String value) {
            addCriterion("sgc_code <", value, "sgcCode");
            return (Criteria) this;
        }

        public Criteria andSgcCodeLessThanOrEqualTo(String value) {
            addCriterion("sgc_code <=", value, "sgcCode");
            return (Criteria) this;
        }

        public Criteria andSgcCodeLike(String value) {
            addCriterion("sgc_code like", value, "sgcCode");
            return (Criteria) this;
        }

        public Criteria andSgcCodeNotLike(String value) {
            addCriterion("sgc_code not like", value, "sgcCode");
            return (Criteria) this;
        }

        public Criteria andSgcCodeIn(List<String> values) {
            addCriterion("sgc_code in", values, "sgcCode");
            return (Criteria) this;
        }

        public Criteria andSgcCodeNotIn(List<String> values) {
            addCriterion("sgc_code not in", values, "sgcCode");
            return (Criteria) this;
        }

        public Criteria andSgcCodeBetween(String value1, String value2) {
            addCriterion("sgc_code between", value1, value2, "sgcCode");
            return (Criteria) this;
        }

        public Criteria andSgcCodeNotBetween(String value1, String value2) {
            addCriterion("sgc_code not between", value1, value2, "sgcCode");
            return (Criteria) this;
        }

        public Criteria andSgcNameIsNull() {
            addCriterion("sgc_name is null");
            return (Criteria) this;
        }

        public Criteria andSgcNameIsNotNull() {
            addCriterion("sgc_name is not null");
            return (Criteria) this;
        }

        public Criteria andSgcNameEqualTo(String value) {
            addCriterion("sgc_name =", value, "sgcName");
            return (Criteria) this;
        }

        public Criteria andSgcNameNotEqualTo(String value) {
            addCriterion("sgc_name <>", value, "sgcName");
            return (Criteria) this;
        }

        public Criteria andSgcNameGreaterThan(String value) {
            addCriterion("sgc_name >", value, "sgcName");
            return (Criteria) this;
        }

        public Criteria andSgcNameGreaterThanOrEqualTo(String value) {
            addCriterion("sgc_name >=", value, "sgcName");
            return (Criteria) this;
        }

        public Criteria andSgcNameLessThan(String value) {
            addCriterion("sgc_name <", value, "sgcName");
            return (Criteria) this;
        }

        public Criteria andSgcNameLessThanOrEqualTo(String value) {
            addCriterion("sgc_name <=", value, "sgcName");
            return (Criteria) this;
        }

        public Criteria andSgcNameLike(String value) {
            addCriterion("sgc_name like", value, "sgcName");
            return (Criteria) this;
        }

        public Criteria andSgcNameNotLike(String value) {
            addCriterion("sgc_name not like", value, "sgcName");
            return (Criteria) this;
        }

        public Criteria andSgcNameIn(List<String> values) {
            addCriterion("sgc_name in", values, "sgcName");
            return (Criteria) this;
        }

        public Criteria andSgcNameNotIn(List<String> values) {
            addCriterion("sgc_name not in", values, "sgcName");
            return (Criteria) this;
        }

        public Criteria andSgcNameBetween(String value1, String value2) {
            addCriterion("sgc_name between", value1, value2, "sgcName");
            return (Criteria) this;
        }

        public Criteria andSgcNameNotBetween(String value1, String value2) {
            addCriterion("sgc_name not between", value1, value2, "sgcName");
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