package com.lvcong.emprise.bean;

public class TravelScenic extends TravelScenicKey {
    private String scenicUrl;

    public String getScenicUrl() {
        return scenicUrl;
    }

    public void setScenicUrl(String scenicUrl) {
        this.scenicUrl = scenicUrl == null ? null : scenicUrl.trim();
    }
}