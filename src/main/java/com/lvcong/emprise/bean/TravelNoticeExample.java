package com.lvcong.emprise.bean;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Repository
public class TravelNoticeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TravelNoticeExample() {
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

        public Criteria andNoticeIdIsNull() {
            addCriterion("notice_id is null");
            return (Criteria) this;
        }

        public Criteria andNoticeIdIsNotNull() {
            addCriterion("notice_id is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeIdEqualTo(Integer value) {
            addCriterion("notice_id =", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdNotEqualTo(Integer value) {
            addCriterion("notice_id <>", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdGreaterThan(Integer value) {
            addCriterion("notice_id >", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("notice_id >=", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdLessThan(Integer value) {
            addCriterion("notice_id <", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdLessThanOrEqualTo(Integer value) {
            addCriterion("notice_id <=", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdIn(List<Integer> values) {
            addCriterion("notice_id in", values, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdNotIn(List<Integer> values) {
            addCriterion("notice_id not in", values, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdBetween(Integer value1, Integer value2) {
            addCriterion("notice_id between", value1, value2, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("notice_id not between", value1, value2, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeImageurlIsNull() {
            addCriterion("notice_imageurl is null");
            return (Criteria) this;
        }

        public Criteria andNoticeImageurlIsNotNull() {
            addCriterion("notice_imageurl is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeImageurlEqualTo(String value) {
            addCriterion("notice_imageurl =", value, "noticeImageurl");
            return (Criteria) this;
        }

        public Criteria andNoticeImageurlNotEqualTo(String value) {
            addCriterion("notice_imageurl <>", value, "noticeImageurl");
            return (Criteria) this;
        }

        public Criteria andNoticeImageurlGreaterThan(String value) {
            addCriterion("notice_imageurl >", value, "noticeImageurl");
            return (Criteria) this;
        }

        public Criteria andNoticeImageurlGreaterThanOrEqualTo(String value) {
            addCriterion("notice_imageurl >=", value, "noticeImageurl");
            return (Criteria) this;
        }

        public Criteria andNoticeImageurlLessThan(String value) {
            addCriterion("notice_imageurl <", value, "noticeImageurl");
            return (Criteria) this;
        }

        public Criteria andNoticeImageurlLessThanOrEqualTo(String value) {
            addCriterion("notice_imageurl <=", value, "noticeImageurl");
            return (Criteria) this;
        }

        public Criteria andNoticeImageurlLike(String value) {
            addCriterion("notice_imageurl like", value, "noticeImageurl");
            return (Criteria) this;
        }

        public Criteria andNoticeImageurlNotLike(String value) {
            addCriterion("notice_imageurl not like", value, "noticeImageurl");
            return (Criteria) this;
        }

        public Criteria andNoticeImageurlIn(List<String> values) {
            addCriterion("notice_imageurl in", values, "noticeImageurl");
            return (Criteria) this;
        }

        public Criteria andNoticeImageurlNotIn(List<String> values) {
            addCriterion("notice_imageurl not in", values, "noticeImageurl");
            return (Criteria) this;
        }

        public Criteria andNoticeImageurlBetween(String value1, String value2) {
            addCriterion("notice_imageurl between", value1, value2, "noticeImageurl");
            return (Criteria) this;
        }

        public Criteria andNoticeImageurlNotBetween(String value1, String value2) {
            addCriterion("notice_imageurl not between", value1, value2, "noticeImageurl");
            return (Criteria) this;
        }

        public Criteria andNoticeContentIsNull() {
            addCriterion("notice_content is null");
            return (Criteria) this;
        }

        public Criteria andNoticeContentIsNotNull() {
            addCriterion("notice_content is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeContentEqualTo(String value) {
            addCriterion("notice_content =", value, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeContentNotEqualTo(String value) {
            addCriterion("notice_content <>", value, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeContentGreaterThan(String value) {
            addCriterion("notice_content >", value, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeContentGreaterThanOrEqualTo(String value) {
            addCriterion("notice_content >=", value, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeContentLessThan(String value) {
            addCriterion("notice_content <", value, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeContentLessThanOrEqualTo(String value) {
            addCriterion("notice_content <=", value, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeContentLike(String value) {
            addCriterion("notice_content like", value, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeContentNotLike(String value) {
            addCriterion("notice_content not like", value, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeContentIn(List<String> values) {
            addCriterion("notice_content in", values, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeContentNotIn(List<String> values) {
            addCriterion("notice_content not in", values, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeContentBetween(String value1, String value2) {
            addCriterion("notice_content between", value1, value2, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeContentNotBetween(String value1, String value2) {
            addCriterion("notice_content not between", value1, value2, "noticeContent");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeIsNull() {
            addCriterion("notice_time is null");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeIsNotNull() {
            addCriterion("notice_time is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeEqualTo(Date value) {
            addCriterion("notice_time =", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeNotEqualTo(Date value) {
            addCriterion("notice_time <>", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeGreaterThan(Date value) {
            addCriterion("notice_time >", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("notice_time >=", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeLessThan(Date value) {
            addCriterion("notice_time <", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeLessThanOrEqualTo(Date value) {
            addCriterion("notice_time <=", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeIn(List<Date> values) {
            addCriterion("notice_time in", values, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeNotIn(List<Date> values) {
            addCriterion("notice_time not in", values, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeBetween(Date value1, Date value2) {
            addCriterion("notice_time between", value1, value2, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeNotBetween(Date value1, Date value2) {
            addCriterion("notice_time not between", value1, value2, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticePlaceIsNull() {
            addCriterion("notice_place is null");
            return (Criteria) this;
        }

        public Criteria andNoticePlaceIsNotNull() {
            addCriterion("notice_place is not null");
            return (Criteria) this;
        }

        public Criteria andNoticePlaceEqualTo(String value) {
            addCriterion("notice_place =", value, "noticePlace");
            return (Criteria) this;
        }

        public Criteria andNoticePlaceNotEqualTo(String value) {
            addCriterion("notice_place <>", value, "noticePlace");
            return (Criteria) this;
        }

        public Criteria andNoticePlaceGreaterThan(String value) {
            addCriterion("notice_place >", value, "noticePlace");
            return (Criteria) this;
        }

        public Criteria andNoticePlaceGreaterThanOrEqualTo(String value) {
            addCriterion("notice_place >=", value, "noticePlace");
            return (Criteria) this;
        }

        public Criteria andNoticePlaceLessThan(String value) {
            addCriterion("notice_place <", value, "noticePlace");
            return (Criteria) this;
        }

        public Criteria andNoticePlaceLessThanOrEqualTo(String value) {
            addCriterion("notice_place <=", value, "noticePlace");
            return (Criteria) this;
        }

        public Criteria andNoticePlaceLike(String value) {
            addCriterion("notice_place like", value, "noticePlace");
            return (Criteria) this;
        }

        public Criteria andNoticePlaceNotLike(String value) {
            addCriterion("notice_place not like", value, "noticePlace");
            return (Criteria) this;
        }

        public Criteria andNoticePlaceIn(List<String> values) {
            addCriterion("notice_place in", values, "noticePlace");
            return (Criteria) this;
        }

        public Criteria andNoticePlaceNotIn(List<String> values) {
            addCriterion("notice_place not in", values, "noticePlace");
            return (Criteria) this;
        }

        public Criteria andNoticePlaceBetween(String value1, String value2) {
            addCriterion("notice_place between", value1, value2, "noticePlace");
            return (Criteria) this;
        }

        public Criteria andNoticePlaceNotBetween(String value1, String value2) {
            addCriterion("notice_place not between", value1, value2, "noticePlace");
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