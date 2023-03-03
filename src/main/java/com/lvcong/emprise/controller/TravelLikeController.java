package com.lvcong.emprise.controller;

import com.lvcong.emprise.entity.TravelLike;
import com.lvcong.emprise.service.TravelLikeService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TravelLike)表控制层
 *
 * @author makejava
 * @since 2023-03-02 18:04:10
 */
@RestController
@RequestMapping("travelLike")
public class TravelLikeController {
    /**
     * 服务对象
     */
    @Resource
    private TravelLikeService travelLikeService;

    /**
     * 分页查询
     *
     * @param travelLike 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<TravelLike>> queryByPage(TravelLike travelLike, PageRequest pageRequest) {
        return ResponseEntity.ok(this.travelLikeService.queryByPage(travelLike, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<TravelLike> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.travelLikeService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param travelLike 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<TravelLike> add(TravelLike travelLike) {
        return ResponseEntity.ok(this.travelLikeService.insert(travelLike));
    }

    /**
     * 编辑数据
     *
     * @param travelLike 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<TravelLike> edit(TravelLike travelLike) {
        return ResponseEntity.ok(this.travelLikeService.update(travelLike));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.travelLikeService.deleteById(id));
    }

}

