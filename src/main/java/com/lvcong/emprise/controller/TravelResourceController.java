package com.lvcong.emprise.controller;


import com.lvcong.emprise.bean.TravelResource;
import com.lvcong.emprise.service.TravelResourceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TravelResource)表控制层
 *
 * @author makejava
 * @since 2023-03-02 13:30:19
 */
@RestController
@RequestMapping("travelResource")
public class TravelResourceController {
    /**
     * 服务对象
     */
    @Resource
    private TravelResourceService travelResourceService;


    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<TravelResource> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.travelResourceService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param travelResource 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<TravelResource> add(TravelResource travelResource) {
        return ResponseEntity.ok(this.travelResourceService.insert(travelResource));
    }

}

