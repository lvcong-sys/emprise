package com.lvcong.emprise.controller;

import com.lvcong.emprise.entity.TravelOder;
import com.lvcong.emprise.service.TravelOderService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TravelOder)表控制层
 *
 * @author makejava
 * @since 2023-03-02 18:04:24
 */
@RestController
@RequestMapping("travelOder")
public class TravelOderController {
    /**
     * 服务对象
     */
    @Resource
    private TravelOderService travelOderService;

    /**
     * 分页查询
     *
     * @param travelOder 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<TravelOder>> queryByPage(TravelOder travelOder, PageRequest pageRequest) {
        return ResponseEntity.ok(this.travelOderService.queryByPage(travelOder, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<TravelOder> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.travelOderService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param travelOder 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<TravelOder> add(TravelOder travelOder) {
        return ResponseEntity.ok(this.travelOderService.insert(travelOder));
    }

    /**
     * 编辑数据
     *
     * @param travelOder 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<TravelOder> edit(TravelOder travelOder) {
        return ResponseEntity.ok(this.travelOderService.update(travelOder));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.travelOderService.deleteById(id));
    }

}

