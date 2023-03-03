package com.lvcong.emprise.bean;

import java.math.BigDecimal;
import java.util.Date;

public class TravelTours {
    private Integer toursId;

    private BigDecimal toursPrice;

    private BigDecimal toursDiscount;

    private Date toursBegin;

    private Date toursEnd;

    private Integer toursCount;

    private Integer toursTime;

    private String toursOther;

    private String toursDetail;

    private String toursName;

    public Integer getToursId() {
        return toursId;
    }

    public void setToursId(Integer toursId) {
        this.toursId = toursId;
    }

    public BigDecimal getToursPrice() {
        return toursPrice;
    }

    public void setToursPrice(BigDecimal toursPrice) {
        this.toursPrice = toursPrice;
    }

    public BigDecimal getToursDiscount() {
        return toursDiscount;
    }

    public void setToursDiscount(BigDecimal toursDiscount) {
        this.toursDiscount = toursDiscount;
    }

    public Date getToursBegin() {
        return toursBegin;
    }

    public void setToursBegin(Date toursBegin) {
        this.toursBegin = toursBegin;
    }

    public Date getToursEnd() {
        return toursEnd;
    }

    public void setToursEnd(Date toursEnd) {
        this.toursEnd = toursEnd;
    }

    public Integer getToursCount() {
        return toursCount;
    }

    public void setToursCount(Integer toursCount) {
        this.toursCount = toursCount;
    }

    public Integer getToursTime() {
        return toursTime;
    }

    public void setToursTime(Integer toursTime) {
        this.toursTime = toursTime;
    }

    public String getToursOther() {
        return toursOther;
    }

    public void setToursOther(String toursOther) {
        this.toursOther = toursOther == null ? null : toursOther.trim();
    }

    public String getToursDetail() {
        return toursDetail;
    }

    public void setToursDetail(String toursDetail) {
        this.toursDetail = toursDetail == null ? null : toursDetail.trim();
    }

    public String getToursName() {
        return toursName;
    }

    public void setToursName(String toursName) {
        this.toursName = toursName == null ? null : toursName.trim();
    }
}