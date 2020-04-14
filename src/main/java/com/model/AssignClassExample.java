package com.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AssignClassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public AssignClassExample() {
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

        public Criteria andAcsIdIsNull() {
            addCriterion("acs_id is null");
            return (Criteria) this;
        }

        public Criteria andAcsIdIsNotNull() {
            addCriterion("acs_id is not null");
            return (Criteria) this;
        }

        public Criteria andAcsIdEqualTo(String value) {
            addCriterion("acs_id =", value, "acsId");
            return (Criteria) this;
        }

        public Criteria andAcsIdNotEqualTo(String value) {
            addCriterion("acs_id <>", value, "acsId");
            return (Criteria) this;
        }

        public Criteria andAcsIdGreaterThan(String value) {
            addCriterion("acs_id >", value, "acsId");
            return (Criteria) this;
        }

        public Criteria andAcsIdGreaterThanOrEqualTo(String value) {
            addCriterion("acs_id >=", value, "acsId");
            return (Criteria) this;
        }

        public Criteria andAcsIdLessThan(String value) {
            addCriterion("acs_id <", value, "acsId");
            return (Criteria) this;
        }

        public Criteria andAcsIdLessThanOrEqualTo(String value) {
            addCriterion("acs_id <=", value, "acsId");
            return (Criteria) this;
        }

        public Criteria andAcsIdLike(String value) {
            addCriterion("acs_id like", value, "acsId");
            return (Criteria) this;
        }

        public Criteria andAcsIdNotLike(String value) {
            addCriterion("acs_id not like", value, "acsId");
            return (Criteria) this;
        }

        public Criteria andAcsIdIn(List<String> values) {
            addCriterion("acs_id in", values, "acsId");
            return (Criteria) this;
        }

        public Criteria andAcsIdNotIn(List<String> values) {
            addCriterion("acs_id not in", values, "acsId");
            return (Criteria) this;
        }

        public Criteria andAcsIdBetween(String value1, String value2) {
            addCriterion("acs_id between", value1, value2, "acsId");
            return (Criteria) this;
        }

        public Criteria andAcsIdNotBetween(String value1, String value2) {
            addCriterion("acs_id not between", value1, value2, "acsId");
            return (Criteria) this;
        }

        public Criteria andTeiIdIsNull() {
            addCriterion("tei_id is null");
            return (Criteria) this;
        }

        public Criteria andTeiIdIsNotNull() {
            addCriterion("tei_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeiIdEqualTo(String value) {
            addCriterion("tei_id =", value, "teiId");
            return (Criteria) this;
        }

        public Criteria andTeiIdNotEqualTo(String value) {
            addCriterion("tei_id <>", value, "teiId");
            return (Criteria) this;
        }

        public Criteria andTeiIdGreaterThan(String value) {
            addCriterion("tei_id >", value, "teiId");
            return (Criteria) this;
        }

        public Criteria andTeiIdGreaterThanOrEqualTo(String value) {
            addCriterion("tei_id >=", value, "teiId");
            return (Criteria) this;
        }

        public Criteria andTeiIdLessThan(String value) {
            addCriterion("tei_id <", value, "teiId");
            return (Criteria) this;
        }

        public Criteria andTeiIdLessThanOrEqualTo(String value) {
            addCriterion("tei_id <=", value, "teiId");
            return (Criteria) this;
        }

        public Criteria andTeiIdLike(String value) {
            addCriterion("tei_id like", value, "teiId");
            return (Criteria) this;
        }

        public Criteria andTeiIdNotLike(String value) {
            addCriterion("tei_id not like", value, "teiId");
            return (Criteria) this;
        }

        public Criteria andTeiIdIn(List<String> values) {
            addCriterion("tei_id in", values, "teiId");
            return (Criteria) this;
        }

        public Criteria andTeiIdNotIn(List<String> values) {
            addCriterion("tei_id not in", values, "teiId");
            return (Criteria) this;
        }

        public Criteria andTeiIdBetween(String value1, String value2) {
            addCriterion("tei_id between", value1, value2, "teiId");
            return (Criteria) this;
        }

        public Criteria andTeiIdNotBetween(String value1, String value2) {
            addCriterion("tei_id not between", value1, value2, "teiId");
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

        public Criteria andAcsRzrqIsNull() {
            addCriterion("acs_rzrq is null");
            return (Criteria) this;
        }

        public Criteria andAcsRzrqIsNotNull() {
            addCriterion("acs_rzrq is not null");
            return (Criteria) this;
        }

        public Criteria andAcsRzrqEqualTo(Date value) {
            addCriterion("acs_rzrq =", value, "acsRzrq");
            return (Criteria) this;
        }

        public Criteria andAcsRzrqNotEqualTo(Date value) {
            addCriterion("acs_rzrq <>", value, "acsRzrq");
            return (Criteria) this;
        }

        public Criteria andAcsRzrqGreaterThan(Date value) {
            addCriterion("acs_rzrq >", value, "acsRzrq");
            return (Criteria) this;
        }

        public Criteria andAcsRzrqGreaterThanOrEqualTo(Date value) {
            addCriterion("acs_rzrq >=", value, "acsRzrq");
            return (Criteria) this;
        }

        public Criteria andAcsRzrqLessThan(Date value) {
            addCriterion("acs_rzrq <", value, "acsRzrq");
            return (Criteria) this;
        }

        public Criteria andAcsRzrqLessThanOrEqualTo(Date value) {
            addCriterion("acs_rzrq <=", value, "acsRzrq");
            return (Criteria) this;
        }

        public Criteria andAcsRzrqIn(List<Date> values) {
            addCriterion("acs_rzrq in", values, "acsRzrq");
            return (Criteria) this;
        }

        public Criteria andAcsRzrqNotIn(List<Date> values) {
            addCriterion("acs_rzrq not in", values, "acsRzrq");
            return (Criteria) this;
        }

        public Criteria andAcsRzrqBetween(Date value1, Date value2) {
            addCriterion("acs_rzrq between", value1, value2, "acsRzrq");
            return (Criteria) this;
        }

        public Criteria andAcsRzrqNotBetween(Date value1, Date value2) {
            addCriterion("acs_rzrq not between", value1, value2, "acsRzrq");
            return (Criteria) this;
        }

        public Criteria andAcsLzrqIsNull() {
            addCriterion("acs_lzrq is null");
            return (Criteria) this;
        }

        public Criteria andAcsLzrqIsNotNull() {
            addCriterion("acs_lzrq is not null");
            return (Criteria) this;
        }

        public Criteria andAcsLzrqEqualTo(Date value) {
            addCriterion("acs_lzrq =", value, "acsLzrq");
            return (Criteria) this;
        }

        public Criteria andAcsLzrqNotEqualTo(Date value) {
            addCriterion("acs_lzrq <>", value, "acsLzrq");
            return (Criteria) this;
        }

        public Criteria andAcsLzrqGreaterThan(Date value) {
            addCriterion("acs_lzrq >", value, "acsLzrq");
            return (Criteria) this;
        }

        public Criteria andAcsLzrqGreaterThanOrEqualTo(Date value) {
            addCriterion("acs_lzrq >=", value, "acsLzrq");
            return (Criteria) this;
        }

        public Criteria andAcsLzrqLessThan(Date value) {
            addCriterion("acs_lzrq <", value, "acsLzrq");
            return (Criteria) this;
        }

        public Criteria andAcsLzrqLessThanOrEqualTo(Date value) {
            addCriterion("acs_lzrq <=", value, "acsLzrq");
            return (Criteria) this;
        }

        public Criteria andAcsLzrqIn(List<Date> values) {
            addCriterion("acs_lzrq in", values, "acsLzrq");
            return (Criteria) this;
        }

        public Criteria andAcsLzrqNotIn(List<Date> values) {
            addCriterion("acs_lzrq not in", values, "acsLzrq");
            return (Criteria) this;
        }

        public Criteria andAcsLzrqBetween(Date value1, Date value2) {
            addCriterion("acs_lzrq between", value1, value2, "acsLzrq");
            return (Criteria) this;
        }

        public Criteria andAcsLzrqNotBetween(Date value1, Date value2) {
            addCriterion("acs_lzrq not between", value1, value2, "acsLzrq");
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