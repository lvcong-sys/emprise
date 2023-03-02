package com.lvcong.emprise.bean;

import org.springframework.stereotype.Repository;

@Repository
public class TravelScenicKey {
    private Integer scenicId;

    private Integer scenicDetails;

    public Integer getScenicId() {
        return scenicId;
    }

    public void setScenicId(Integer scenicId) {
        this.scenicId = scenicId;
    }

    public Integer getScenicDetails() {
        return scenicDetails;
    }

    public void setScenicDetails(Integer scenicDetails) {
        this.scenicDetails = scenicDetails;
    }
}