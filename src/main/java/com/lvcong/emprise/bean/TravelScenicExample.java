package com.lvcong.emprise.bean;

import java.util.ArrayList;
import java.util.List;

public class TravelScenicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TravelScenicExample() {
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

        public Criteria andScenicIdIsNull() {
            addCriterion("scenic_id is null");
            return (Criteria) this;
        }

        public Criteria andScenicIdIsNotNull() {
            addCriterion("scenic_id is not null");
            return (Criteria) this;
        }

        public Criteria andScenicIdEqualTo(Integer value) {
            addCriterion("scenic_id =", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdNotEqualTo(Integer value) {
            addCriterion("scenic_id <>", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdGreaterThan(Integer value) {
            addCriterion("scenic_id >", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("scenic_id >=", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdLessThan(Integer value) {
            addCriterion("scenic_id <", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdLessThanOrEqualTo(Integer value) {
            addCriterion("scenic_id <=", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdIn(List<Integer> values) {
            addCriterion("scenic_id in", values, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdNotIn(List<Integer> values) {
            addCriterion("scenic_id not in", values, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdBetween(Integer value1, Integer value2) {
            addCriterion("scenic_id between", value1, value2, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdNotBetween(Integer value1, Integer value2) {
            addCriterion("scenic_id not between", value1, value2, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicDetailsIsNull() {
            addCriterion("scenic_details is null");
            return (Criteria) this;
        }

        public Criteria andScenicDetailsIsNotNull() {
            addCriterion("scenic_details is not null");
            return (Criteria) this;
        }

        public Criteria andScenicDetailsEqualTo(Integer value) {
            addCriterion("scenic_details =", value, "scenicDetails");
            return (Criteria) this;
        }

        public Criteria andScenicDetailsNotEqualTo(Integer value) {
            addCriterion("scenic_details <>", value, "scenicDetails");
            return (Criteria) this;
        }

        public Criteria andScenicDetailsGreaterThan(Integer value) {
            addCriterion("scenic_details >", value, "scenicDetails");
            return (Criteria) this;
        }

        public Criteria andScenicDetailsGreaterThanOrEqualTo(Integer value) {
            addCriterion("scenic_details >=", value, "scenicDetails");
            return (Criteria) this;
        }

        public Criteria andScenicDetailsLessThan(Integer value) {
            addCriterion("scenic_details <", value, "scenicDetails");
            return (Criteria) this;
        }

        public Criteria andScenicDetailsLessThanOrEqualTo(Integer value) {
            addCriterion("scenic_details <=", value, "scenicDetails");
            return (Criteria) this;
        }

        public Criteria andScenicDetailsIn(List<Integer> values) {
            addCriterion("scenic_details in", values, "scenicDetails");
            return (Criteria) this;
        }

        public Criteria andScenicDetailsNotIn(List<Integer> values) {
            addCriterion("scenic_details not in", values, "scenicDetails");
            return (Criteria) this;
        }

        public Criteria andScenicDetailsBetween(Integer value1, Integer value2) {
            addCriterion("scenic_details between", value1, value2, "scenicDetails");
            return (Criteria) this;
        }

        public Criteria andScenicDetailsNotBetween(Integer value1, Integer value2) {
            addCriterion("scenic_details not between", value1, value2, "scenicDetails");
            return (Criteria) this;
        }

        public Criteria andScenicUrlIsNull() {
            addCriterion("scenic_url is null");
            return (Criteria) this;
        }

        public Criteria andScenicUrlIsNotNull() {
            addCriterion("scenic_url is not null");
            return (Criteria) this;
        }

        public Criteria andScenicUrlEqualTo(String value) {
            addCriterion("scenic_url =", value, "scenicUrl");
            return (Criteria) this;
        }

        public Criteria andScenicUrlNotEqualTo(String value) {
            addCriterion("scenic_url <>", value, "scenicUrl");
            return (Criteria) this;
        }

        public Criteria andScenicUrlGreaterThan(String value) {
            addCriterion("scenic_url >", value, "scenicUrl");
            return (Criteria) this;
        }

        public Criteria andScenicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_url >=", value, "scenicUrl");
            return (Criteria) this;
        }

        public Criteria andScenicUrlLessThan(String value) {
            addCriterion("scenic_url <", value, "scenicUrl");
            return (Criteria) this;
        }

        public Criteria andScenicUrlLessThanOrEqualTo(String value) {
            addCriterion("scenic_url <=", value, "scenicUrl");
            return (Criteria) this;
        }

        public Criteria andScenicUrlLike(String value) {
            addCriterion("scenic_url like", value, "scenicUrl");
            return (Criteria) this;
        }

        public Criteria andScenicUrlNotLike(String value) {
            addCriterion("scenic_url not like", value, "scenicUrl");
            return (Criteria) this;
        }

        public Criteria andScenicUrlIn(List<String> values) {
            addCriterion("scenic_url in", values, "scenicUrl");
            return (Criteria) this;
        }

        public Criteria andScenicUrlNotIn(List<String> values) {
            addCriterion("scenic_url not in", values, "scenicUrl");
            return (Criteria) this;
        }

        public Criteria andScenicUrlBetween(String value1, String value2) {
            addCriterion("scenic_url between", value1, value2, "scenicUrl");
            return (Criteria) this;
        }

        public Criteria andScenicUrlNotBetween(String value1, String value2) {
            addCriterion("scenic_url not between", value1, value2, "scenicUrl");
            return (Criteria) this;
        }
    }

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