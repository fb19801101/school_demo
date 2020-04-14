package com.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public StudentInfoExample() {
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

        public Criteria andStiNameIsNull() {
            addCriterion("sti_name is null");
            return (Criteria) this;
        }

        public Criteria andStiNameIsNotNull() {
            addCriterion("sti_name is not null");
            return (Criteria) this;
        }

        public Criteria andStiNameEqualTo(String value) {
            addCriterion("sti_name =", value, "stiName");
            return (Criteria) this;
        }

        public Criteria andStiNameNotEqualTo(String value) {
            addCriterion("sti_name <>", value, "stiName");
            return (Criteria) this;
        }

        public Criteria andStiNameGreaterThan(String value) {
            addCriterion("sti_name >", value, "stiName");
            return (Criteria) this;
        }

        public Criteria andStiNameGreaterThanOrEqualTo(String value) {
            addCriterion("sti_name >=", value, "stiName");
            return (Criteria) this;
        }

        public Criteria andStiNameLessThan(String value) {
            addCriterion("sti_name <", value, "stiName");
            return (Criteria) this;
        }

        public Criteria andStiNameLessThanOrEqualTo(String value) {
            addCriterion("sti_name <=", value, "stiName");
            return (Criteria) this;
        }

        public Criteria andStiNameLike(String value) {
            addCriterion("sti_name like", value, "stiName");
            return (Criteria) this;
        }

        public Criteria andStiNameNotLike(String value) {
            addCriterion("sti_name not like", value, "stiName");
            return (Criteria) this;
        }

        public Criteria andStiNameIn(List<String> values) {
            addCriterion("sti_name in", values, "stiName");
            return (Criteria) this;
        }

        public Criteria andStiNameNotIn(List<String> values) {
            addCriterion("sti_name not in", values, "stiName");
            return (Criteria) this;
        }

        public Criteria andStiNameBetween(String value1, String value2) {
            addCriterion("sti_name between", value1, value2, "stiName");
            return (Criteria) this;
        }

        public Criteria andStiNameNotBetween(String value1, String value2) {
            addCriterion("sti_name not between", value1, value2, "stiName");
            return (Criteria) this;
        }

        public Criteria andStiSexIsNull() {
            addCriterion("sti_sex is null");
            return (Criteria) this;
        }

        public Criteria andStiSexIsNotNull() {
            addCriterion("sti_sex is not null");
            return (Criteria) this;
        }

        public Criteria andStiSexEqualTo(String value) {
            addCriterion("sti_sex =", value, "stiSex");
            return (Criteria) this;
        }

        public Criteria andStiSexNotEqualTo(String value) {
            addCriterion("sti_sex <>", value, "stiSex");
            return (Criteria) this;
        }

        public Criteria andStiSexGreaterThan(String value) {
            addCriterion("sti_sex >", value, "stiSex");
            return (Criteria) this;
        }

        public Criteria andStiSexGreaterThanOrEqualTo(String value) {
            addCriterion("sti_sex >=", value, "stiSex");
            return (Criteria) this;
        }

        public Criteria andStiSexLessThan(String value) {
            addCriterion("sti_sex <", value, "stiSex");
            return (Criteria) this;
        }

        public Criteria andStiSexLessThanOrEqualTo(String value) {
            addCriterion("sti_sex <=", value, "stiSex");
            return (Criteria) this;
        }

        public Criteria andStiSexLike(String value) {
            addCriterion("sti_sex like", value, "stiSex");
            return (Criteria) this;
        }

        public Criteria andStiSexNotLike(String value) {
            addCriterion("sti_sex not like", value, "stiSex");
            return (Criteria) this;
        }

        public Criteria andStiSexIn(List<String> values) {
            addCriterion("sti_sex in", values, "stiSex");
            return (Criteria) this;
        }

        public Criteria andStiSexNotIn(List<String> values) {
            addCriterion("sti_sex not in", values, "stiSex");
            return (Criteria) this;
        }

        public Criteria andStiSexBetween(String value1, String value2) {
            addCriterion("sti_sex between", value1, value2, "stiSex");
            return (Criteria) this;
        }

        public Criteria andStiSexNotBetween(String value1, String value2) {
            addCriterion("sti_sex not between", value1, value2, "stiSex");
            return (Criteria) this;
        }

        public Criteria andStiAgeIsNull() {
            addCriterion("sti_age is null");
            return (Criteria) this;
        }

        public Criteria andStiAgeIsNotNull() {
            addCriterion("sti_age is not null");
            return (Criteria) this;
        }

        public Criteria andStiAgeEqualTo(Integer value) {
            addCriterion("sti_age =", value, "stiAge");
            return (Criteria) this;
        }

        public Criteria andStiAgeNotEqualTo(Integer value) {
            addCriterion("sti_age <>", value, "stiAge");
            return (Criteria) this;
        }

        public Criteria andStiAgeGreaterThan(Integer value) {
            addCriterion("sti_age >", value, "stiAge");
            return (Criteria) this;
        }

        public Criteria andStiAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sti_age >=", value, "stiAge");
            return (Criteria) this;
        }

        public Criteria andStiAgeLessThan(Integer value) {
            addCriterion("sti_age <", value, "stiAge");
            return (Criteria) this;
        }

        public Criteria andStiAgeLessThanOrEqualTo(Integer value) {
            addCriterion("sti_age <=", value, "stiAge");
            return (Criteria) this;
        }

        public Criteria andStiAgeIn(List<Integer> values) {
            addCriterion("sti_age in", values, "stiAge");
            return (Criteria) this;
        }

        public Criteria andStiAgeNotIn(List<Integer> values) {
            addCriterion("sti_age not in", values, "stiAge");
            return (Criteria) this;
        }

        public Criteria andStiAgeBetween(Integer value1, Integer value2) {
            addCriterion("sti_age between", value1, value2, "stiAge");
            return (Criteria) this;
        }

        public Criteria andStiAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("sti_age not between", value1, value2, "stiAge");
            return (Criteria) this;
        }

        public Criteria andStiSfzhIsNull() {
            addCriterion("sti_sfzh is null");
            return (Criteria) this;
        }

        public Criteria andStiSfzhIsNotNull() {
            addCriterion("sti_sfzh is not null");
            return (Criteria) this;
        }

        public Criteria andStiSfzhEqualTo(String value) {
            addCriterion("sti_sfzh =", value, "stiSfzh");
            return (Criteria) this;
        }

        public Criteria andStiSfzhNotEqualTo(String value) {
            addCriterion("sti_sfzh <>", value, "stiSfzh");
            return (Criteria) this;
        }

        public Criteria andStiSfzhGreaterThan(String value) {
            addCriterion("sti_sfzh >", value, "stiSfzh");
            return (Criteria) this;
        }

        public Criteria andStiSfzhGreaterThanOrEqualTo(String value) {
            addCriterion("sti_sfzh >=", value, "stiSfzh");
            return (Criteria) this;
        }

        public Criteria andStiSfzhLessThan(String value) {
            addCriterion("sti_sfzh <", value, "stiSfzh");
            return (Criteria) this;
        }

        public Criteria andStiSfzhLessThanOrEqualTo(String value) {
            addCriterion("sti_sfzh <=", value, "stiSfzh");
            return (Criteria) this;
        }

        public Criteria andStiSfzhLike(String value) {
            addCriterion("sti_sfzh like", value, "stiSfzh");
            return (Criteria) this;
        }

        public Criteria andStiSfzhNotLike(String value) {
            addCriterion("sti_sfzh not like", value, "stiSfzh");
            return (Criteria) this;
        }

        public Criteria andStiSfzhIn(List<String> values) {
            addCriterion("sti_sfzh in", values, "stiSfzh");
            return (Criteria) this;
        }

        public Criteria andStiSfzhNotIn(List<String> values) {
            addCriterion("sti_sfzh not in", values, "stiSfzh");
            return (Criteria) this;
        }

        public Criteria andStiSfzhBetween(String value1, String value2) {
            addCriterion("sti_sfzh between", value1, value2, "stiSfzh");
            return (Criteria) this;
        }

        public Criteria andStiSfzhNotBetween(String value1, String value2) {
            addCriterion("sti_sfzh not between", value1, value2, "stiSfzh");
            return (Criteria) this;
        }

        public Criteria andStiCsrqIsNull() {
            addCriterion("sti_csrq is null");
            return (Criteria) this;
        }

        public Criteria andStiCsrqIsNotNull() {
            addCriterion("sti_csrq is not null");
            return (Criteria) this;
        }

        public Criteria andStiCsrqEqualTo(Date value) {
            addCriterion("sti_csrq =", value, "stiCsrq");
            return (Criteria) this;
        }

        public Criteria andStiCsrqNotEqualTo(Date value) {
            addCriterion("sti_csrq <>", value, "stiCsrq");
            return (Criteria) this;
        }

        public Criteria andStiCsrqGreaterThan(Date value) {
            addCriterion("sti_csrq >", value, "stiCsrq");
            return (Criteria) this;
        }

        public Criteria andStiCsrqGreaterThanOrEqualTo(Date value) {
            addCriterion("sti_csrq >=", value, "stiCsrq");
            return (Criteria) this;
        }

        public Criteria andStiCsrqLessThan(Date value) {
            addCriterion("sti_csrq <", value, "stiCsrq");
            return (Criteria) this;
        }

        public Criteria andStiCsrqLessThanOrEqualTo(Date value) {
            addCriterion("sti_csrq <=", value, "stiCsrq");
            return (Criteria) this;
        }

        public Criteria andStiCsrqIn(List<Date> values) {
            addCriterion("sti_csrq in", values, "stiCsrq");
            return (Criteria) this;
        }

        public Criteria andStiCsrqNotIn(List<Date> values) {
            addCriterion("sti_csrq not in", values, "stiCsrq");
            return (Criteria) this;
        }

        public Criteria andStiCsrqBetween(Date value1, Date value2) {
            addCriterion("sti_csrq between", value1, value2, "stiCsrq");
            return (Criteria) this;
        }

        public Criteria andStiCsrqNotBetween(Date value1, Date value2) {
            addCriterion("sti_csrq not between", value1, value2, "stiCsrq");
            return (Criteria) this;
        }

        public Criteria andStiZzmmIsNull() {
            addCriterion("sti_zzmm is null");
            return (Criteria) this;
        }

        public Criteria andStiZzmmIsNotNull() {
            addCriterion("sti_zzmm is not null");
            return (Criteria) this;
        }

        public Criteria andStiZzmmEqualTo(String value) {
            addCriterion("sti_zzmm =", value, "stiZzmm");
            return (Criteria) this;
        }

        public Criteria andStiZzmmNotEqualTo(String value) {
            addCriterion("sti_zzmm <>", value, "stiZzmm");
            return (Criteria) this;
        }

        public Criteria andStiZzmmGreaterThan(String value) {
            addCriterion("sti_zzmm >", value, "stiZzmm");
            return (Criteria) this;
        }

        public Criteria andStiZzmmGreaterThanOrEqualTo(String value) {
            addCriterion("sti_zzmm >=", value, "stiZzmm");
            return (Criteria) this;
        }

        public Criteria andStiZzmmLessThan(String value) {
            addCriterion("sti_zzmm <", value, "stiZzmm");
            return (Criteria) this;
        }

        public Criteria andStiZzmmLessThanOrEqualTo(String value) {
            addCriterion("sti_zzmm <=", value, "stiZzmm");
            return (Criteria) this;
        }

        public Criteria andStiZzmmLike(String value) {
            addCriterion("sti_zzmm like", value, "stiZzmm");
            return (Criteria) this;
        }

        public Criteria andStiZzmmNotLike(String value) {
            addCriterion("sti_zzmm not like", value, "stiZzmm");
            return (Criteria) this;
        }

        public Criteria andStiZzmmIn(List<String> values) {
            addCriterion("sti_zzmm in", values, "stiZzmm");
            return (Criteria) this;
        }

        public Criteria andStiZzmmNotIn(List<String> values) {
            addCriterion("sti_zzmm not in", values, "stiZzmm");
            return (Criteria) this;
        }

        public Criteria andStiZzmmBetween(String value1, String value2) {
            addCriterion("sti_zzmm between", value1, value2, "stiZzmm");
            return (Criteria) this;
        }

        public Criteria andStiZzmmNotBetween(String value1, String value2) {
            addCriterion("sti_zzmm not between", value1, value2, "stiZzmm");
            return (Criteria) this;
        }

        public Criteria andStiJtdhIsNull() {
            addCriterion("sti_jtdh is null");
            return (Criteria) this;
        }

        public Criteria andStiJtdhIsNotNull() {
            addCriterion("sti_jtdh is not null");
            return (Criteria) this;
        }

        public Criteria andStiJtdhEqualTo(String value) {
            addCriterion("sti_jtdh =", value, "stiJtdh");
            return (Criteria) this;
        }

        public Criteria andStiJtdhNotEqualTo(String value) {
            addCriterion("sti_jtdh <>", value, "stiJtdh");
            return (Criteria) this;
        }

        public Criteria andStiJtdhGreaterThan(String value) {
            addCriterion("sti_jtdh >", value, "stiJtdh");
            return (Criteria) this;
        }

        public Criteria andStiJtdhGreaterThanOrEqualTo(String value) {
            addCriterion("sti_jtdh >=", value, "stiJtdh");
            return (Criteria) this;
        }

        public Criteria andStiJtdhLessThan(String value) {
            addCriterion("sti_jtdh <", value, "stiJtdh");
            return (Criteria) this;
        }

        public Criteria andStiJtdhLessThanOrEqualTo(String value) {
            addCriterion("sti_jtdh <=", value, "stiJtdh");
            return (Criteria) this;
        }

        public Criteria andStiJtdhLike(String value) {
            addCriterion("sti_jtdh like", value, "stiJtdh");
            return (Criteria) this;
        }

        public Criteria andStiJtdhNotLike(String value) {
            addCriterion("sti_jtdh not like", value, "stiJtdh");
            return (Criteria) this;
        }

        public Criteria andStiJtdhIn(List<String> values) {
            addCriterion("sti_jtdh in", values, "stiJtdh");
            return (Criteria) this;
        }

        public Criteria andStiJtdhNotIn(List<String> values) {
            addCriterion("sti_jtdh not in", values, "stiJtdh");
            return (Criteria) this;
        }

        public Criteria andStiJtdhBetween(String value1, String value2) {
            addCriterion("sti_jtdh between", value1, value2, "stiJtdh");
            return (Criteria) this;
        }

        public Criteria andStiJtdhNotBetween(String value1, String value2) {
            addCriterion("sti_jtdh not between", value1, value2, "stiJtdh");
            return (Criteria) this;
        }

        public Criteria andStiJtdzIsNull() {
            addCriterion("sti_jtdz is null");
            return (Criteria) this;
        }

        public Criteria andStiJtdzIsNotNull() {
            addCriterion("sti_jtdz is not null");
            return (Criteria) this;
        }

        public Criteria andStiJtdzEqualTo(String value) {
            addCriterion("sti_jtdz =", value, "stiJtdz");
            return (Criteria) this;
        }

        public Criteria andStiJtdzNotEqualTo(String value) {
            addCriterion("sti_jtdz <>", value, "stiJtdz");
            return (Criteria) this;
        }

        public Criteria andStiJtdzGreaterThan(String value) {
            addCriterion("sti_jtdz >", value, "stiJtdz");
            return (Criteria) this;
        }

        public Criteria andStiJtdzGreaterThanOrEqualTo(String value) {
            addCriterion("sti_jtdz >=", value, "stiJtdz");
            return (Criteria) this;
        }

        public Criteria andStiJtdzLessThan(String value) {
            addCriterion("sti_jtdz <", value, "stiJtdz");
            return (Criteria) this;
        }

        public Criteria andStiJtdzLessThanOrEqualTo(String value) {
            addCriterion("sti_jtdz <=", value, "stiJtdz");
            return (Criteria) this;
        }

        public Criteria andStiJtdzLike(String value) {
            addCriterion("sti_jtdz like", value, "stiJtdz");
            return (Criteria) this;
        }

        public Criteria andStiJtdzNotLike(String value) {
            addCriterion("sti_jtdz not like", value, "stiJtdz");
            return (Criteria) this;
        }

        public Criteria andStiJtdzIn(List<String> values) {
            addCriterion("sti_jtdz in", values, "stiJtdz");
            return (Criteria) this;
        }

        public Criteria andStiJtdzNotIn(List<String> values) {
            addCriterion("sti_jtdz not in", values, "stiJtdz");
            return (Criteria) this;
        }

        public Criteria andStiJtdzBetween(String value1, String value2) {
            addCriterion("sti_jtdz between", value1, value2, "stiJtdz");
            return (Criteria) this;
        }

        public Criteria andStiJtdzNotBetween(String value1, String value2) {
            addCriterion("sti_jtdz not between", value1, value2, "stiJtdz");
            return (Criteria) this;
        }

        public Criteria andStiJkzkIsNull() {
            addCriterion("sti_jkzk is null");
            return (Criteria) this;
        }

        public Criteria andStiJkzkIsNotNull() {
            addCriterion("sti_jkzk is not null");
            return (Criteria) this;
        }

        public Criteria andStiJkzkEqualTo(String value) {
            addCriterion("sti_jkzk =", value, "stiJkzk");
            return (Criteria) this;
        }

        public Criteria andStiJkzkNotEqualTo(String value) {
            addCriterion("sti_jkzk <>", value, "stiJkzk");
            return (Criteria) this;
        }

        public Criteria andStiJkzkGreaterThan(String value) {
            addCriterion("sti_jkzk >", value, "stiJkzk");
            return (Criteria) this;
        }

        public Criteria andStiJkzkGreaterThanOrEqualTo(String value) {
            addCriterion("sti_jkzk >=", value, "stiJkzk");
            return (Criteria) this;
        }

        public Criteria andStiJkzkLessThan(String value) {
            addCriterion("sti_jkzk <", value, "stiJkzk");
            return (Criteria) this;
        }

        public Criteria andStiJkzkLessThanOrEqualTo(String value) {
            addCriterion("sti_jkzk <=", value, "stiJkzk");
            return (Criteria) this;
        }

        public Criteria andStiJkzkLike(String value) {
            addCriterion("sti_jkzk like", value, "stiJkzk");
            return (Criteria) this;
        }

        public Criteria andStiJkzkNotLike(String value) {
            addCriterion("sti_jkzk not like", value, "stiJkzk");
            return (Criteria) this;
        }

        public Criteria andStiJkzkIn(List<String> values) {
            addCriterion("sti_jkzk in", values, "stiJkzk");
            return (Criteria) this;
        }

        public Criteria andStiJkzkNotIn(List<String> values) {
            addCriterion("sti_jkzk not in", values, "stiJkzk");
            return (Criteria) this;
        }

        public Criteria andStiJkzkBetween(String value1, String value2) {
            addCriterion("sti_jkzk between", value1, value2, "stiJkzk");
            return (Criteria) this;
        }

        public Criteria andStiJkzkNotBetween(String value1, String value2) {
            addCriterion("sti_jkzk not between", value1, value2, "stiJkzk");
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