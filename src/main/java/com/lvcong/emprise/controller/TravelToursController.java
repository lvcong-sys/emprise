package com.lvcong.emprise.controller;

import com.lvcong.emprise.entity.TravelTours;
import com.lvcong.emprise.service.TravelToursService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TravelTours)表控制层
 *
 * @author makejava
 * @since 2023-03-02 18:04:24
 */
@RestController
@RequestMapping("travelTours")
public class TravelToursController {
    /**
     * 服务对象
     */
    @Resource
    private TravelToursService travelToursService;

    /**
     * 分页查询
     *
     * @param travelTours 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<TravelTours>> queryByPage(TravelTours travelTours, PageRequest pageRequest) {
        return ResponseEntity.ok(this.travelToursService.queryByPage(travelTours, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<TravelTours> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.travelToursService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param travelTours 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<TravelTours> add(TravelTours travelTours) {
        return ResponseEntity.ok(this.travelToursService.insert(travelTours));
    }

    /**
     * 编辑数据
     *
     * @param travelTours 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<TravelTours> edit(TravelTours travelTours) {
        return ResponseEntity.ok(this.travelToursService.update(travelTours));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.travelToursService.deleteById(id));
    }

}
