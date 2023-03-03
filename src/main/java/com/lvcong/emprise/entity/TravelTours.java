package com.lvcong.emprise.entity;

import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Date;

/**
 * (TravelTours)实体类
 *
 * @author makejava
 * @since 2023-03-02 18:04:24
 */
@Repository
public class TravelTours implements Serializable {
    private static final long serialVersionUID = -53828263702922531L;
    /**
     * 旅游项目id
     */
    private Integer toursId;
    /**
     * 标价
     */
    private Double toursPrice;
    /**
     * 折扣
     */
    private Double toursDiscount;
    /**
     * 开始时间
     */
    private Date toursBegin;
    /**
     * 结束时间
     */
    private Date toursEnd;
    /**
     * 最大报团人数
     */
    private Integer toursCount;
    /**
     * 整个旅行所需要的天数（整数）
     */
    private Integer toursTime;
    /**
     * 关于项目的其他补充
     */
    private String toursOther;
    /**
     * 项目的详情介绍
     */
    private String toursDetail;
    /**
     * 项目的名字
     */
    private String toursName;


    public Integer getToursId() {
        return toursId;
    }

    public void setToursId(Integer toursId) {
        this.toursId = toursId;
    }

    public Double getToursPrice() {
        return toursPrice;
    }

    public void setToursPrice(Double toursPrice) {
        this.toursPrice = toursPrice;
    }

    public Double getToursDiscount() {
        return toursDiscount;
    }

    public void setToursDiscount(Double toursDiscount) {
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
        this.toursOther = toursOther;
    }

    public String getToursDetail() {
        return toursDetail;
    }

    public void setToursDetail(String toursDetail) {
        this.toursDetail = toursDetail;
    }

    public String getToursName() {
        return toursName;
    }

    public void setToursName(String toursName) {
        this.toursName = toursName;
    }

}

