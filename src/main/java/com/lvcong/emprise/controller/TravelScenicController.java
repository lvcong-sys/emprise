package com.lvcong.emprise.controller;


import com.lvcong.emprise.entity.TravelScenic;
import com.lvcong.emprise.service.TravelScenicService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TravelScenic)表控制层
 *
 * @author makejava
 * @since 2023-03-02 18:04:18
 */
@RestController
@RequestMapping("travelScenic")
public class TravelScenicController {
    /**
     * 服务对象
     */
    @Resource
    private TravelScenicService travelScenicService;

    /**
     * 分页查询
     *
     * @param travelScenic 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<TravelScenic>> queryByPage(TravelScenic travelScenic, PageRequest pageRequest) {
        return ResponseEntity.ok(this.travelScenicService.queryByPage(travelScenic, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<TravelScenic> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.travelScenicService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param travelScenic 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<TravelScenic> add(TravelScenic travelScenic) {
        return ResponseEntity.ok(this.travelScenicService.insert(travelScenic));
    }

    /**
     * 编辑数据
     *
     * @param travelScenic 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<TravelScenic> edit(TravelScenic travelScenic) {
        return ResponseEntity.ok(this.travelScenicService.update(travelScenic));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.travelScenicService.deleteById(id));
    }

}

