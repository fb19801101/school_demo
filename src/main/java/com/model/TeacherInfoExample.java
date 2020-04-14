package com.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TeacherInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public TeacherInfoExample() {
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

        public Criteria andTeiNameIsNull() {
            addCriterion("tei_name is null");
            return (Criteria) this;
        }

        public Criteria andTeiNameIsNotNull() {
            addCriterion("tei_name is not null");
            return (Criteria) this;
        }

        public Criteria andTeiNameEqualTo(String value) {
            addCriterion("tei_name =", value, "teiName");
            return (Criteria) this;
        }

        public Criteria andTeiNameNotEqualTo(String value) {
            addCriterion("tei_name <>", value, "teiName");
            return (Criteria) this;
        }

        public Criteria andTeiNameGreaterThan(String value) {
            addCriterion("tei_name >", value, "teiName");
            return (Criteria) this;
        }

        public Criteria andTeiNameGreaterThanOrEqualTo(String value) {
            addCriterion("tei_name >=", value, "teiName");
            return (Criteria) this;
        }

        public Criteria andTeiNameLessThan(String value) {
            addCriterion("tei_name <", value, "teiName");
            return (Criteria) this;
        }

        public Criteria andTeiNameLessThanOrEqualTo(String value) {
            addCriterion("tei_name <=", value, "teiName");
            return (Criteria) this;
        }

        public Criteria andTeiNameLike(String value) {
            addCriterion("tei_name like", value, "teiName");
            return (Criteria) this;
        }

        public Criteria andTeiNameNotLike(String value) {
            addCriterion("tei_name not like", value, "teiName");
            return (Criteria) this;
        }

        public Criteria andTeiNameIn(List<String> values) {
            addCriterion("tei_name in", values, "teiName");
            return (Criteria) this;
        }

        public Criteria andTeiNameNotIn(List<String> values) {
            addCriterion("tei_name not in", values, "teiName");
            return (Criteria) this;
        }

        public Criteria andTeiNameBetween(String value1, String value2) {
            addCriterion("tei_name between", value1, value2, "teiName");
            return (Criteria) this;
        }

        public Criteria andTeiNameNotBetween(String value1, String value2) {
            addCriterion("tei_name not between", value1, value2, "teiName");
            return (Criteria) this;
        }

        public Criteria andTeiSexIsNull() {
            addCriterion("tei_sex is null");
            return (Criteria) this;
        }

        public Criteria andTeiSexIsNotNull() {
            addCriterion("tei_sex is not null");
            return (Criteria) this;
        }

        public Criteria andTeiSexEqualTo(String value) {
            addCriterion("tei_sex =", value, "teiSex");
            return (Criteria) this;
        }

        public Criteria andTeiSexNotEqualTo(String value) {
            addCriterion("tei_sex <>", value, "teiSex");
            return (Criteria) this;
        }

        public Criteria andTeiSexGreaterThan(String value) {
            addCriterion("tei_sex >", value, "teiSex");
            return (Criteria) this;
        }

        public Criteria andTeiSexGreaterThanOrEqualTo(String value) {
            addCriterion("tei_sex >=", value, "teiSex");
            return (Criteria) this;
        }

        public Criteria andTeiSexLessThan(String value) {
            addCriterion("tei_sex <", value, "teiSex");
            return (Criteria) this;
        }

        public Criteria andTeiSexLessThanOrEqualTo(String value) {
            addCriterion("tei_sex <=", value, "teiSex");
            return (Criteria) this;
        }

        public Criteria andTeiSexLike(String value) {
            addCriterion("tei_sex like", value, "teiSex");
            return (Criteria) this;
        }

        public Criteria andTeiSexNotLike(String value) {
            addCriterion("tei_sex not like", value, "teiSex");
            return (Criteria) this;
        }

        public Criteria andTeiSexIn(List<String> values) {
            addCriterion("tei_sex in", values, "teiSex");
            return (Criteria) this;
        }

        public Criteria andTeiSexNotIn(List<String> values) {
            addCriterion("tei_sex not in", values, "teiSex");
            return (Criteria) this;
        }

        public Criteria andTeiSexBetween(String value1, String value2) {
            addCriterion("tei_sex between", value1, value2, "teiSex");
            return (Criteria) this;
        }

        public Criteria andTeiSexNotBetween(String value1, String value2) {
            addCriterion("tei_sex not between", value1, value2, "teiSex");
            return (Criteria) this;
        }

        public Criteria andTeiAgeIsNull() {
            addCriterion("tei_age is null");
            return (Criteria) this;
        }

        public Criteria andTeiAgeIsNotNull() {
            addCriterion("tei_age is not null");
            return (Criteria) this;
        }

        public Criteria andTeiAgeEqualTo(Integer value) {
            addCriterion("tei_age =", value, "teiAge");
            return (Criteria) this;
        }

        public Criteria andTeiAgeNotEqualTo(Integer value) {
            addCriterion("tei_age <>", value, "teiAge");
            return (Criteria) this;
        }

        public Criteria andTeiAgeGreaterThan(Integer value) {
            addCriterion("tei_age >", value, "teiAge");
            return (Criteria) this;
        }

        public Criteria andTeiAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("tei_age >=", value, "teiAge");
            return (Criteria) this;
        }

        public Criteria andTeiAgeLessThan(Integer value) {
            addCriterion("tei_age <", value, "teiAge");
            return (Criteria) this;
        }

        public Criteria andTeiAgeLessThanOrEqualTo(Integer value) {
            addCriterion("tei_age <=", value, "teiAge");
            return (Criteria) this;
        }

        public Criteria andTeiAgeIn(List<Integer> values) {
            addCriterion("tei_age in", values, "teiAge");
            return (Criteria) this;
        }

        public Criteria andTeiAgeNotIn(List<Integer> values) {
            addCriterion("tei_age not in", values, "teiAge");
            return (Criteria) this;
        }

        public Criteria andTeiAgeBetween(Integer value1, Integer value2) {
            addCriterion("tei_age between", value1, value2, "teiAge");
            return (Criteria) this;
        }

        public Criteria andTeiAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("tei_age not between", value1, value2, "teiAge");
            return (Criteria) this;
        }

        public Criteria andTeiMinzuIsNull() {
            addCriterion("tei_minzu is null");
            return (Criteria) this;
        }

        public Criteria andTeiMinzuIsNotNull() {
            addCriterion("tei_minzu is not null");
            return (Criteria) this;
        }

        public Criteria andTeiMinzuEqualTo(String value) {
            addCriterion("tei_minzu =", value, "teiMinzu");
            return (Criteria) this;
        }

        public Criteria andTeiMinzuNotEqualTo(String value) {
            addCriterion("tei_minzu <>", value, "teiMinzu");
            return (Criteria) this;
        }

        public Criteria andTeiMinzuGreaterThan(String value) {
            addCriterion("tei_minzu >", value, "teiMinzu");
            return (Criteria) this;
        }

        public Criteria andTeiMinzuGreaterThanOrEqualTo(String value) {
            addCriterion("tei_minzu >=", value, "teiMinzu");
            return (Criteria) this;
        }

        public Criteria andTeiMinzuLessThan(String value) {
            addCriterion("tei_minzu <", value, "teiMinzu");
            return (Criteria) this;
        }

        public Criteria andTeiMinzuLessThanOrEqualTo(String value) {
            addCriterion("tei_minzu <=", value, "teiMinzu");
            return (Criteria) this;
        }

        public Criteria andTeiMinzuLike(String value) {
            addCriterion("tei_minzu like", value, "teiMinzu");
            return (Criteria) this;
        }

        public Criteria andTeiMinzuNotLike(String value) {
            addCriterion("tei_minzu not like", value, "teiMinzu");
            return (Criteria) this;
        }

        public Criteria andTeiMinzuIn(List<String> values) {
            addCriterion("tei_minzu in", values, "teiMinzu");
            return (Criteria) this;
        }

        public Criteria andTeiMinzuNotIn(List<String> values) {
            addCriterion("tei_minzu not in", values, "teiMinzu");
            return (Criteria) this;
        }

        public Criteria andTeiMinzuBetween(String value1, String value2) {
            addCriterion("tei_minzu between", value1, value2, "teiMinzu");
            return (Criteria) this;
        }

        public Criteria andTeiMinzuNotBetween(String value1, String value2) {
            addCriterion("tei_minzu not between", value1, value2, "teiMinzu");
            return (Criteria) this;
        }

        public Criteria andTeiZzmmIsNull() {
            addCriterion("tei_zzmm is null");
            return (Criteria) this;
        }

        public Criteria andTeiZzmmIsNotNull() {
            addCriterion("tei_zzmm is not null");
            return (Criteria) this;
        }

        public Criteria andTeiZzmmEqualTo(String value) {
            addCriterion("tei_zzmm =", value, "teiZzmm");
            return (Criteria) this;
        }

        public Criteria andTeiZzmmNotEqualTo(String value) {
            addCriterion("tei_zzmm <>", value, "teiZzmm");
            return (Criteria) this;
        }

        public Criteria andTeiZzmmGreaterThan(String value) {
            addCriterion("tei_zzmm >", value, "teiZzmm");
            return (Criteria) this;
        }

        public Criteria andTeiZzmmGreaterThanOrEqualTo(String value) {
            addCriterion("tei_zzmm >=", value, "teiZzmm");
            return (Criteria) this;
        }

        public Criteria andTeiZzmmLessThan(String value) {
            addCriterion("tei_zzmm <", value, "teiZzmm");
            return (Criteria) this;
        }

        public Criteria andTeiZzmmLessThanOrEqualTo(String value) {
            addCriterion("tei_zzmm <=", value, "teiZzmm");
            return (Criteria) this;
        }

        public Criteria andTeiZzmmLike(String value) {
            addCriterion("tei_zzmm like", value, "teiZzmm");
            return (Criteria) this;
        }

        public Criteria andTeiZzmmNotLike(String value) {
            addCriterion("tei_zzmm not like", value, "teiZzmm");
            return (Criteria) this;
        }

        public Criteria andTeiZzmmIn(List<String> values) {
            addCriterion("tei_zzmm in", values, "teiZzmm");
            return (Criteria) this;
        }

        public Criteria andTeiZzmmNotIn(List<String> values) {
            addCriterion("tei_zzmm not in", values, "teiZzmm");
            return (Criteria) this;
        }

        public Criteria andTeiZzmmBetween(String value1, String value2) {
            addCriterion("tei_zzmm between", value1, value2, "teiZzmm");
            return (Criteria) this;
        }

        public Criteria andTeiZzmmNotBetween(String value1, String value2) {
            addCriterion("tei_zzmm not between", value1, value2, "teiZzmm");
            return (Criteria) this;
        }

        public Criteria andTeiXueliIsNull() {
            addCriterion("tei_xueli is null");
            return (Criteria) this;
        }

        public Criteria andTeiXueliIsNotNull() {
            addCriterion("tei_xueli is not null");
            return (Criteria) this;
        }

        public Criteria andTeiXueliEqualTo(String value) {
            addCriterion("tei_xueli =", value, "teiXueli");
            return (Criteria) this;
        }

        public Criteria andTeiXueliNotEqualTo(String value) {
            addCriterion("tei_xueli <>", value, "teiXueli");
            return (Criteria) this;
        }

        public Criteria andTeiXueliGreaterThan(String value) {
            addCriterion("tei_xueli >", value, "teiXueli");
            return (Criteria) this;
        }

        public Criteria andTeiXueliGreaterThanOrEqualTo(String value) {
            addCriterion("tei_xueli >=", value, "teiXueli");
            return (Criteria) this;
        }

        public Criteria andTeiXueliLessThan(String value) {
            addCriterion("tei_xueli <", value, "teiXueli");
            return (Criteria) this;
        }

        public Criteria andTeiXueliLessThanOrEqualTo(String value) {
            addCriterion("tei_xueli <=", value, "teiXueli");
            return (Criteria) this;
        }

        public Criteria andTeiXueliLike(String value) {
            addCriterion("tei_xueli like", value, "teiXueli");
            return (Criteria) this;
        }

        public Criteria andTeiXueliNotLike(String value) {
            addCriterion("tei_xueli not like", value, "teiXueli");
            return (Criteria) this;
        }

        public Criteria andTeiXueliIn(List<String> values) {
            addCriterion("tei_xueli in", values, "teiXueli");
            return (Criteria) this;
        }

        public Criteria andTeiXueliNotIn(List<String> values) {
            addCriterion("tei_xueli not in", values, "teiXueli");
            return (Criteria) this;
        }

        public Criteria andTeiXueliBetween(String value1, String value2) {
            addCriterion("tei_xueli between", value1, value2, "teiXueli");
            return (Criteria) this;
        }

        public Criteria andTeiXueliNotBetween(String value1, String value2) {
            addCriterion("tei_xueli not between", value1, value2, "teiXueli");
            return (Criteria) this;
        }

        public Criteria andTeiHunfouIsNull() {
            addCriterion("tei_hunfou is null");
            return (Criteria) this;
        }

        public Criteria andTeiHunfouIsNotNull() {
            addCriterion("tei_hunfou is not null");
            return (Criteria) this;
        }

        public Criteria andTeiHunfouEqualTo(String value) {
            addCriterion("tei_hunfou =", value, "teiHunfou");
            return (Criteria) this;
        }

        public Criteria andTeiHunfouNotEqualTo(String value) {
            addCriterion("tei_hunfou <>", value, "teiHunfou");
            return (Criteria) this;
        }

        public Criteria andTeiHunfouGreaterThan(String value) {
            addCriterion("tei_hunfou >", value, "teiHunfou");
            return (Criteria) this;
        }

        public Criteria andTeiHunfouGreaterThanOrEqualTo(String value) {
            addCriterion("tei_hunfou >=", value, "teiHunfou");
            return (Criteria) this;
        }

        public Criteria andTeiHunfouLessThan(String value) {
            addCriterion("tei_hunfou <", value, "teiHunfou");
            return (Criteria) this;
        }

        public Criteria andTeiHunfouLessThanOrEqualTo(String value) {
            addCriterion("tei_hunfou <=", value, "teiHunfou");
            return (Criteria) this;
        }

        public Criteria andTeiHunfouLike(String value) {
            addCriterion("tei_hunfou like", value, "teiHunfou");
            return (Criteria) this;
        }

        public Criteria andTeiHunfouNotLike(String value) {
            addCriterion("tei_hunfou not like", value, "teiHunfou");
            return (Criteria) this;
        }

        public Criteria andTeiHunfouIn(List<String> values) {
            addCriterion("tei_hunfou in", values, "teiHunfou");
            return (Criteria) this;
        }

        public Criteria andTeiHunfouNotIn(List<String> values) {
            addCriterion("tei_hunfou not in", values, "teiHunfou");
            return (Criteria) this;
        }

        public Criteria andTeiHunfouBetween(String value1, String value2) {
            addCriterion("tei_hunfou between", value1, value2, "teiHunfou");
            return (Criteria) this;
        }

        public Criteria andTeiHunfouNotBetween(String value1, String value2) {
            addCriterion("tei_hunfou not between", value1, value2, "teiHunfou");
            return (Criteria) this;
        }

        public Criteria andTeiCsrqIsNull() {
            addCriterion("tei_csrq is null");
            return (Criteria) this;
        }

        public Criteria andTeiCsrqIsNotNull() {
            addCriterion("tei_csrq is not null");
            return (Criteria) this;
        }

        public Criteria andTeiCsrqEqualTo(Date value) {
            addCriterion("tei_csrq =", value, "teiCsrq");
            return (Criteria) this;
        }

        public Criteria andTeiCsrqNotEqualTo(Date value) {
            addCriterion("tei_csrq <>", value, "teiCsrq");
            return (Criteria) this;
        }

        public Criteria andTeiCsrqGreaterThan(Date value) {
            addCriterion("tei_csrq >", value, "teiCsrq");
            return (Criteria) this;
        }

        public Criteria andTeiCsrqGreaterThanOrEqualTo(Date value) {
            addCriterion("tei_csrq >=", value, "teiCsrq");
            return (Criteria) this;
        }

        public Criteria andTeiCsrqLessThan(Date value) {
            addCriterion("tei_csrq <", value, "teiCsrq");
            return (Criteria) this;
        }

        public Criteria andTeiCsrqLessThanOrEqualTo(Date value) {
            addCriterion("tei_csrq <=", value, "teiCsrq");
            return (Criteria) this;
        }

        public Criteria andTeiCsrqIn(List<Date> values) {
            addCriterion("tei_csrq in", values, "teiCsrq");
            return (Criteria) this;
        }

        public Criteria andTeiCsrqNotIn(List<Date> values) {
            addCriterion("tei_csrq not in", values, "teiCsrq");
            return (Criteria) this;
        }

        public Criteria andTeiCsrqBetween(Date value1, Date value2) {
            addCriterion("tei_csrq between", value1, value2, "teiCsrq");
            return (Criteria) this;
        }

        public Criteria andTeiCsrqNotBetween(Date value1, Date value2) {
            addCriterion("tei_csrq not between", value1, value2, "teiCsrq");
            return (Criteria) this;
        }

        public Criteria andTeiSfzhIsNull() {
            addCriterion("tei_sfzh is null");
            return (Criteria) this;
        }

        public Criteria andTeiSfzhIsNotNull() {
            addCriterion("tei_sfzh is not null");
            return (Criteria) this;
        }

        public Criteria andTeiSfzhEqualTo(String value) {
            addCriterion("tei_sfzh =", value, "teiSfzh");
            return (Criteria) this;
        }

        public Criteria andTeiSfzhNotEqualTo(String value) {
            addCriterion("tei_sfzh <>", value, "teiSfzh");
            return (Criteria) this;
        }

        public Criteria andTeiSfzhGreaterThan(String value) {
            addCriterion("tei_sfzh >", value, "teiSfzh");
            return (Criteria) this;
        }

        public Criteria andTeiSfzhGreaterThanOrEqualTo(String value) {
            addCriterion("tei_sfzh >=", value, "teiSfzh");
            return (Criteria) this;
        }

        public Criteria andTeiSfzhLessThan(String value) {
            addCriterion("tei_sfzh <", value, "teiSfzh");
            return (Criteria) this;
        }

        public Criteria andTeiSfzhLessThanOrEqualTo(String value) {
            addCriterion("tei_sfzh <=", value, "teiSfzh");
            return (Criteria) this;
        }

        public Criteria andTeiSfzhLike(String value) {
            addCriterion("tei_sfzh like", value, "teiSfzh");
            return (Criteria) this;
        }

        public Criteria andTeiSfzhNotLike(String value) {
            addCriterion("tei_sfzh not like", value, "teiSfzh");
            return (Criteria) this;
        }

        public Criteria andTeiSfzhIn(List<String> values) {
            addCriterion("tei_sfzh in", values, "teiSfzh");
            return (Criteria) this;
        }

        public Criteria andTeiSfzhNotIn(List<String> values) {
            addCriterion("tei_sfzh not in", values, "teiSfzh");
            return (Criteria) this;
        }

        public Criteria andTeiSfzhBetween(String value1, String value2) {
            addCriterion("tei_sfzh between", value1, value2, "teiSfzh");
            return (Criteria) this;
        }

        public Criteria andTeiSfzhNotBetween(String value1, String value2) {
            addCriterion("tei_sfzh not between", value1, value2, "teiSfzh");
            return (Criteria) this;
        }

        public Criteria andTeiLxdhIsNull() {
            addCriterion("tei_lxdh is null");
            return (Criteria) this;
        }

        public Criteria andTeiLxdhIsNotNull() {
            addCriterion("tei_lxdh is not null");
            return (Criteria) this;
        }

        public Criteria andTeiLxdhEqualTo(String value) {
            addCriterion("tei_lxdh =", value, "teiLxdh");
            return (Criteria) this;
        }

        public Criteria andTeiLxdhNotEqualTo(String value) {
            addCriterion("tei_lxdh <>", value, "teiLxdh");
            return (Criteria) this;
        }

        public Criteria andTeiLxdhGreaterThan(String value) {
            addCriterion("tei_lxdh >", value, "teiLxdh");
            return (Criteria) this;
        }

        public Criteria andTeiLxdhGreaterThanOrEqualTo(String value) {
            addCriterion("tei_lxdh >=", value, "teiLxdh");
            return (Criteria) this;
        }

        public Criteria andTeiLxdhLessThan(String value) {
            addCriterion("tei_lxdh <", value, "teiLxdh");
            return (Criteria) this;
        }

        public Criteria andTeiLxdhLessThanOrEqualTo(String value) {
            addCriterion("tei_lxdh <=", value, "teiLxdh");
            return (Criteria) this;
        }

        public Criteria andTeiLxdhLike(String value) {
            addCriterion("tei_lxdh like", value, "teiLxdh");
            return (Criteria) this;
        }

        public Criteria andTeiLxdhNotLike(String value) {
            addCriterion("tei_lxdh not like", value, "teiLxdh");
            return (Criteria) this;
        }

        public Criteria andTeiLxdhIn(List<String> values) {
            addCriterion("tei_lxdh in", values, "teiLxdh");
            return (Criteria) this;
        }

        public Criteria andTeiLxdhNotIn(List<String> values) {
            addCriterion("tei_lxdh not in", values, "teiLxdh");
            return (Criteria) this;
        }

        public Criteria andTeiLxdhBetween(String value1, String value2) {
            addCriterion("tei_lxdh between", value1, value2, "teiLxdh");
            return (Criteria) this;
        }

        public Criteria andTeiLxdhNotBetween(String value1, String value2) {
            addCriterion("tei_lxdh not between", value1, value2, "teiLxdh");
            return (Criteria) this;
        }

        public Criteria andTeiGzrqIsNull() {
            addCriterion("tei_gzrq is null");
            return (Criteria) this;
        }

        public Criteria andTeiGzrqIsNotNull() {
            addCriterion("tei_gzrq is not null");
            return (Criteria) this;
        }

        public Criteria andTeiGzrqEqualTo(Date value) {
            addCriterion("tei_gzrq =", value, "teiGzrq");
            return (Criteria) this;
        }

        public Criteria andTeiGzrqNotEqualTo(Date value) {
            addCriterion("tei_gzrq <>", value, "teiGzrq");
            return (Criteria) this;
        }

        public Criteria andTeiGzrqGreaterThan(Date value) {
            addCriterion("tei_gzrq >", value, "teiGzrq");
            return (Criteria) this;
        }

        public Criteria andTeiGzrqGreaterThanOrEqualTo(Date value) {
            addCriterion("tei_gzrq >=", value, "teiGzrq");
            return (Criteria) this;
        }

        public Criteria andTeiGzrqLessThan(Date value) {
            addCriterion("tei_gzrq <", value, "teiGzrq");
            return (Criteria) this;
        }

        public Criteria andTeiGzrqLessThanOrEqualTo(Date value) {
            addCriterion("tei_gzrq <=", value, "teiGzrq");
            return (Criteria) this;
        }

        public Criteria andTeiGzrqIn(List<Date> values) {
            addCriterion("tei_gzrq in", values, "teiGzrq");
            return (Criteria) this;
        }

        public Criteria andTeiGzrqNotIn(List<Date> values) {
            addCriterion("tei_gzrq not in", values, "teiGzrq");
            return (Criteria) this;
        }

        public Criteria andTeiGzrqBetween(Date value1, Date value2) {
            addCriterion("tei_gzrq between", value1, value2, "teiGzrq");
            return (Criteria) this;
        }

        public Criteria andTeiGzrqNotBetween(Date value1, Date value2) {
            addCriterion("tei_gzrq not between", value1, value2, "teiGzrq");
            return (Criteria) this;
        }

        public Criteria andTeiGzjjIsNull() {
            addCriterion("tei_gzjj is null");
            return (Criteria) this;
        }

        public Criteria andTeiGzjjIsNotNull() {
            addCriterion("tei_gzjj is not null");
            return (Criteria) this;
        }

        public Criteria andTeiGzjjEqualTo(String value) {
            addCriterion("tei_gzjj =", value, "teiGzjj");
            return (Criteria) this;
        }

        public Criteria andTeiGzjjNotEqualTo(String value) {
            addCriterion("tei_gzjj <>", value, "teiGzjj");
            return (Criteria) this;
        }

        public Criteria andTeiGzjjGreaterThan(String value) {
            addCriterion("tei_gzjj >", value, "teiGzjj");
            return (Criteria) this;
        }

        public Criteria andTeiGzjjGreaterThanOrEqualTo(String value) {
            addCriterion("tei_gzjj >=", value, "teiGzjj");
            return (Criteria) this;
        }

        public Criteria andTeiGzjjLessThan(String value) {
            addCriterion("tei_gzjj <", value, "teiGzjj");
            return (Criteria) this;
        }

        public Criteria andTeiGzjjLessThanOrEqualTo(String value) {
            addCriterion("tei_gzjj <=", value, "teiGzjj");
            return (Criteria) this;
        }

        public Criteria andTeiGzjjLike(String value) {
            addCriterion("tei_gzjj like", value, "teiGzjj");
            return (Criteria) this;
        }

        public Criteria andTeiGzjjNotLike(String value) {
            addCriterion("tei_gzjj not like", value, "teiGzjj");
            return (Criteria) this;
        }

        public Criteria andTeiGzjjIn(List<String> values) {
            addCriterion("tei_gzjj in", values, "teiGzjj");
            return (Criteria) this;
        }

        public Criteria andTeiGzjjNotIn(List<String> values) {
            addCriterion("tei_gzjj not in", values, "teiGzjj");
            return (Criteria) this;
        }

        public Criteria andTeiGzjjBetween(String value1, String value2) {
            addCriterion("tei_gzjj between", value1, value2, "teiGzjj");
            return (Criteria) this;
        }

        public Criteria andTeiGzjjNotBetween(String value1, String value2) {
            addCriterion("tei_gzjj not between", value1, value2, "teiGzjj");
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