package com.lvcong.emprise.controller;

import com.lvcong.emprise.entity.TravelCity;
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
 * @since 2023-03-02 18:03:54
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
     * 分页查询
     *
     * @param travelCity 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<TravelCity>> queryByPage(TravelCity travelCity, PageRequest pageRequest) {
        return ResponseEntity.ok(this.travelCityService.queryByPage(travelCity, pageRequest));
    }

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

    /**
     * 新增数据
     *
     * @param travelCity 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<TravelCity> add(TravelCity travelCity) {
        return ResponseEntity.ok(this.travelCityService.insert(travelCity));
    }

    /**
     * 编辑数据
     *
     * @param travelCity 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<TravelCity> edit(TravelCity travelCity) {
        return ResponseEntity.ok(this.travelCityService.update(travelCity));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.travelCityService.deleteById(id));
    }

}

