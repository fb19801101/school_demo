package com.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CourseInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public CourseInfoExample() {
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

        public Criteria andCsiIdIsNull() {
            addCriterion("csi_id is null");
            return (Criteria) this;
        }

        public Criteria andCsiIdIsNotNull() {
            addCriterion("csi_id is not null");
            return (Criteria) this;
        }

        public Criteria andCsiIdEqualTo(String value) {
            addCriterion("csi_id =", value, "csiId");
            return (Criteria) this;
        }

        public Criteria andCsiIdNotEqualTo(String value) {
            addCriterion("csi_id <>", value, "csiId");
            return (Criteria) this;
        }

        public Criteria andCsiIdGreaterThan(String value) {
            addCriterion("csi_id >", value, "csiId");
            return (Criteria) this;
        }

        public Criteria andCsiIdGreaterThanOrEqualTo(String value) {
            addCriterion("csi_id >=", value, "csiId");
            return (Criteria) this;
        }

        public Criteria andCsiIdLessThan(String value) {
            addCriterion("csi_id <", value, "csiId");
            return (Criteria) this;
        }

        public Criteria andCsiIdLessThanOrEqualTo(String value) {
            addCriterion("csi_id <=", value, "csiId");
            return (Criteria) this;
        }

        public Criteria andCsiIdLike(String value) {
            addCriterion("csi_id like", value, "csiId");
            return (Criteria) this;
        }

        public Criteria andCsiIdNotLike(String value) {
            addCriterion("csi_id not like", value, "csiId");
            return (Criteria) this;
        }

        public Criteria andCsiIdIn(List<String> values) {
            addCriterion("csi_id in", values, "csiId");
            return (Criteria) this;
        }

        public Criteria andCsiIdNotIn(List<String> values) {
            addCriterion("csi_id not in", values, "csiId");
            return (Criteria) this;
        }

        public Criteria andCsiIdBetween(String value1, String value2) {
            addCriterion("csi_id between", value1, value2, "csiId");
            return (Criteria) this;
        }

        public Criteria andCsiIdNotBetween(String value1, String value2) {
            addCriterion("csi_id not between", value1, value2, "csiId");
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

        public Criteria andCsiGradeIsNull() {
            addCriterion("csi_grade is null");
            return (Criteria) this;
        }

        public Criteria andCsiGradeIsNotNull() {
            addCriterion("csi_grade is not null");
            return (Criteria) this;
        }

        public Criteria andCsiGradeEqualTo(String value) {
            addCriterion("csi_grade =", value, "csiGrade");
            return (Criteria) this;
        }

        public Criteria andCsiGradeNotEqualTo(String value) {
            addCriterion("csi_grade <>", value, "csiGrade");
            return (Criteria) this;
        }

        public Criteria andCsiGradeGreaterThan(String value) {
            addCriterion("csi_grade >", value, "csiGrade");
            return (Criteria) this;
        }

        public Criteria andCsiGradeGreaterThanOrEqualTo(String value) {
            addCriterion("csi_grade >=", value, "csiGrade");
            return (Criteria) this;
        }

        public Criteria andCsiGradeLessThan(String value) {
            addCriterion("csi_grade <", value, "csiGrade");
            return (Criteria) this;
        }

        public Criteria andCsiGradeLessThanOrEqualTo(String value) {
            addCriterion("csi_grade <=", value, "csiGrade");
            return (Criteria) this;
        }

        public Criteria andCsiGradeLike(String value) {
            addCriterion("csi_grade like", value, "csiGrade");
            return (Criteria) this;
        }

        public Criteria andCsiGradeNotLike(String value) {
            addCriterion("csi_grade not like", value, "csiGrade");
            return (Criteria) this;
        }

        public Criteria andCsiGradeIn(List<String> values) {
            addCriterion("csi_grade in", values, "csiGrade");
            return (Criteria) this;
        }

        public Criteria andCsiGradeNotIn(List<String> values) {
            addCriterion("csi_grade not in", values, "csiGrade");
            return (Criteria) this;
        }

        public Criteria andCsiGradeBetween(String value1, String value2) {
            addCriterion("csi_grade between", value1, value2, "csiGrade");
            return (Criteria) this;
        }

        public Criteria andCsiGradeNotBetween(String value1, String value2) {
            addCriterion("csi_grade not between", value1, value2, "csiGrade");
            return (Criteria) this;
        }

        public Criteria andCsiExamTypeIsNull() {
            addCriterion("csi_exam_type is null");
            return (Criteria) this;
        }

        public Criteria andCsiExamTypeIsNotNull() {
            addCriterion("csi_exam_type is not null");
            return (Criteria) this;
        }

        public Criteria andCsiExamTypeEqualTo(String value) {
            addCriterion("csi_exam_type =", value, "csiExamType");
            return (Criteria) this;
        }

        public Criteria andCsiExamTypeNotEqualTo(String value) {
            addCriterion("csi_exam_type <>", value, "csiExamType");
            return (Criteria) this;
        }

        public Criteria andCsiExamTypeGreaterThan(String value) {
            addCriterion("csi_exam_type >", value, "csiExamType");
            return (Criteria) this;
        }

        public Criteria andCsiExamTypeGreaterThanOrEqualTo(String value) {
            addCriterion("csi_exam_type >=", value, "csiExamType");
            return (Criteria) this;
        }

        public Criteria andCsiExamTypeLessThan(String value) {
            addCriterion("csi_exam_type <", value, "csiExamType");
            return (Criteria) this;
        }

        public Criteria andCsiExamTypeLessThanOrEqualTo(String value) {
            addCriterion("csi_exam_type <=", value, "csiExamType");
            return (Criteria) this;
        }

        public Criteria andCsiExamTypeLike(String value) {
            addCriterion("csi_exam_type like", value, "csiExamType");
            return (Criteria) this;
        }

        public Criteria andCsiExamTypeNotLike(String value) {
            addCriterion("csi_exam_type not like", value, "csiExamType");
            return (Criteria) this;
        }

        public Criteria andCsiExamTypeIn(List<String> values) {
            addCriterion("csi_exam_type in", values, "csiExamType");
            return (Criteria) this;
        }

        public Criteria andCsiExamTypeNotIn(List<String> values) {
            addCriterion("csi_exam_type not in", values, "csiExamType");
            return (Criteria) this;
        }

        public Criteria andCsiExamTypeBetween(String value1, String value2) {
            addCriterion("csi_exam_type between", value1, value2, "csiExamType");
            return (Criteria) this;
        }

        public Criteria andCsiExamTypeNotBetween(String value1, String value2) {
            addCriterion("csi_exam_type not between", value1, value2, "csiExamType");
            return (Criteria) this;
        }

        public Criteria andCsiExamDateIsNull() {
            addCriterion("csi_exam_date is null");
            return (Criteria) this;
        }

        public Criteria andCsiExamDateIsNotNull() {
            addCriterion("csi_exam_date is not null");
            return (Criteria) this;
        }

        public Criteria andCsiExamDateEqualTo(Date value) {
            addCriterion("csi_exam_date =", value, "csiExamDate");
            return (Criteria) this;
        }

        public Criteria andCsiExamDateNotEqualTo(Date value) {
            addCriterion("csi_exam_date <>", value, "csiExamDate");
            return (Criteria) this;
        }

        public Criteria andCsiExamDateGreaterThan(Date value) {
            addCriterion("csi_exam_date >", value, "csiExamDate");
            return (Criteria) this;
        }

        public Criteria andCsiExamDateGreaterThanOrEqualTo(Date value) {
            addCriterion("csi_exam_date >=", value, "csiExamDate");
            return (Criteria) this;
        }

        public Criteria andCsiExamDateLessThan(Date value) {
            addCriterion("csi_exam_date <", value, "csiExamDate");
            return (Criteria) this;
        }

        public Criteria andCsiExamDateLessThanOrEqualTo(Date value) {
            addCriterion("csi_exam_date <=", value, "csiExamDate");
            return (Criteria) this;
        }

        public Criteria andCsiExamDateIn(List<Date> values) {
            addCriterion("csi_exam_date in", values, "csiExamDate");
            return (Criteria) this;
        }

        public Criteria andCsiExamDateNotIn(List<Date> values) {
            addCriterion("csi_exam_date not in", values, "csiExamDate");
            return (Criteria) this;
        }

        public Criteria andCsiExamDateBetween(Date value1, Date value2) {
            addCriterion("csi_exam_date between", value1, value2, "csiExamDate");
            return (Criteria) this;
        }

        public Criteria andCsiExamDateNotBetween(Date value1, Date value2) {
            addCriterion("csi_exam_date not between", value1, value2, "csiExamDate");
            return (Criteria) this;
        }

        public Criteria andCsiCzyIsNull() {
            addCriterion("csi_czy is null");
            return (Criteria) this;
        }

        public Criteria andCsiCzyIsNotNull() {
            addCriterion("csi_czy is not null");
            return (Criteria) this;
        }

        public Criteria andCsiCzyEqualTo(String value) {
            addCriterion("csi_czy =", value, "csiCzy");
            return (Criteria) this;
        }

        public Criteria andCsiCzyNotEqualTo(String value) {
            addCriterion("csi_czy <>", value, "csiCzy");
            return (Criteria) this;
        }

        public Criteria andCsiCzyGreaterThan(String value) {
            addCriterion("csi_czy >", value, "csiCzy");
            return (Criteria) this;
        }

        public Criteria andCsiCzyGreaterThanOrEqualTo(String value) {
            addCriterion("csi_czy >=", value, "csiCzy");
            return (Criteria) this;
        }

        public Criteria andCsiCzyLessThan(String value) {
            addCriterion("csi_czy <", value, "csiCzy");
            return (Criteria) this;
        }

        public Criteria andCsiCzyLessThanOrEqualTo(String value) {
            addCriterion("csi_czy <=", value, "csiCzy");
            return (Criteria) this;
        }

        public Criteria andCsiCzyLike(String value) {
            addCriterion("csi_czy like", value, "csiCzy");
            return (Criteria) this;
        }

        public Criteria andCsiCzyNotLike(String value) {
            addCriterion("csi_czy not like", value, "csiCzy");
            return (Criteria) this;
        }

        public Criteria andCsiCzyIn(List<String> values) {
            addCriterion("csi_czy in", values, "csiCzy");
            return (Criteria) this;
        }

        public Criteria andCsiCzyNotIn(List<String> values) {
            addCriterion("csi_czy not in", values, "csiCzy");
            return (Criteria) this;
        }

        public Criteria andCsiCzyBetween(String value1, String value2) {
            addCriterion("csi_czy between", value1, value2, "csiCzy");
            return (Criteria) this;
        }

        public Criteria andCsiCzyNotBetween(String value1, String value2) {
            addCriterion("csi_czy not between", value1, value2, "csiCzy");
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