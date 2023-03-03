package com.lvcong.emprise.entity;

import org.springframework.stereotype.Repository;

import java.util.Date;
import java.io.Serializable;

/**
 * (TravelNotice)实体类
 *
 * @author makejava
 * @since 2023-03-02 18:04:12
 */
@Repository
public class TravelNotice implements Serializable {
    private static final long serialVersionUID = -75957540960360496L;
    
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
        this.noticeImageurl = noticeImageurl;
    }

    public String getNoticeContent() {
        return noticeContent;
    }

    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent;
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
        this.noticePlace = noticePlace;
    }

}

