package com.lvcong.emprise.entity;

import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * (TravelLike)实体类
 *
 * @author makejava
 * @since 2023-03-02 18:04:11
 */
@Repository
public class TravelLike implements Serializable {
    private static final long serialVersionUID = -79454260633780179L;
    /**
     * 点赞对象（可以是游记、可以是评论）
     */
    private Integer id;
    /**
     * 执行对象
     */
    private Integer userId;


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

}

