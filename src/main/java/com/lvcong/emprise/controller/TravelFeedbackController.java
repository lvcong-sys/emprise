package com.lvcong.emprise.controller;


import com.lvcong.emprise.entity.TravelFeedback;
import com.lvcong.emprise.service.TravelFeedbackService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TravelFeedback)表控制层
 *
 * @author makejava
 * @since 2023-03-02 18:04:06
 */
@RestController
@RequestMapping("travelFeedback")
public class TravelFeedbackController {
    /**
     * 服务对象
     */
    @Resource
    private TravelFeedbackService travelFeedbackService;

    /**
     * 分页查询
     *
     * @param travelFeedback 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<TravelFeedback>> queryByPage(TravelFeedback travelFeedback, PageRequest pageRequest) {
        return ResponseEntity.ok(this.travelFeedbackService.queryByPage(travelFeedback, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<TravelFeedback> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.travelFeedbackService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param travelFeedback 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<TravelFeedback> add(TravelFeedback travelFeedback) {
        return ResponseEntity.ok(this.travelFeedbackService.insert(travelFeedback));
    }

    /**
     * 编辑数据
     *
     * @param travelFeedback 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<TravelFeedback> edit(TravelFeedback travelFeedback) {
        return ResponseEntity.ok(this.travelFeedbackService.update(travelFeedback));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.travelFeedbackService.deleteById(id));
    }

}

