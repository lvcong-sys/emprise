package com.lvcong.emprise.controller;


import com.lvcong.emprise.entity.TravelTag;
import com.lvcong.emprise.service.TravelTagService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TravelTag)表控制层
 *
 * @author makejava
 * @since 2023-03-02 18:04:22
 */
@RestController
@RequestMapping("travelTag")
public class TravelTagController {
    /**
     * 服务对象
     */
    @Resource
    private TravelTagService travelTagService;

    /**
     * 分页查询
     *
     * @param travelTag 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<TravelTag>> queryByPage(TravelTag travelTag, PageRequest pageRequest) {
        return ResponseEntity.ok(this.travelTagService.queryByPage(travelTag, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<TravelTag> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.travelTagService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param travelTag 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<TravelTag> add(TravelTag travelTag) {
        return ResponseEntity.ok(this.travelTagService.insert(travelTag));
    }

    /**
     * 编辑数据
     *
     * @param travelTag 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<TravelTag> edit(TravelTag travelTag) {
        return ResponseEntity.ok(this.travelTagService.update(travelTag));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.travelTagService.deleteById(id));
    }

}

