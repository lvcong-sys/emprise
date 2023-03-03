package com.lvcong.emprise.controller;

import com.lvcong.emprise.entity.TravelNotice;
import com.lvcong.emprise.service.TravelNoticeService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TravelNotice)表控制层
 *
 * @author makejava
 * @since 2023-03-02 18:04:11
 */
@RestController
@RequestMapping("travelNotice")
public class TravelNoticeController {
    /**
     * 服务对象
     */
    @Resource
    private TravelNoticeService travelNoticeService;

    /**
     * 分页查询
     *
     * @param travelNotice 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<TravelNotice>> queryByPage(TravelNotice travelNotice, PageRequest pageRequest) {
        return ResponseEntity.ok(this.travelNoticeService.queryByPage(travelNotice, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<TravelNotice> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.travelNoticeService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param travelNotice 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<TravelNotice> add(TravelNotice travelNotice) {
        return ResponseEntity.ok(this.travelNoticeService.insert(travelNotice));
    }

    /**
     * 编辑数据
     *
     * @param travelNotice 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<TravelNotice> edit(TravelNotice travelNotice) {
        return ResponseEntity.ok(this.travelNoticeService.update(travelNotice));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.travelNoticeService.deleteById(id));
    }

}

