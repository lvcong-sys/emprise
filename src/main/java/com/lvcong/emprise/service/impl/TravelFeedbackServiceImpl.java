package com.lvcong.emprise.service.impl;


import com.lvcong.emprise.dao.TravelFeedbackDao;
import com.lvcong.emprise.entity.TravelFeedback;
import com.lvcong.emprise.service.TravelFeedbackService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (TravelFeedback)表服务实现类
 *
 * @author makejava
 * @since 2023-03-02 18:04:09
 */
@Service("travelFeedbackService")
public class TravelFeedbackServiceImpl implements TravelFeedbackService {
    @Resource
    private TravelFeedbackDao travelFeedbackDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TravelFeedback queryById(Integer id) {
        return this.travelFeedbackDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param travelFeedback 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<TravelFeedback> queryByPage(TravelFeedback travelFeedback, PageRequest pageRequest) {
        long total = this.travelFeedbackDao.count(travelFeedback);
        return new PageImpl<>(this.travelFeedbackDao.queryAllByLimit(travelFeedback, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param travelFeedback 实例对象
     * @return 实例对象
     */
    @Override
    public TravelFeedback insert(TravelFeedback travelFeedback) {
        this.travelFeedbackDao.insert(travelFeedback);
        return travelFeedback;
    }

    /**
     * 修改数据
     *
     * @param travelFeedback 实例对象
     * @return 实例对象
     */
    @Override
    public TravelFeedback update(TravelFeedback travelFeedback) {
        this.travelFeedbackDao.update(travelFeedback);
        return this.queryById(travelFeedback.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.travelFeedbackDao.deleteById(id) > 0;
    }
}
