package com.lvcong.emprise.controller;


import com.lvcong.emprise.bean.TravelFeedback;
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
 * @since 2023-03-02 13:30:19
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
     * 新增数据
     *
     * @param travelFeedback 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<TravelFeedback> add(TravelFeedback travelFeedback) {
        return ResponseEntity.ok(this.travelFeedbackService.insert(travelFeedback));
    }

}

