package com.lvcong.emprise.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TravelToursExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TravelToursExample() {
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

        public Criteria andToursIdIsNull() {
            addCriterion("tours_id is null");
            return (Criteria) this;
        }

        public Criteria andToursIdIsNotNull() {
            addCriterion("tours_id is not null");
            return (Criteria) this;
        }

        public Criteria andToursIdEqualTo(Integer value) {
            addCriterion("tours_id =", value, "toursId");
            return (Criteria) this;
        }

        public Criteria andToursIdNotEqualTo(Integer value) {
            addCriterion("tours_id <>", value, "toursId");
            return (Criteria) this;
        }

        public Criteria andToursIdGreaterThan(Integer value) {
            addCriterion("tours_id >", value, "toursId");
            return (Criteria) this;
        }

        public Criteria andToursIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tours_id >=", value, "toursId");
            return (Criteria) this;
        }

        public Criteria andToursIdLessThan(Integer value) {
            addCriterion("tours_id <", value, "toursId");
            return (Criteria) this;
        }

        public Criteria andToursIdLessThanOrEqualTo(Integer value) {
            addCriterion("tours_id <=", value, "toursId");
            return (Criteria) this;
        }

        public Criteria andToursIdIn(List<Integer> values) {
            addCriterion("tours_id in", values, "toursId");
            return (Criteria) this;
        }

        public Criteria andToursIdNotIn(List<Integer> values) {
            addCriterion("tours_id not in", values, "toursId");
            return (Criteria) this;
        }

        public Criteria andToursIdBetween(Integer value1, Integer value2) {
            addCriterion("tours_id between", value1, value2, "toursId");
            return (Criteria) this;
        }

        public Criteria andToursIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tours_id not between", value1, value2, "toursId");
            return (Criteria) this;
        }

        public Criteria andToursPriceIsNull() {
            addCriterion("tours_price is null");
            return (Criteria) this;
        }

        public Criteria andToursPriceIsNotNull() {
            addCriterion("tours_price is not null");
            return (Criteria) this;
        }

        public Criteria andToursPriceEqualTo(BigDecimal value) {
            addCriterion("tours_price =", value, "toursPrice");
            return (Criteria) this;
        }

        public Criteria andToursPriceNotEqualTo(BigDecimal value) {
            addCriterion("tours_price <>", value, "toursPrice");
            return (Criteria) this;
        }

        public Criteria andToursPriceGreaterThan(BigDecimal value) {
            addCriterion("tours_price >", value, "toursPrice");
            return (Criteria) this;
        }

        public Criteria andToursPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tours_price >=", value, "toursPrice");
            return (Criteria) this;
        }

        public Criteria andToursPriceLessThan(BigDecimal value) {
            addCriterion("tours_price <", value, "toursPrice");
            return (Criteria) this;
        }

        public Criteria andToursPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tours_price <=", value, "toursPrice");
            return (Criteria) this;
        }

        public Criteria andToursPriceIn(List<BigDecimal> values) {
            addCriterion("tours_price in", values, "toursPrice");
            return (Criteria) this;
        }

        public Criteria andToursPriceNotIn(List<BigDecimal> values) {
            addCriterion("tours_price not in", values, "toursPrice");
            return (Criteria) this;
        }

        public Criteria andToursPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tours_price between", value1, value2, "toursPrice");
            return (Criteria) this;
        }

        public Criteria andToursPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tours_price not between", value1, value2, "toursPrice");
            return (Criteria) this;
        }

        public Criteria andToursDiscountIsNull() {
            addCriterion("tours_discount is null");
            return (Criteria) this;
        }

        public Criteria andToursDiscountIsNotNull() {
            addCriterion("tours_discount is not null");
            return (Criteria) this;
        }

        public Criteria andToursDiscountEqualTo(BigDecimal value) {
            addCriterion("tours_discount =", value, "toursDiscount");
            return (Criteria) this;
        }

        public Criteria andToursDiscountNotEqualTo(BigDecimal value) {
            addCriterion("tours_discount <>", value, "toursDiscount");
            return (Criteria) this;
        }

        public Criteria andToursDiscountGreaterThan(BigDecimal value) {
            addCriterion("tours_discount >", value, "toursDiscount");
            return (Criteria) this;
        }

        public Criteria andToursDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tours_discount >=", value, "toursDiscount");
            return (Criteria) this;
        }

        public Criteria andToursDiscountLessThan(BigDecimal value) {
            addCriterion("tours_discount <", value, "toursDiscount");
            return (Criteria) this;
        }

        public Criteria andToursDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tours_discount <=", value, "toursDiscount");
            return (Criteria) this;
        }

        public Criteria andToursDiscountIn(List<BigDecimal> values) {
            addCriterion("tours_discount in", values, "toursDiscount");
            return (Criteria) this;
        }

        public Criteria andToursDiscountNotIn(List<BigDecimal> values) {
            addCriterion("tours_discount not in", values, "toursDiscount");
            return (Criteria) this;
        }

        public Criteria andToursDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tours_discount between", value1, value2, "toursDiscount");
            return (Criteria) this;
        }

        public Criteria andToursDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tours_discount not between", value1, value2, "toursDiscount");
            return (Criteria) this;
        }

        public Criteria andToursBeginIsNull() {
            addCriterion("tours_begin is null");
            return (Criteria) this;
        }

        public Criteria andToursBeginIsNotNull() {
            addCriterion("tours_begin is not null");
            return (Criteria) this;
        }

        public Criteria andToursBeginEqualTo(Date value) {
            addCriterion("tours_begin =", value, "toursBegin");
            return (Criteria) this;
        }

        public Criteria andToursBeginNotEqualTo(Date value) {
            addCriterion("tours_begin <>", value, "toursBegin");
            return (Criteria) this;
        }

        public Criteria andToursBeginGreaterThan(Date value) {
            addCriterion("tours_begin >", value, "toursBegin");
            return (Criteria) this;
        }

        public Criteria andToursBeginGreaterThanOrEqualTo(Date value) {
            addCriterion("tours_begin >=", value, "toursBegin");
            return (Criteria) this;
        }

        public Criteria andToursBeginLessThan(Date value) {
            addCriterion("tours_begin <", value, "toursBegin");
            return (Criteria) this;
        }

        public Criteria andToursBeginLessThanOrEqualTo(Date value) {
            addCriterion("tours_begin <=", value, "toursBegin");
            return (Criteria) this;
        }

        public Criteria andToursBeginIn(List<Date> values) {
            addCriterion("tours_begin in", values, "toursBegin");
            return (Criteria) this;
        }

        public Criteria andToursBeginNotIn(List<Date> values) {
            addCriterion("tours_begin not in", values, "toursBegin");
            return (Criteria) this;
        }

        public Criteria andToursBeginBetween(Date value1, Date value2) {
            addCriterion("tours_begin between", value1, value2, "toursBegin");
            return (Criteria) this;
        }

        public Criteria andToursBeginNotBetween(Date value1, Date value2) {
            addCriterion("tours_begin not between", value1, value2, "toursBegin");
            return (Criteria) this;
        }

        public Criteria andToursEndIsNull() {
            addCriterion("tours_end is null");
            return (Criteria) this;
        }

        public Criteria andToursEndIsNotNull() {
            addCriterion("tours_end is not null");
            return (Criteria) this;
        }

        public Criteria andToursEndEqualTo(Date value) {
            addCriterion("tours_end =", value, "toursEnd");
            return (Criteria) this;
        }

        public Criteria andToursEndNotEqualTo(Date value) {
            addCriterion("tours_end <>", value, "toursEnd");
            return (Criteria) this;
        }

        public Criteria andToursEndGreaterThan(Date value) {
            addCriterion("tours_end >", value, "toursEnd");
            return (Criteria) this;
        }

        public Criteria andToursEndGreaterThanOrEqualTo(Date value) {
            addCriterion("tours_end >=", value, "toursEnd");
            return (Criteria) this;
        }

        public Criteria andToursEndLessThan(Date value) {
            addCriterion("tours_end <", value, "toursEnd");
            return (Criteria) this;
        }

        public Criteria andToursEndLessThanOrEqualTo(Date value) {
            addCriterion("tours_end <=", value, "toursEnd");
            return (Criteria) this;
        }

        public Criteria andToursEndIn(List<Date> values) {
            addCriterion("tours_end in", values, "toursEnd");
            return (Criteria) this;
        }

        public Criteria andToursEndNotIn(List<Date> values) {
            addCriterion("tours_end not in", values, "toursEnd");
            return (Criteria) this;
        }

        public Criteria andToursEndBetween(Date value1, Date value2) {
            addCriterion("tours_end between", value1, value2, "toursEnd");
            return (Criteria) this;
        }

        public Criteria andToursEndNotBetween(Date value1, Date value2) {
            addCriterion("tours_end not between", value1, value2, "toursEnd");
            return (Criteria) this;
        }

        public Criteria andToursCountIsNull() {
            addCriterion("tours_count is null");
            return (Criteria) this;
        }

        public Criteria andToursCountIsNotNull() {
            addCriterion("tours_count is not null");
            return (Criteria) this;
        }

        public Criteria andToursCountEqualTo(Integer value) {
            addCriterion("tours_count =", value, "toursCount");
            return (Criteria) this;
        }

        public Criteria andToursCountNotEqualTo(Integer value) {
            addCriterion("tours_count <>", value, "toursCount");
            return (Criteria) this;
        }

        public Criteria andToursCountGreaterThan(Integer value) {
            addCriterion("tours_count >", value, "toursCount");
            return (Criteria) this;
        }

        public Criteria andToursCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("tours_count >=", value, "toursCount");
            return (Criteria) this;
        }

        public Criteria andToursCountLessThan(Integer value) {
            addCriterion("tours_count <", value, "toursCount");
            return (Criteria) this;
        }

        public Criteria andToursCountLessThanOrEqualTo(Integer value) {
            addCriterion("tours_count <=", value, "toursCount");
            return (Criteria) this;
        }

        public Criteria andToursCountIn(List<Integer> values) {
            addCriterion("tours_count in", values, "toursCount");
            return (Criteria) this;
        }

        public Criteria andToursCountNotIn(List<Integer> values) {
            addCriterion("tours_count not in", values, "toursCount");
            return (Criteria) this;
        }

        public Criteria andToursCountBetween(Integer value1, Integer value2) {
            addCriterion("tours_count between", value1, value2, "toursCount");
            return (Criteria) this;
        }

        public Criteria andToursCountNotBetween(Integer value1, Integer value2) {
            addCriterion("tours_count not between", value1, value2, "toursCount");
            return (Criteria) this;
        }

        public Criteria andToursTimeIsNull() {
            addCriterion("tours_time is null");
            return (Criteria) this;
        }

        public Criteria andToursTimeIsNotNull() {
            addCriterion("tours_time is not null");
            return (Criteria) this;
        }

        public Criteria andToursTimeEqualTo(Integer value) {
            addCriterion("tours_time =", value, "toursTime");
            return (Criteria) this;
        }

        public Criteria andToursTimeNotEqualTo(Integer value) {
            addCriterion("tours_time <>", value, "toursTime");
            return (Criteria) this;
        }

        public Criteria andToursTimeGreaterThan(Integer value) {
            addCriterion("tours_time >", value, "toursTime");
            return (Criteria) this;
        }

        public Criteria andToursTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("tours_time >=", value, "toursTime");
            return (Criteria) this;
        }

        public Criteria andToursTimeLessThan(Integer value) {
            addCriterion("tours_time <", value, "toursTime");
            return (Criteria) this;
        }

        public Criteria andToursTimeLessThanOrEqualTo(Integer value) {
            addCriterion("tours_time <=", value, "toursTime");
            return (Criteria) this;
        }

        public Criteria andToursTimeIn(List<Integer> values) {
            addCriterion("tours_time in", values, "toursTime");
            return (Criteria) this;
        }

        public Criteria andToursTimeNotIn(List<Integer> values) {
            addCriterion("tours_time not in", values, "toursTime");
            return (Criteria) this;
        }

        public Criteria andToursTimeBetween(Integer value1, Integer value2) {
            addCriterion("tours_time between", value1, value2, "toursTime");
            return (Criteria) this;
        }

        public Criteria andToursTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("tours_time not between", value1, value2, "toursTime");
            return (Criteria) this;
        }

        public Criteria andToursOtherIsNull() {
            addCriterion("tours_other is null");
            return (Criteria) this;
        }

        public Criteria andToursOtherIsNotNull() {
            addCriterion("tours_other is not null");
            return (Criteria) this;
        }

        public Criteria andToursOtherEqualTo(String value) {
            addCriterion("tours_other =", value, "toursOther");
            return (Criteria) this;
        }

        public Criteria andToursOtherNotEqualTo(String value) {
            addCriterion("tours_other <>", value, "toursOther");
            return (Criteria) this;
        }

        public Criteria andToursOtherGreaterThan(String value) {
            addCriterion("tours_other >", value, "toursOther");
            return (Criteria) this;
        }

        public Criteria andToursOtherGreaterThanOrEqualTo(String value) {
            addCriterion("tours_other >=", value, "toursOther");
            return (Criteria) this;
        }

        public Criteria andToursOtherLessThan(String value) {
            addCriterion("tours_other <", value, "toursOther");
            return (Criteria) this;
        }

        public Criteria andToursOtherLessThanOrEqualTo(String value) {
            addCriterion("tours_other <=", value, "toursOther");
            return (Criteria) this;
        }

        public Criteria andToursOtherLike(String value) {
            addCriterion("tours_other like", value, "toursOther");
            return (Criteria) this;
        }

        public Criteria andToursOtherNotLike(String value) {
            addCriterion("tours_other not like", value, "toursOther");
            return (Criteria) this;
        }

        public Criteria andToursOtherIn(List<String> values) {
            addCriterion("tours_other in", values, "toursOther");
            return (Criteria) this;
        }

        public Criteria andToursOtherNotIn(List<String> values) {
            addCriterion("tours_other not in", values, "toursOther");
            return (Criteria) this;
        }

        public Criteria andToursOtherBetween(String value1, String value2) {
            addCriterion("tours_other between", value1, value2, "toursOther");
            return (Criteria) this;
        }

        public Criteria andToursOtherNotBetween(String value1, String value2) {
            addCriterion("tours_other not between", value1, value2, "toursOther");
            return (Criteria) this;
        }

        public Criteria andToursDetailIsNull() {
            addCriterion("tours_detail is null");
            return (Criteria) this;
        }

        public Criteria andToursDetailIsNotNull() {
            addCriterion("tours_detail is not null");
            return (Criteria) this;
        }

        public Criteria andToursDetailEqualTo(String value) {
            addCriterion("tours_detail =", value, "toursDetail");
            return (Criteria) this;
        }

        public Criteria andToursDetailNotEqualTo(String value) {
            addCriterion("tours_detail <>", value, "toursDetail");
            return (Criteria) this;
        }

        public Criteria andToursDetailGreaterThan(String value) {
            addCriterion("tours_detail >", value, "toursDetail");
            return (Criteria) this;
        }

        public Criteria andToursDetailGreaterThanOrEqualTo(String value) {
            addCriterion("tours_detail >=", value, "toursDetail");
            return (Criteria) this;
        }

        public Criteria andToursDetailLessThan(String value) {
            addCriterion("tours_detail <", value, "toursDetail");
            return (Criteria) this;
        }

        public Criteria andToursDetailLessThanOrEqualTo(String value) {
            addCriterion("tours_detail <=", value, "toursDetail");
            return (Criteria) this;
        }

        public Criteria andToursDetailLike(String value) {
            addCriterion("tours_detail like", value, "toursDetail");
            return (Criteria) this;
        }

        public Criteria andToursDetailNotLike(String value) {
            addCriterion("tours_detail not like", value, "toursDetail");
            return (Criteria) this;
        }

        public Criteria andToursDetailIn(List<String> values) {
            addCriterion("tours_detail in", values, "toursDetail");
            return (Criteria) this;
        }

        public Criteria andToursDetailNotIn(List<String> values) {
            addCriterion("tours_detail not in", values, "toursDetail");
            return (Criteria) this;
        }

        public Criteria andToursDetailBetween(String value1, String value2) {
            addCriterion("tours_detail between", value1, value2, "toursDetail");
            return (Criteria) this;
        }

        public Criteria andToursDetailNotBetween(String value1, String value2) {
            addCriterion("tours_detail not between", value1, value2, "toursDetail");
            return (Criteria) this;
        }

        public Criteria andToursNameIsNull() {
            addCriterion("tours_name is null");
            return (Criteria) this;
        }

        public Criteria andToursNameIsNotNull() {
            addCriterion("tours_name is not null");
            return (Criteria) this;
        }

        public Criteria andToursNameEqualTo(String value) {
            addCriterion("tours_name =", value, "toursName");
            return (Criteria) this;
        }

        public Criteria andToursNameNotEqualTo(String value) {
            addCriterion("tours_name <>", value, "toursName");
            return (Criteria) this;
        }

        public Criteria andToursNameGreaterThan(String value) {
            addCriterion("tours_name >", value, "toursName");
            return (Criteria) this;
        }

        public Criteria andToursNameGreaterThanOrEqualTo(String value) {
            addCriterion("tours_name >=", value, "toursName");
            return (Criteria) this;
        }

        public Criteria andToursNameLessThan(String value) {
            addCriterion("tours_name <", value, "toursName");
            return (Criteria) this;
        }

        public Criteria andToursNameLessThanOrEqualTo(String value) {
            addCriterion("tours_name <=", value, "toursName");
            return (Criteria) this;
        }

        public Criteria andToursNameLike(String value) {
            addCriterion("tours_name like", value, "toursName");
            return (Criteria) this;
        }

        public Criteria andToursNameNotLike(String value) {
            addCriterion("tours_name not like", value, "toursName");
            return (Criteria) this;
        }

        public Criteria andToursNameIn(List<String> values) {
            addCriterion("tours_name in", values, "toursName");
            return (Criteria) this;
        }

        public Criteria andToursNameNotIn(List<String> values) {
            addCriterion("tours_name not in", values, "toursName");
            return (Criteria) this;
        }

        public Criteria andToursNameBetween(String value1, String value2) {
            addCriterion("tours_name between", value1, value2, "toursName");
            return (Criteria) this;
        }

        public Criteria andToursNameNotBetween(String value1, String value2) {
            addCriterion("tours_name not between", value1, value2, "toursName");
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