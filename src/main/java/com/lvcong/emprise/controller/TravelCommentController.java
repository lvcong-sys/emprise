package com.lvcong.emprise.controller;

import com.lvcong.emprise.entity.TravelComment;
import com.lvcong.emprise.service.TravelCommentService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TravelComment)表控制层
 *
 * @author makejava
 * @since 2023-03-02 18:04:05
 */
@RestController
@RequestMapping("travelComment")
public class TravelCommentController {
    /**
     * 服务对象
     */
    @Resource
    private TravelCommentService travelCommentService;

    /**
     * 分页查询
     *
     * @param travelComment 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<TravelComment>> queryByPage(TravelComment travelComment, PageRequest pageRequest) {
        return ResponseEntity.ok(this.travelCommentService.queryByPage(travelComment, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<TravelComment> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.travelCommentService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param travelComment 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<TravelComment> add(TravelComment travelComment) {
        return ResponseEntity.ok(this.travelCommentService.insert(travelComment));
    }

    /**
     * 编辑数据
     *
     * @param travelComment 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<TravelComment> edit(TravelComment travelComment) {
        return ResponseEntity.ok(this.travelCommentService.update(travelComment));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.travelCommentService.deleteById(id));
    }

}

