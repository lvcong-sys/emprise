package com.lvcong.emprise.service;

import com.lvcong.emprise.bean.TravelFeedback;

/**
 * (TravelFeedback)表服务接口
 *
 * @author makejava
 * @since 2023-03-02 13:30:19
 */
public interface TravelFeedbackService {

    /**
     * 新增数据
     *
     * @param travelFeedback 实例对象
     * @return 实例对象
     */
    TravelFeedback insert(TravelFeedback travelFeedback);

}
