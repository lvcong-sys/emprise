package com.lvcong.emprise.service;

import com.lvcong.emprise.entity.TravelFeedback;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (TravelFeedback)表服务接口
 *
 * @author makejava
 * @since 2023-03-02 18:04:09
 */
public interface TravelFeedbackService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TravelFeedback queryById(Integer id);

    /**
     * 分页查询
     *
     * @param travelFeedback 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<TravelFeedback> queryByPage(TravelFeedback travelFeedback, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param travelFeedback 实例对象
     * @return 实例对象
     */
    TravelFeedback insert(TravelFeedback travelFeedback);

    /**
     * 修改数据
     *
     * @param travelFeedback 实例对象
     * @return 实例对象
     */
    TravelFeedback update(TravelFeedback travelFeedback);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
