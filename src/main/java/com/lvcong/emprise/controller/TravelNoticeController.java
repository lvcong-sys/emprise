package com.lvcong.emprise.controller;


import com.lvcong.emprise.bean.TravelNotice;
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
 * @since 2023-03-02 13:30:17
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
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<TravelNotice> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.travelNoticeService.queryById(id));
    }
}

