package com.lvcong.emprise.controller;


import com.lvcong.emprise.bean.TravelCity;
import com.lvcong.emprise.service.TravelCityService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TravelCity)表控制层
 *
 * @author makejava
 * @since 2023-03-02 13:30:19
 */
@RestController
@RequestMapping("travelCity")
public class TravelCityController {
    /**
     * 服务对象
     */
    @Resource
    private TravelCityService travelCityService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<TravelCity> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.travelCityService.queryById(id));
    }

}

