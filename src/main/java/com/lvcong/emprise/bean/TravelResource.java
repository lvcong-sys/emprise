package com.lvcong.emprise.bean;

import org.springframework.stereotype.Repository;

@Repository
public class TravelResource {
    private Integer id;

    private Integer type;

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
        this.postfix = postfix == null ? null : postfix.trim();
    }
}