package com.lvcong.emprise.entity;

import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * (TravelResource)实体类
 *
 * @author makejava
 * @since 2023-03-02 18:04:16
 */
@Repository
public class TravelResource implements Serializable {
    private static final long serialVersionUID = 755055200536017039L;
    /**
     * 资源id
     */
    private Integer id;
    /**
     * 媒体文件的大类（0表示图片、1表示视频）
     */
    private Integer type;
    /**
     * 文件后缀
     */
    private String postfix;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getPostfix() {
        return postfix;
    }

    public void setPostfix(String postfix) {
        this.postfix = postfix;
    }

}

