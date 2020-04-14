package com.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public BookInfoExample() {
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

        public Criteria andBkiNameIsNull() {
            addCriterion("bki_name is null");
            return (Criteria) this;
        }

        public Criteria andBkiNameIsNotNull() {
            addCriterion("bki_name is not null");
            return (Criteria) this;
        }

        public Criteria andBkiNameEqualTo(String value) {
            addCriterion("bki_name =", value, "bkiName");
            return (Criteria) this;
        }

        public Criteria andBkiNameNotEqualTo(String value) {
            addCriterion("bki_name <>", value, "bkiName");
            return (Criteria) this;
        }

        public Criteria andBkiNameGreaterThan(String value) {
            addCriterion("bki_name >", value, "bkiName");
            return (Criteria) this;
        }

        public Criteria andBkiNameGreaterThanOrEqualTo(String value) {
            addCriterion("bki_name >=", value, "bkiName");
            return (Criteria) this;
        }

        public Criteria andBkiNameLessThan(String value) {
            addCriterion("bki_name <", value, "bkiName");
            return (Criteria) this;
        }

        public Criteria andBkiNameLessThanOrEqualTo(String value) {
            addCriterion("bki_name <=", value, "bkiName");
            return (Criteria) this;
        }

        public Criteria andBkiNameLike(String value) {
            addCriterion("bki_name like", value, "bkiName");
            return (Criteria) this;
        }

        public Criteria andBkiNameNotLike(String value) {
            addCriterion("bki_name not like", value, "bkiName");
            return (Criteria) this;
        }

        public Criteria andBkiNameIn(List<String> values) {
            addCriterion("bki_name in", values, "bkiName");
            return (Criteria) this;
        }

        public Criteria andBkiNameNotIn(List<String> values) {
            addCriterion("bki_name not in", values, "bkiName");
            return (Criteria) this;
        }

        public Criteria andBkiNameBetween(String value1, String value2) {
            addCriterion("bki_name between", value1, value2, "bkiName");
            return (Criteria) this;
        }

        public Criteria andBkiNameNotBetween(String value1, String value2) {
            addCriterion("bki_name not between", value1, value2, "bkiName");
            return (Criteria) this;
        }

        public Criteria andBkiTypeIsNull() {
            addCriterion("bki_type is null");
            return (Criteria) this;
        }

        public Criteria andBkiTypeIsNotNull() {
            addCriterion("bki_type is not null");
            return (Criteria) this;
        }

        public Criteria andBkiTypeEqualTo(String value) {
            addCriterion("bki_type =", value, "bkiType");
            return (Criteria) this;
        }

        public Criteria andBkiTypeNotEqualTo(String value) {
            addCriterion("bki_type <>", value, "bkiType");
            return (Criteria) this;
        }

        public Criteria andBkiTypeGreaterThan(String value) {
            addCriterion("bki_type >", value, "bkiType");
            return (Criteria) this;
        }

        public Criteria andBkiTypeGreaterThanOrEqualTo(String value) {
            addCriterion("bki_type >=", value, "bkiType");
            return (Criteria) this;
        }

        public Criteria andBkiTypeLessThan(String value) {
            addCriterion("bki_type <", value, "bkiType");
            return (Criteria) this;
        }

        public Criteria andBkiTypeLessThanOrEqualTo(String value) {
            addCriterion("bki_type <=", value, "bkiType");
            return (Criteria) this;
        }

        public Criteria andBkiTypeLike(String value) {
            addCriterion("bki_type like", value, "bkiType");
            return (Criteria) this;
        }

        public Criteria andBkiTypeNotLike(String value) {
            addCriterion("bki_type not like", value, "bkiType");
            return (Criteria) this;
        }

        public Criteria andBkiTypeIn(List<String> values) {
            addCriterion("bki_type in", values, "bkiType");
            return (Criteria) this;
        }

        public Criteria andBkiTypeNotIn(List<String> values) {
            addCriterion("bki_type not in", values, "bkiType");
            return (Criteria) this;
        }

        public Criteria andBkiTypeBetween(String value1, String value2) {
            addCriterion("bki_type between", value1, value2, "bkiType");
            return (Criteria) this;
        }

        public Criteria andBkiTypeNotBetween(String value1, String value2) {
            addCriterion("bki_type not between", value1, value2, "bkiType");
            return (Criteria) this;
        }

        public Criteria andBkiWriterIsNull() {
            addCriterion("bki_writer is null");
            return (Criteria) this;
        }

        public Criteria andBkiWriterIsNotNull() {
            addCriterion("bki_writer is not null");
            return (Criteria) this;
        }

        public Criteria andBkiWriterEqualTo(String value) {
            addCriterion("bki_writer =", value, "bkiWriter");
            return (Criteria) this;
        }

        public Criteria andBkiWriterNotEqualTo(String value) {
            addCriterion("bki_writer <>", value, "bkiWriter");
            return (Criteria) this;
        }

        public Criteria andBkiWriterGreaterThan(String value) {
            addCriterion("bki_writer >", value, "bkiWriter");
            return (Criteria) this;
        }

        public Criteria andBkiWriterGreaterThanOrEqualTo(String value) {
            addCriterion("bki_writer >=", value, "bkiWriter");
            return (Criteria) this;
        }

        public Criteria andBkiWriterLessThan(String value) {
            addCriterion("bki_writer <", value, "bkiWriter");
            return (Criteria) this;
        }

        public Criteria andBkiWriterLessThanOrEqualTo(String value) {
            addCriterion("bki_writer <=", value, "bkiWriter");
            return (Criteria) this;
        }

        public Criteria andBkiWriterLike(String value) {
            addCriterion("bki_writer like", value, "bkiWriter");
            return (Criteria) this;
        }

        public Criteria andBkiWriterNotLike(String value) {
            addCriterion("bki_writer not like", value, "bkiWriter");
            return (Criteria) this;
        }

        public Criteria andBkiWriterIn(List<String> values) {
            addCriterion("bki_writer in", values, "bkiWriter");
            return (Criteria) this;
        }

        public Criteria andBkiWriterNotIn(List<String> values) {
            addCriterion("bki_writer not in", values, "bkiWriter");
            return (Criteria) this;
        }

        public Criteria andBkiWriterBetween(String value1, String value2) {
            addCriterion("bki_writer between", value1, value2, "bkiWriter");
            return (Criteria) this;
        }

        public Criteria andBkiWriterNotBetween(String value1, String value2) {
            addCriterion("bki_writer not between", value1, value2, "bkiWriter");
            return (Criteria) this;
        }

        public Criteria andBkiConcernIsNull() {
            addCriterion("bki_concern is null");
            return (Criteria) this;
        }

        public Criteria andBkiConcernIsNotNull() {
            addCriterion("bki_concern is not null");
            return (Criteria) this;
        }

        public Criteria andBkiConcernEqualTo(String value) {
            addCriterion("bki_concern =", value, "bkiConcern");
            return (Criteria) this;
        }

        public Criteria andBkiConcernNotEqualTo(String value) {
            addCriterion("bki_concern <>", value, "bkiConcern");
            return (Criteria) this;
        }

        public Criteria andBkiConcernGreaterThan(String value) {
            addCriterion("bki_concern >", value, "bkiConcern");
            return (Criteria) this;
        }

        public Criteria andBkiConcernGreaterThanOrEqualTo(String value) {
            addCriterion("bki_concern >=", value, "bkiConcern");
            return (Criteria) this;
        }

        public Criteria andBkiConcernLessThan(String value) {
            addCriterion("bki_concern <", value, "bkiConcern");
            return (Criteria) this;
        }

        public Criteria andBkiConcernLessThanOrEqualTo(String value) {
            addCriterion("bki_concern <=", value, "bkiConcern");
            return (Criteria) this;
        }

        public Criteria andBkiConcernLike(String value) {
            addCriterion("bki_concern like", value, "bkiConcern");
            return (Criteria) this;
        }

        public Criteria andBkiConcernNotLike(String value) {
            addCriterion("bki_concern not like", value, "bkiConcern");
            return (Criteria) this;
        }

        public Criteria andBkiConcernIn(List<String> values) {
            addCriterion("bki_concern in", values, "bkiConcern");
            return (Criteria) this;
        }

        public Criteria andBkiConcernNotIn(List<String> values) {
            addCriterion("bki_concern not in", values, "bkiConcern");
            return (Criteria) this;
        }

        public Criteria andBkiConcernBetween(String value1, String value2) {
            addCriterion("bki_concern between", value1, value2, "bkiConcern");
            return (Criteria) this;
        }

        public Criteria andBkiConcernNotBetween(String value1, String value2) {
            addCriterion("bki_concern not between", value1, value2, "bkiConcern");
            return (Criteria) this;
        }

        public Criteria andBkiPublishDateIsNull() {
            addCriterion("bki_publish_date is null");
            return (Criteria) this;
        }

        public Criteria andBkiPublishDateIsNotNull() {
            addCriterion("bki_publish_date is not null");
            return (Criteria) this;
        }

        public Criteria andBkiPublishDateEqualTo(Date value) {
            addCriterion("bki_publish_date =", value, "bkiPublishDate");
            return (Criteria) this;
        }

        public Criteria andBkiPublishDateNotEqualTo(Date value) {
            addCriterion("bki_publish_date <>", value, "bkiPublishDate");
            return (Criteria) this;
        }

        public Criteria andBkiPublishDateGreaterThan(Date value) {
            addCriterion("bki_publish_date >", value, "bkiPublishDate");
            return (Criteria) this;
        }

        public Criteria andBkiPublishDateGreaterThanOrEqualTo(Date value) {
            addCriterion("bki_publish_date >=", value, "bkiPublishDate");
            return (Criteria) this;
        }

        public Criteria andBkiPublishDateLessThan(Date value) {
            addCriterion("bki_publish_date <", value, "bkiPublishDate");
            return (Criteria) this;
        }

        public Criteria andBkiPublishDateLessThanOrEqualTo(Date value) {
            addCriterion("bki_publish_date <=", value, "bkiPublishDate");
            return (Criteria) this;
        }

        public Criteria andBkiPublishDateIn(List<Date> values) {
            addCriterion("bki_publish_date in", values, "bkiPublishDate");
            return (Criteria) this;
        }

        public Criteria andBkiPublishDateNotIn(List<Date> values) {
            addCriterion("bki_publish_date not in", values, "bkiPublishDate");
            return (Criteria) this;
        }

        public Criteria andBkiPublishDateBetween(Date value1, Date value2) {
            addCriterion("bki_publish_date between", value1, value2, "bkiPublishDate");
            return (Criteria) this;
        }

        public Criteria andBkiPublishDateNotBetween(Date value1, Date value2) {
            addCriterion("bki_publish_date not between", value1, value2, "bkiPublishDate");
            return (Criteria) this;
        }

        public Criteria andBkiPriceIsNull() {
            addCriterion("bki_price is null");
            return (Criteria) this;
        }

        public Criteria andBkiPriceIsNotNull() {
            addCriterion("bki_price is not null");
            return (Criteria) this;
        }

        public Criteria andBkiPriceEqualTo(Double value) {
            addCriterion("bki_price =", value, "bkiPrice");
            return (Criteria) this;
        }

        public Criteria andBkiPriceNotEqualTo(Double value) {
            addCriterion("bki_price <>", value, "bkiPrice");
            return (Criteria) this;
        }

        public Criteria andBkiPriceGreaterThan(Double value) {
            addCriterion("bki_price >", value, "bkiPrice");
            return (Criteria) this;
        }

        public Criteria andBkiPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("bki_price >=", value, "bkiPrice");
            return (Criteria) this;
        }

        public Criteria andBkiPriceLessThan(Double value) {
            addCriterion("bki_price <", value, "bkiPrice");
            return (Criteria) this;
        }

        public Criteria andBkiPriceLessThanOrEqualTo(Double value) {
            addCriterion("bki_price <=", value, "bkiPrice");
            return (Criteria) this;
        }

        public Criteria andBkiPriceIn(List<Double> values) {
            addCriterion("bki_price in", values, "bkiPrice");
            return (Criteria) this;
        }

        public Criteria andBkiPriceNotIn(List<Double> values) {
            addCriterion("bki_price not in", values, "bkiPrice");
            return (Criteria) this;
        }

        public Criteria andBkiPriceBetween(Double value1, Double value2) {
            addCriterion("bki_price between", value1, value2, "bkiPrice");
            return (Criteria) this;
        }

        public Criteria andBkiPriceNotBetween(Double value1, Double value2) {
            addCriterion("bki_price not between", value1, value2, "bkiPrice");
            return (Criteria) this;
        }

        public Criteria andBkiRegisterDateIsNull() {
            addCriterion("bki_register_date is null");
            return (Criteria) this;
        }

        public Criteria andBkiRegisterDateIsNotNull() {
            addCriterion("bki_register_date is not null");
            return (Criteria) this;
        }

        public Criteria andBkiRegisterDateEqualTo(Date value) {
            addCriterion("bki_register_date =", value, "bkiRegisterDate");
            return (Criteria) this;
        }

        public Criteria andBkiRegisterDateNotEqualTo(Date value) {
            addCriterion("bki_register_date <>", value, "bkiRegisterDate");
            return (Criteria) this;
        }

        public Criteria andBkiRegisterDateGreaterThan(Date value) {
            addCriterion("bki_register_date >", value, "bkiRegisterDate");
            return (Criteria) this;
        }

        public Criteria andBkiRegisterDateGreaterThanOrEqualTo(Date value) {
            addCriterion("bki_register_date >=", value, "bkiRegisterDate");
            return (Criteria) this;
        }

        public Criteria andBkiRegisterDateLessThan(Date value) {
            addCriterion("bki_register_date <", value, "bkiRegisterDate");
            return (Criteria) this;
        }

        public Criteria andBkiRegisterDateLessThanOrEqualTo(Date value) {
            addCriterion("bki_register_date <=", value, "bkiRegisterDate");
            return (Criteria) this;
        }

        public Criteria andBkiRegisterDateIn(List<Date> values) {
            addCriterion("bki_register_date in", values, "bkiRegisterDate");
            return (Criteria) this;
        }

        public Criteria andBkiRegisterDateNotIn(List<Date> values) {
            addCriterion("bki_register_date not in", values, "bkiRegisterDate");
            return (Criteria) this;
        }

        public Criteria andBkiRegisterDateBetween(Date value1, Date value2) {
            addCriterion("bki_register_date between", value1, value2, "bkiRegisterDate");
            return (Criteria) this;
        }

        public Criteria andBkiRegisterDateNotBetween(Date value1, Date value2) {
            addCriterion("bki_register_date not between", value1, value2, "bkiRegisterDate");
            return (Criteria) this;
        }

        public Criteria andBkiCountIsNull() {
            addCriterion("bki_count is null");
            return (Criteria) this;
        }

        public Criteria andBkiCountIsNotNull() {
            addCriterion("bki_count is not null");
            return (Criteria) this;
        }

        public Criteria andBkiCountEqualTo(Integer value) {
            addCriterion("bki_count =", value, "bkiCount");
            return (Criteria) this;
        }

        public Criteria andBkiCountNotEqualTo(Integer value) {
            addCriterion("bki_count <>", value, "bkiCount");
            return (Criteria) this;
        }

        public Criteria andBkiCountGreaterThan(Integer value) {
            addCriterion("bki_count >", value, "bkiCount");
            return (Criteria) this;
        }

        public Criteria andBkiCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("bki_count >=", value, "bkiCount");
            return (Criteria) this;
        }

        public Criteria andBkiCountLessThan(Integer value) {
            addCriterion("bki_count <", value, "bkiCount");
            return (Criteria) this;
        }

        public Criteria andBkiCountLessThanOrEqualTo(Integer value) {
            addCriterion("bki_count <=", value, "bkiCount");
            return (Criteria) this;
        }

        public Criteria andBkiCountIn(List<Integer> values) {
            addCriterion("bki_count in", values, "bkiCount");
            return (Criteria) this;
        }

        public Criteria andBkiCountNotIn(List<Integer> values) {
            addCriterion("bki_count not in", values, "bkiCount");
            return (Criteria) this;
        }

        public Criteria andBkiCountBetween(Integer value1, Integer value2) {
            addCriterion("bki_count between", value1, value2, "bkiCount");
            return (Criteria) this;
        }

        public Criteria andBkiCountNotBetween(Integer value1, Integer value2) {
            addCriterion("bki_count not between", value1, value2, "bkiCount");
            return (Criteria) this;
        }

        public Criteria andBkiCzyIsNull() {
            addCriterion("bki_czy is null");
            return (Criteria) this;
        }

        public Criteria andBkiCzyIsNotNull() {
            addCriterion("bki_czy is not null");
            return (Criteria) this;
        }

        public Criteria andBkiCzyEqualTo(String value) {
            addCriterion("bki_czy =", value, "bkiCzy");
            return (Criteria) this;
        }

        public Criteria andBkiCzyNotEqualTo(String value) {
            addCriterion("bki_czy <>", value, "bkiCzy");
            return (Criteria) this;
        }

        public Criteria andBkiCzyGreaterThan(String value) {
            addCriterion("bki_czy >", value, "bkiCzy");
            return (Criteria) this;
        }

        public Criteria andBkiCzyGreaterThanOrEqualTo(String value) {
            addCriterion("bki_czy >=", value, "bkiCzy");
            return (Criteria) this;
        }

        public Criteria andBkiCzyLessThan(String value) {
            addCriterion("bki_czy <", value, "bkiCzy");
            return (Criteria) this;
        }

        public Criteria andBkiCzyLessThanOrEqualTo(String value) {
            addCriterion("bki_czy <=", value, "bkiCzy");
            return (Criteria) this;
        }

        public Criteria andBkiCzyLike(String value) {
            addCriterion("bki_czy like", value, "bkiCzy");
            return (Criteria) this;
        }

        public Criteria andBkiCzyNotLike(String value) {
            addCriterion("bki_czy not like", value, "bkiCzy");
            return (Criteria) this;
        }

        public Criteria andBkiCzyIn(List<String> values) {
            addCriterion("bki_czy in", values, "bkiCzy");
            return (Criteria) this;
        }

        public Criteria andBkiCzyNotIn(List<String> values) {
            addCriterion("bki_czy not in", values, "bkiCzy");
            return (Criteria) this;
        }

        public Criteria andBkiCzyBetween(String value1, String value2) {
            addCriterion("bki_czy between", value1, value2, "bkiCzy");
            return (Criteria) this;
        }

        public Criteria andBkiCzyNotBetween(String value1, String value2) {
            addCriterion("bki_czy not between", value1, value2, "bkiCzy");
            return (Criteria) this;
        }

        public Criteria andBkiRemarkIsNull() {
            addCriterion("bki_remark is null");
            return (Criteria) this;
        }

        public Criteria andBkiRemarkIsNotNull() {
            addCriterion("bki_remark is not null");
            return (Criteria) this;
        }

        public Criteria andBkiRemarkEqualTo(String value) {
            addCriterion("bki_remark =", value, "bkiRemark");
            return (Criteria) this;
        }

        public Criteria andBkiRemarkNotEqualTo(String value) {
            addCriterion("bki_remark <>", value, "bkiRemark");
            return (Criteria) this;
        }

        public Criteria andBkiRemarkGreaterThan(String value) {
            addCriterion("bki_remark >", value, "bkiRemark");
            return (Criteria) this;
        }

        public Criteria andBkiRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("bki_remark >=", value, "bkiRemark");
            return (Criteria) this;
        }

        public Criteria andBkiRemarkLessThan(String value) {
            addCriterion("bki_remark <", value, "bkiRemark");
            return (Criteria) this;
        }

        public Criteria andBkiRemarkLessThanOrEqualTo(String value) {
            addCriterion("bki_remark <=", value, "bkiRemark");
            return (Criteria) this;
        }

        public Criteria andBkiRemarkLike(String value) {
            addCriterion("bki_remark like", value, "bkiRemark");
            return (Criteria) this;
        }

        public Criteria andBkiRemarkNotLike(String value) {
            addCriterion("bki_remark not like", value, "bkiRemark");
            return (Criteria) this;
        }

        public Criteria andBkiRemarkIn(List<String> values) {
            addCriterion("bki_remark in", values, "bkiRemark");
            return (Criteria) this;
        }

        public Criteria andBkiRemarkNotIn(List<String> values) {
            addCriterion("bki_remark not in", values, "bkiRemark");
            return (Criteria) this;
        }

        public Criteria andBkiRemarkBetween(String value1, String value2) {
            addCriterion("bki_remark between", value1, value2, "bkiRemark");
            return (Criteria) this;
        }

        public Criteria andBkiRemarkNotBetween(String value1, String value2) {
            addCriterion("bki_remark not between", value1, value2, "bkiRemark");
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