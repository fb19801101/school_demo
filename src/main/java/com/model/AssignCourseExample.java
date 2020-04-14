package com.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AssignCourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public AssignCourseExample() {
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

        public Criteria andAceIdIsNull() {
            addCriterion("ace_id is null");
            return (Criteria) this;
        }

        public Criteria andAceIdIsNotNull() {
            addCriterion("ace_id is not null");
            return (Criteria) this;
        }

        public Criteria andAceIdEqualTo(String value) {
            addCriterion("ace_id =", value, "aceId");
            return (Criteria) this;
        }

        public Criteria andAceIdNotEqualTo(String value) {
            addCriterion("ace_id <>", value, "aceId");
            return (Criteria) this;
        }

        public Criteria andAceIdGreaterThan(String value) {
            addCriterion("ace_id >", value, "aceId");
            return (Criteria) this;
        }

        public Criteria andAceIdGreaterThanOrEqualTo(String value) {
            addCriterion("ace_id >=", value, "aceId");
            return (Criteria) this;
        }

        public Criteria andAceIdLessThan(String value) {
            addCriterion("ace_id <", value, "aceId");
            return (Criteria) this;
        }

        public Criteria andAceIdLessThanOrEqualTo(String value) {
            addCriterion("ace_id <=", value, "aceId");
            return (Criteria) this;
        }

        public Criteria andAceIdLike(String value) {
            addCriterion("ace_id like", value, "aceId");
            return (Criteria) this;
        }

        public Criteria andAceIdNotLike(String value) {
            addCriterion("ace_id not like", value, "aceId");
            return (Criteria) this;
        }

        public Criteria andAceIdIn(List<String> values) {
            addCriterion("ace_id in", values, "aceId");
            return (Criteria) this;
        }

        public Criteria andAceIdNotIn(List<String> values) {
            addCriterion("ace_id not in", values, "aceId");
            return (Criteria) this;
        }

        public Criteria andAceIdBetween(String value1, String value2) {
            addCriterion("ace_id between", value1, value2, "aceId");
            return (Criteria) this;
        }

        public Criteria andAceIdNotBetween(String value1, String value2) {
            addCriterion("ace_id not between", value1, value2, "aceId");
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

        public Criteria andSccCodeIsNull() {
            addCriterion("scc_code is null");
            return (Criteria) this;
        }

        public Criteria andSccCodeIsNotNull() {
            addCriterion("scc_code is not null");
            return (Criteria) this;
        }

        public Criteria andSccCodeEqualTo(String value) {
            addCriterion("scc_code =", value, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSccCodeNotEqualTo(String value) {
            addCriterion("scc_code <>", value, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSccCodeGreaterThan(String value) {
            addCriterion("scc_code >", value, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSccCodeGreaterThanOrEqualTo(String value) {
            addCriterion("scc_code >=", value, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSccCodeLessThan(String value) {
            addCriterion("scc_code <", value, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSccCodeLessThanOrEqualTo(String value) {
            addCriterion("scc_code <=", value, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSccCodeLike(String value) {
            addCriterion("scc_code like", value, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSccCodeNotLike(String value) {
            addCriterion("scc_code not like", value, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSccCodeIn(List<String> values) {
            addCriterion("scc_code in", values, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSccCodeNotIn(List<String> values) {
            addCriterion("scc_code not in", values, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSccCodeBetween(String value1, String value2) {
            addCriterion("scc_code between", value1, value2, "sccCode");
            return (Criteria) this;
        }

        public Criteria andSccCodeNotBetween(String value1, String value2) {
            addCriterion("scc_code not between", value1, value2, "sccCode");
            return (Criteria) this;
        }

        public Criteria andAceRzrqIsNull() {
            addCriterion("ace_rzrq is null");
            return (Criteria) this;
        }

        public Criteria andAceRzrqIsNotNull() {
            addCriterion("ace_rzrq is not null");
            return (Criteria) this;
        }

        public Criteria andAceRzrqEqualTo(Date value) {
            addCriterion("ace_rzrq =", value, "aceRzrq");
            return (Criteria) this;
        }

        public Criteria andAceRzrqNotEqualTo(Date value) {
            addCriterion("ace_rzrq <>", value, "aceRzrq");
            return (Criteria) this;
        }

        public Criteria andAceRzrqGreaterThan(Date value) {
            addCriterion("ace_rzrq >", value, "aceRzrq");
            return (Criteria) this;
        }

        public Criteria andAceRzrqGreaterThanOrEqualTo(Date value) {
            addCriterion("ace_rzrq >=", value, "aceRzrq");
            return (Criteria) this;
        }

        public Criteria andAceRzrqLessThan(Date value) {
            addCriterion("ace_rzrq <", value, "aceRzrq");
            return (Criteria) this;
        }

        public Criteria andAceRzrqLessThanOrEqualTo(Date value) {
            addCriterion("ace_rzrq <=", value, "aceRzrq");
            return (Criteria) this;
        }

        public Criteria andAceRzrqIn(List<Date> values) {
            addCriterion("ace_rzrq in", values, "aceRzrq");
            return (Criteria) this;
        }

        public Criteria andAceRzrqNotIn(List<Date> values) {
            addCriterion("ace_rzrq not in", values, "aceRzrq");
            return (Criteria) this;
        }

        public Criteria andAceRzrqBetween(Date value1, Date value2) {
            addCriterion("ace_rzrq between", value1, value2, "aceRzrq");
            return (Criteria) this;
        }

        public Criteria andAceRzrqNotBetween(Date value1, Date value2) {
            addCriterion("ace_rzrq not between", value1, value2, "aceRzrq");
            return (Criteria) this;
        }

        public Criteria andAceLzrqIsNull() {
            addCriterion("ace_lzrq is null");
            return (Criteria) this;
        }

        public Criteria andAceLzrqIsNotNull() {
            addCriterion("ace_lzrq is not null");
            return (Criteria) this;
        }

        public Criteria andAceLzrqEqualTo(Date value) {
            addCriterion("ace_lzrq =", value, "aceLzrq");
            return (Criteria) this;
        }

        public Criteria andAceLzrqNotEqualTo(Date value) {
            addCriterion("ace_lzrq <>", value, "aceLzrq");
            return (Criteria) this;
        }

        public Criteria andAceLzrqGreaterThan(Date value) {
            addCriterion("ace_lzrq >", value, "aceLzrq");
            return (Criteria) this;
        }

        public Criteria andAceLzrqGreaterThanOrEqualTo(Date value) {
            addCriterion("ace_lzrq >=", value, "aceLzrq");
            return (Criteria) this;
        }

        public Criteria andAceLzrqLessThan(Date value) {
            addCriterion("ace_lzrq <", value, "aceLzrq");
            return (Criteria) this;
        }

        public Criteria andAceLzrqLessThanOrEqualTo(Date value) {
            addCriterion("ace_lzrq <=", value, "aceLzrq");
            return (Criteria) this;
        }

        public Criteria andAceLzrqIn(List<Date> values) {
            addCriterion("ace_lzrq in", values, "aceLzrq");
            return (Criteria) this;
        }

        public Criteria andAceLzrqNotIn(List<Date> values) {
            addCriterion("ace_lzrq not in", values, "aceLzrq");
            return (Criteria) this;
        }

        public Criteria andAceLzrqBetween(Date value1, Date value2) {
            addCriterion("ace_lzrq between", value1, value2, "aceLzrq");
            return (Criteria) this;
        }

        public Criteria andAceLzrqNotBetween(Date value1, Date value2) {
            addCriterion("ace_lzrq not between", value1, value2, "aceLzrq");
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