package com.lvcong.emprise.entity;

import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * (TravelCollect)实体类
 *
 * @author makejava
 * @since 2023-03-02 18:04:02
 */
@Repository
public class TravelCollect implements Serializable {
    private static final long serialVersionUID = 240452493358923322L;
    /**
     * 收藏对象（可以是游记也可以是景点）
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

