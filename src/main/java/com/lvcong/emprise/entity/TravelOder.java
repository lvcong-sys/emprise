package com.lvcong.emprise.entity;

import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Date;

/**
 * (TravelOder)实体类
 *
 * @author makejava
 * @since 2023-03-02 18:04:25
 */
@Repository
public class TravelOder implements Serializable {
    private static final long serialVersionUID = -36467152424623409L;
    /**
     * 订单id
     */
    private Integer id;
    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 订单创建时间
     */
    private Date createTime;
    /**
     * 订单支付时间
     */
    private Date paymentTime;
    /**
     * 订单对应的项目，在订单页面可以现实出订单的需要结算金额
     */
    private Integer tourId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Integer getTourId() {
        return tourId;
    }

    public void setTourId(Integer tourId) {
        this.tourId = tourId;
    }

}

