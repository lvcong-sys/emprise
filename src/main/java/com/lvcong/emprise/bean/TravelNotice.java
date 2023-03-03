package com.lvcong.emprise.bean;

import java.util.Date;

public class TravelNotice {
    private Integer noticeId;

    private String noticeImageurl;

    private String noticeContent;

    private Date noticeTime;

    private String noticePlace;

    public Integer getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Integer noticeId) {
        this.noticeId = noticeId;
    }

    public String getNoticeImageurl() {
        return noticeImageurl;
    }

    public void setNoticeImageurl(String noticeImageurl) {
        this.noticeImageurl = noticeImageurl == null ? null : noticeImageurl.trim();
    }

    public String getNoticeContent() {
        return noticeContent;
    }

    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent == null ? null : noticeContent.trim();
    }

    public Date getNoticeTime() {
        return noticeTime;
    }

    public void setNoticeTime(Date noticeTime) {
        this.noticeTime = noticeTime;
    }

    public String getNoticePlace() {
        return noticePlace;
    }

    public void setNoticePlace(String noticePlace) {
        this.noticePlace = noticePlace == null ? null : noticePlace.trim();
    }
}