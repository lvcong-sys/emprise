package com.lvcong.emprise.controller;


import com.lvcong.emprise.entity.TravelResource;
import com.lvcong.emprise.service.TravelResourceService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TravelResource)表控制层
 *
 * @author makejava
 * @since 2023-03-02 18:04:15
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
     * 分页查询
     *
     * @param travelResource 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<TravelResource>> queryByPage(TravelResource travelResource, PageRequest pageRequest) {
        return ResponseEntity.ok(this.travelResourceService.queryByPage(travelResource, pageRequest));
    }

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

    /**
     * 编辑数据
     *
     * @param travelResource 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<TravelResource> edit(TravelResource travelResource) {
        return ResponseEntity.ok(this.travelResourceService.update(travelResource));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.travelResourceService.deleteById(id));
    }

}

