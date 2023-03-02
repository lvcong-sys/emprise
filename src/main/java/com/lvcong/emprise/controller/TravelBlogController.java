package com.lvcong.emprise.controller;


import com.lvcong.emprise.bean.TravelBlog;
import com.lvcong.emprise.bean.TravelBlogExample;
import com.lvcong.emprise.service.TravelBlogService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TravelBlog)表控制层
 *
 * @author makejava
 * @since 2023-03-02 13:30:19
 */
@RestController
@RequestMapping("travelBlog")
public class TravelBlogController {
    /**
     * 服务对象
     */
    @Resource
    private TravelBlogService travelBlogService;

    /**
     * 分页查询
     *
     * @param travelBlog 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<TravelBlog>> queryByPage(TravelBlogExample travelBlog, PageRequest pageRequest) {
        return ResponseEntity.ok(this.travelBlogService.queryByPage(travelBlog, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<TravelBlog> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.travelBlogService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param travelBlog 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<TravelBlog> add(TravelBlog travelBlog) {
        return ResponseEntity.ok(this.travelBlogService.insert(travelBlog));
    }

    /**
     * 编辑数据
     *
     * @param travelBlog 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<TravelBlog> edit(TravelBlog travelBlog,TravelBlogExample travelBlogExample) {
        return ResponseEntity.ok(this.travelBlogService.update(travelBlog,travelBlogExample));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.travelBlogService.deleteById(id));
    }

}

