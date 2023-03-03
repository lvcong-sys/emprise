package com.lvcong.emprise.entity;

import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * (TravelTag)实体类
 *
 * @author makejava
 * @since 2023-03-02 18:04:23
 */
@Repository
public class TravelTag implements Serializable {
    private static final long serialVersionUID = -58683685558844112L;
    
    private Integer tagId;
    
    private String tagName;


    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

}

