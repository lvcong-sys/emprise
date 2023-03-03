package com.lvcong.emprise.entity;

import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * (TravelCity)实体类
 *
 * @author makejava
 * @since 2023-03-02 18:03:55
 */
@Repository
public class TravelCity implements Serializable {
    private static final long serialVersionUID = -11469831924464781L;
    
    private Integer id;
    
    private Integer pid;
    
    private String cityname;
    
    private Integer type;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

}

