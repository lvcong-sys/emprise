package com.lvcong.emprise.entity;

import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * (TravelScenic)实体类
 *
 * @author makejava
 * @since 2023-03-02 18:04:19
 */
@Repository
public class TravelScenic implements Serializable {
    private static final long serialVersionUID = -30023273372889409L;
    /**
     * 景点id
     */
    private Integer scenicId;
    /**
     * 景点图片地址
     */
    private String scenicUrl;
    /**
     * 景点详情id，外键
     */
    private Integer scenicDetails;


    public Integer getScenicId() {
        return scenicId;
    }

    public void setScenicId(Integer scenicId) {
        this.scenicId = scenicId;
    }

    public String getScenicUrl() {
        return scenicUrl;
    }

    public void setScenicUrl(String scenicUrl) {
        this.scenicUrl = scenicUrl;
    }

    public Integer getScenicDetails() {
        return scenicDetails;
    }

    public void setScenicDetails(Integer scenicDetails) {
        this.scenicDetails = scenicDetails;
    }

}

