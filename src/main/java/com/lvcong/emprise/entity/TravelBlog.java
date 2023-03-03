package com.lvcong.emprise.entity;

import org.springframework.stereotype.Repository;

import java.util.Date;
import java.io.Serializable;

/**
 * (TravelBlog)实体类
 *
 * @author makejava
 * @since 2023-03-02 18:03:52
 */
@Repository
public class TravelBlog implements Serializable {
    private static final long serialVersionUID = -37385338442575402L;
    /**
     * 游记id
     */
    private Integer id;
    /**
     * 游记标题
     */
    private String title;
    /**
     * 游记正文
     */
    private String context;
    /**
     * 编写/修改时间
     */
    private Date time;
    /**
     * 1表示不可见状态，2表示可见状态（若为可见则需要系统进行审核）
     */
    private Integer status;
    /**
     * 作者id
     */
    private Integer authorId;
    /**
     * 游记所描述的景点位置
     */
    private Integer location;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public Integer getLocation() {
        return location;
    }

    public void setLocation(Integer location) {
        this.location = location;
    }

}

