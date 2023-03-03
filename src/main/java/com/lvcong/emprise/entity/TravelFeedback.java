package com.lvcong.emprise.entity;

import org.springframework.stereotype.Repository;

import java.util.Date;
import java.io.Serializable;

/**
 * (TravelFeedback)实体类
 *
 * @author makejava
 * @since 2023-03-02 18:04:08
 */
@Repository
public class TravelFeedback implements Serializable {
    private static final long serialVersionUID = 225660464060665346L;
    /**
     * 反馈信息id
     */
    private Integer id;
    /**
     * 反馈内同
     */
    private String content;
    /**
     * 联系电话
     */
    private Integer tel;
    /**
     * 邮箱
     */
    private String emil;
    /**
     * 姓名
     */
    private String name;
    /**
     * 时间
     */
    private Date time;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getTel() {
        return tel;
    }

    public void setTel(Integer tel) {
        this.tel = tel;
    }

    public String getEmil() {
        return emil;
    }

    public void setEmil(String emil) {
        this.emil = emil;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

}

