package com.lvcong.emprise.service.impl;

import com.lvcong.emprise.bean.TravelFeedback;
import com.lvcong.emprise.mapper.TravelFeedbackMapper;
import com.lvcong.emprise.service.TravelFeedbackService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (TravelFeedback)表服务实现类
 *
 * @author makejava
 * @since 2023-03-02 13:30:19
 */
@Service("travelFeedbackService")
public class TravelFeedbackServiceImpl implements TravelFeedbackService {
    @Resource
    private final TravelFeedbackMapper travelFeedbackMapper;

    public TravelFeedbackServiceImpl(TravelFeedbackMapper travelFeedbackMapper) {
        this.travelFeedbackMapper = travelFeedbackMapper;
    }
    /**
     * 新增数据
     *
     * @param travelFeedback 实例对象
     * @return 实例对象
     */
    @Override
    public TravelFeedback insert(TravelFeedback travelFeedback) {
        this.travelFeedbackMapper.insert(travelFeedback);
        return travelFeedback;
    }
}
