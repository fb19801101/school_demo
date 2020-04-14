package com.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BorrowInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public BorrowInfoExample() {
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

        public Criteria andBwiIdIsNull() {
            addCriterion("bwi_id is null");
            return (Criteria) this;
        }

        public Criteria andBwiIdIsNotNull() {
            addCriterion("bwi_id is not null");
            return (Criteria) this;
        }

        public Criteria andBwiIdEqualTo(String value) {
            addCriterion("bwi_id =", value, "bwiId");
            return (Criteria) this;
        }

        public Criteria andBwiIdNotEqualTo(String value) {
            addCriterion("bwi_id <>", value, "bwiId");
            return (Criteria) this;
        }

        public Criteria andBwiIdGreaterThan(String value) {
            addCriterion("bwi_id >", value, "bwiId");
            return (Criteria) this;
        }

        public Criteria andBwiIdGreaterThanOrEqualTo(String value) {
            addCriterion("bwi_id >=", value, "bwiId");
            return (Criteria) this;
        }

        public Criteria andBwiIdLessThan(String value) {
            addCriterion("bwi_id <", value, "bwiId");
            return (Criteria) this;
        }

        public Criteria andBwiIdLessThanOrEqualTo(String value) {
            addCriterion("bwi_id <=", value, "bwiId");
            return (Criteria) this;
        }

        public Criteria andBwiIdLike(String value) {
            addCriterion("bwi_id like", value, "bwiId");
            return (Criteria) this;
        }

        public Criteria andBwiIdNotLike(String value) {
            addCriterion("bwi_id not like", value, "bwiId");
            return (Criteria) this;
        }

        public Criteria andBwiIdIn(List<String> values) {
            addCriterion("bwi_id in", values, "bwiId");
            return (Criteria) this;
        }

        public Criteria andBwiIdNotIn(List<String> values) {
            addCriterion("bwi_id not in", values, "bwiId");
            return (Criteria) this;
        }

        public Criteria andBwiIdBetween(String value1, String value2) {
            addCriterion("bwi_id between", value1, value2, "bwiId");
            return (Criteria) this;
        }

        public Criteria andBwiIdNotBetween(String value1, String value2) {
            addCriterion("bwi_id not between", value1, value2, "bwiId");
            return (Criteria) this;
        }

        public Criteria andBkiIdIsNull() {
            addCriterion("bki_id is null");
            return (Criteria) this;
        }

        public Criteria andBkiIdIsNotNull() {
            addCriterion("bki_id is not null");
            return (Criteria) this;
        }

        public Criteria andBkiIdEqualTo(String value) {
            addCriterion("bki_id =", value, "bkiId");
            return (Criteria) this;
        }

        public Criteria andBkiIdNotEqualTo(String value) {
            addCriterion("bki_id <>", value, "bkiId");
            return (Criteria) this;
        }

        public Criteria andBkiIdGreaterThan(String value) {
            addCriterion("bki_id >", value, "bkiId");
            return (Criteria) this;
        }

        public Criteria andBkiIdGreaterThanOrEqualTo(String value) {
            addCriterion("bki_id >=", value, "bkiId");
            return (Criteria) this;
        }

        public Criteria andBkiIdLessThan(String value) {
            addCriterion("bki_id <", value, "bkiId");
            return (Criteria) this;
        }

        public Criteria andBkiIdLessThanOrEqualTo(String value) {
            addCriterion("bki_id <=", value, "bkiId");
            return (Criteria) this;
        }

        public Criteria andBkiIdLike(String value) {
            addCriterion("bki_id like", value, "bkiId");
            return (Criteria) this;
        }

        public Criteria andBkiIdNotLike(String value) {
            addCriterion("bki_id not like", value, "bkiId");
            return (Criteria) this;
        }

        public Criteria andBkiIdIn(List<String> values) {
            addCriterion("bki_id in", values, "bkiId");
            return (Criteria) this;
        }

        public Criteria andBkiIdNotIn(List<String> values) {
            addCriterion("bki_id not in", values, "bkiId");
            return (Criteria) this;
        }

        public Criteria andBkiIdBetween(String value1, String value2) {
            addCriterion("bki_id between", value1, value2, "bkiId");
            return (Criteria) this;
        }

        public Criteria andBkiIdNotBetween(String value1, String value2) {
            addCriterion("bki_id not between", value1, value2, "bkiId");
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

        public Criteria andBwiNameIsNull() {
            addCriterion("bwi_name is null");
            return (Criteria) this;
        }

        public Criteria andBwiNameIsNotNull() {
            addCriterion("bwi_name is not null");
            return (Criteria) this;
        }

        public Criteria andBwiNameEqualTo(String value) {
            addCriterion("bwi_name =", value, "bwiName");
            return (Criteria) this;
        }

        public Criteria andBwiNameNotEqualTo(String value) {
            addCriterion("bwi_name <>", value, "bwiName");
            return (Criteria) this;
        }

        public Criteria andBwiNameGreaterThan(String value) {
            addCriterion("bwi_name >", value, "bwiName");
            return (Criteria) this;
        }

        public Criteria andBwiNameGreaterThanOrEqualTo(String value) {
            addCriterion("bwi_name >=", value, "bwiName");
            return (Criteria) this;
        }

        public Criteria andBwiNameLessThan(String value) {
            addCriterion("bwi_name <", value, "bwiName");
            return (Criteria) this;
        }

        public Criteria andBwiNameLessThanOrEqualTo(String value) {
            addCriterion("bwi_name <=", value, "bwiName");
            return (Criteria) this;
        }

        public Criteria andBwiNameLike(String value) {
            addCriterion("bwi_name like", value, "bwiName");
            return (Criteria) this;
        }

        public Criteria andBwiNameNotLike(String value) {
            addCriterion("bwi_name not like", value, "bwiName");
            return (Criteria) this;
        }

        public Criteria andBwiNameIn(List<String> values) {
            addCriterion("bwi_name in", values, "bwiName");
            return (Criteria) this;
        }

        public Criteria andBwiNameNotIn(List<String> values) {
            addCriterion("bwi_name not in", values, "bwiName");
            return (Criteria) this;
        }

        public Criteria andBwiNameBetween(String value1, String value2) {
            addCriterion("bwi_name between", value1, value2, "bwiName");
            return (Criteria) this;
        }

        public Criteria andBwiNameNotBetween(String value1, String value2) {
            addCriterion("bwi_name not between", value1, value2, "bwiName");
            return (Criteria) this;
        }

        public Criteria andBwiPriceIsNull() {
            addCriterion("bwi_price is null");
            return (Criteria) this;
        }

        public Criteria andBwiPriceIsNotNull() {
            addCriterion("bwi_price is not null");
            return (Criteria) this;
        }

        public Criteria andBwiPriceEqualTo(Double value) {
            addCriterion("bwi_price =", value, "bwiPrice");
            return (Criteria) this;
        }

        public Criteria andBwiPriceNotEqualTo(Double value) {
            addCriterion("bwi_price <>", value, "bwiPrice");
            return (Criteria) this;
        }

        public Criteria andBwiPriceGreaterThan(Double value) {
            addCriterion("bwi_price >", value, "bwiPrice");
            return (Criteria) this;
        }

        public Criteria andBwiPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("bwi_price >=", value, "bwiPrice");
            return (Criteria) this;
        }

        public Criteria andBwiPriceLessThan(Double value) {
            addCriterion("bwi_price <", value, "bwiPrice");
            return (Criteria) this;
        }

        public Criteria andBwiPriceLessThanOrEqualTo(Double value) {
            addCriterion("bwi_price <=", value, "bwiPrice");
            return (Criteria) this;
        }

        public Criteria andBwiPriceIn(List<Double> values) {
            addCriterion("bwi_price in", values, "bwiPrice");
            return (Criteria) this;
        }

        public Criteria andBwiPriceNotIn(List<Double> values) {
            addCriterion("bwi_price not in", values, "bwiPrice");
            return (Criteria) this;
        }

        public Criteria andBwiPriceBetween(Double value1, Double value2) {
            addCriterion("bwi_price between", value1, value2, "bwiPrice");
            return (Criteria) this;
        }

        public Criteria andBwiPriceNotBetween(Double value1, Double value2) {
            addCriterion("bwi_price not between", value1, value2, "bwiPrice");
            return (Criteria) this;
        }

        public Criteria andBwiTypeIsNull() {
            addCriterion("bwi_type is null");
            return (Criteria) this;
        }

        public Criteria andBwiTypeIsNotNull() {
            addCriterion("bwi_type is not null");
            return (Criteria) this;
        }

        public Criteria andBwiTypeEqualTo(String value) {
            addCriterion("bwi_type =", value, "bwiType");
            return (Criteria) this;
        }

        public Criteria andBwiTypeNotEqualTo(String value) {
            addCriterion("bwi_type <>", value, "bwiType");
            return (Criteria) this;
        }

        public Criteria andBwiTypeGreaterThan(String value) {
            addCriterion("bwi_type >", value, "bwiType");
            return (Criteria) this;
        }

        public Criteria andBwiTypeGreaterThanOrEqualTo(String value) {
            addCriterion("bwi_type >=", value, "bwiType");
            return (Criteria) this;
        }

        public Criteria andBwiTypeLessThan(String value) {
            addCriterion("bwi_type <", value, "bwiType");
            return (Criteria) this;
        }

        public Criteria andBwiTypeLessThanOrEqualTo(String value) {
            addCriterion("bwi_type <=", value, "bwiType");
            return (Criteria) this;
        }

        public Criteria andBwiTypeLike(String value) {
            addCriterion("bwi_type like", value, "bwiType");
            return (Criteria) this;
        }

        public Criteria andBwiTypeNotLike(String value) {
            addCriterion("bwi_type not like", value, "bwiType");
            return (Criteria) this;
        }

        public Criteria andBwiTypeIn(List<String> values) {
            addCriterion("bwi_type in", values, "bwiType");
            return (Criteria) this;
        }

        public Criteria andBwiTypeNotIn(List<String> values) {
            addCriterion("bwi_type not in", values, "bwiType");
            return (Criteria) this;
        }

        public Criteria andBwiTypeBetween(String value1, String value2) {
            addCriterion("bwi_type between", value1, value2, "bwiType");
            return (Criteria) this;
        }

        public Criteria andBwiTypeNotBetween(String value1, String value2) {
            addCriterion("bwi_type not between", value1, value2, "bwiType");
            return (Criteria) this;
        }

        public Criteria andBwiBorrowDateIsNull() {
            addCriterion("bwi_borrow_date is null");
            return (Criteria) this;
        }

        public Criteria andBwiBorrowDateIsNotNull() {
            addCriterion("bwi_borrow_date is not null");
            return (Criteria) this;
        }

        public Criteria andBwiBorrowDateEqualTo(Date value) {
            addCriterion("bwi_borrow_date =", value, "bwiBorrowDate");
            return (Criteria) this;
        }

        public Criteria andBwiBorrowDateNotEqualTo(Date value) {
            addCriterion("bwi_borrow_date <>", value, "bwiBorrowDate");
            return (Criteria) this;
        }

        public Criteria andBwiBorrowDateGreaterThan(Date value) {
            addCriterion("bwi_borrow_date >", value, "bwiBorrowDate");
            return (Criteria) this;
        }

        public Criteria andBwiBorrowDateGreaterThanOrEqualTo(Date value) {
            addCriterion("bwi_borrow_date >=", value, "bwiBorrowDate");
            return (Criteria) this;
        }

        public Criteria andBwiBorrowDateLessThan(Date value) {
            addCriterion("bwi_borrow_date <", value, "bwiBorrowDate");
            return (Criteria) this;
        }

        public Criteria andBwiBorrowDateLessThanOrEqualTo(Date value) {
            addCriterion("bwi_borrow_date <=", value, "bwiBorrowDate");
            return (Criteria) this;
        }

        public Criteria andBwiBorrowDateIn(List<Date> values) {
            addCriterion("bwi_borrow_date in", values, "bwiBorrowDate");
            return (Criteria) this;
        }

        public Criteria andBwiBorrowDateNotIn(List<Date> values) {
            addCriterion("bwi_borrow_date not in", values, "bwiBorrowDate");
            return (Criteria) this;
        }

        public Criteria andBwiBorrowDateBetween(Date value1, Date value2) {
            addCriterion("bwi_borrow_date between", value1, value2, "bwiBorrowDate");
            return (Criteria) this;
        }

        public Criteria andBwiBorrowDateNotBetween(Date value1, Date value2) {
            addCriterion("bwi_borrow_date not between", value1, value2, "bwiBorrowDate");
            return (Criteria) this;
        }

        public Criteria andBwiCountIsNull() {
            addCriterion("bwi_count is null");
            return (Criteria) this;
        }

        public Criteria andBwiCountIsNotNull() {
            addCriterion("bwi_count is not null");
            return (Criteria) this;
        }

        public Criteria andBwiCountEqualTo(Integer value) {
            addCriterion("bwi_count =", value, "bwiCount");
            return (Criteria) this;
        }

        public Criteria andBwiCountNotEqualTo(Integer value) {
            addCriterion("bwi_count <>", value, "bwiCount");
            return (Criteria) this;
        }

        public Criteria andBwiCountGreaterThan(Integer value) {
            addCriterion("bwi_count >", value, "bwiCount");
            return (Criteria) this;
        }

        public Criteria andBwiCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("bwi_count >=", value, "bwiCount");
            return (Criteria) this;
        }

        public Criteria andBwiCountLessThan(Integer value) {
            addCriterion("bwi_count <", value, "bwiCount");
            return (Criteria) this;
        }

        public Criteria andBwiCountLessThanOrEqualTo(Integer value) {
            addCriterion("bwi_count <=", value, "bwiCount");
            return (Criteria) this;
        }

        public Criteria andBwiCountIn(List<Integer> values) {
            addCriterion("bwi_count in", values, "bwiCount");
            return (Criteria) this;
        }

        public Criteria andBwiCountNotIn(List<Integer> values) {
            addCriterion("bwi_count not in", values, "bwiCount");
            return (Criteria) this;
        }

        public Criteria andBwiCountBetween(Integer value1, Integer value2) {
            addCriterion("bwi_count between", value1, value2, "bwiCount");
            return (Criteria) this;
        }

        public Criteria andBwiCountNotBetween(Integer value1, Integer value2) {
            addCriterion("bwi_count not between", value1, value2, "bwiCount");
            return (Criteria) this;
        }

        public Criteria andBwiReturnDateIsNull() {
            addCriterion("bwi_return_date is null");
            return (Criteria) this;
        }

        public Criteria andBwiReturnDateIsNotNull() {
            addCriterion("bwi_return_date is not null");
            return (Criteria) this;
        }

        public Criteria andBwiReturnDateEqualTo(Date value) {
            addCriterion("bwi_return_date =", value, "bwiReturnDate");
            return (Criteria) this;
        }

        public Criteria andBwiReturnDateNotEqualTo(Date value) {
            addCriterion("bwi_return_date <>", value, "bwiReturnDate");
            return (Criteria) this;
        }

        public Criteria andBwiReturnDateGreaterThan(Date value) {
            addCriterion("bwi_return_date >", value, "bwiReturnDate");
            return (Criteria) this;
        }

        public Criteria andBwiReturnDateGreaterThanOrEqualTo(Date value) {
            addCriterion("bwi_return_date >=", value, "bwiReturnDate");
            return (Criteria) this;
        }

        public Criteria andBwiReturnDateLessThan(Date value) {
            addCriterion("bwi_return_date <", value, "bwiReturnDate");
            return (Criteria) this;
        }

        public Criteria andBwiReturnDateLessThanOrEqualTo(Date value) {
            addCriterion("bwi_return_date <=", value, "bwiReturnDate");
            return (Criteria) this;
        }

        public Criteria andBwiReturnDateIn(List<Date> values) {
            addCriterion("bwi_return_date in", values, "bwiReturnDate");
            return (Criteria) this;
        }

        public Criteria andBwiReturnDateNotIn(List<Date> values) {
            addCriterion("bwi_return_date not in", values, "bwiReturnDate");
            return (Criteria) this;
        }

        public Criteria andBwiReturnDateBetween(Date value1, Date value2) {
            addCriterion("bwi_return_date between", value1, value2, "bwiReturnDate");
            return (Criteria) this;
        }

        public Criteria andBwiReturnDateNotBetween(Date value1, Date value2) {
            addCriterion("bwi_return_date not between", value1, value2, "bwiReturnDate");
            return (Criteria) this;
        }

        public Criteria andBwiCzyIsNull() {
            addCriterion("bwi_czy is null");
            return (Criteria) this;
        }

        public Criteria andBwiCzyIsNotNull() {
            addCriterion("bwi_czy is not null");
            return (Criteria) this;
        }

        public Criteria andBwiCzyEqualTo(String value) {
            addCriterion("bwi_czy =", value, "bwiCzy");
            return (Criteria) this;
        }

        public Criteria andBwiCzyNotEqualTo(String value) {
            addCriterion("bwi_czy <>", value, "bwiCzy");
            return (Criteria) this;
        }

        public Criteria andBwiCzyGreaterThan(String value) {
            addCriterion("bwi_czy >", value, "bwiCzy");
            return (Criteria) this;
        }

        public Criteria andBwiCzyGreaterThanOrEqualTo(String value) {
            addCriterion("bwi_czy >=", value, "bwiCzy");
            return (Criteria) this;
        }

        public Criteria andBwiCzyLessThan(String value) {
            addCriterion("bwi_czy <", value, "bwiCzy");
            return (Criteria) this;
        }

        public Criteria andBwiCzyLessThanOrEqualTo(String value) {
            addCriterion("bwi_czy <=", value, "bwiCzy");
            return (Criteria) this;
        }

        public Criteria andBwiCzyLike(String value) {
            addCriterion("bwi_czy like", value, "bwiCzy");
            return (Criteria) this;
        }

        public Criteria andBwiCzyNotLike(String value) {
            addCriterion("bwi_czy not like", value, "bwiCzy");
            return (Criteria) this;
        }

        public Criteria andBwiCzyIn(List<String> values) {
            addCriterion("bwi_czy in", values, "bwiCzy");
            return (Criteria) this;
        }

        public Criteria andBwiCzyNotIn(List<String> values) {
            addCriterion("bwi_czy not in", values, "bwiCzy");
            return (Criteria) this;
        }

        public Criteria andBwiCzyBetween(String value1, String value2) {
            addCriterion("bwi_czy between", value1, value2, "bwiCzy");
            return (Criteria) this;
        }

        public Criteria andBwiCzyNotBetween(String value1, String value2) {
            addCriterion("bwi_czy not between", value1, value2, "bwiCzy");
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