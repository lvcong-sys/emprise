package com.lvcong.emprise.service.impl;

import com.lvcong.emprise.dao.TravelOderDao;
import com.lvcong.emprise.entity.TravelOder;
import com.lvcong.emprise.service.TravelOderService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (TravelOder)表服务实现类
 *
 * @author makejava
 * @since 2023-03-02 18:04:25
 */
@Service("travelOderService")
public class TravelOderServiceImpl implements TravelOderService {
    @Resource
    private TravelOderDao travelOderDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TravelOder queryById(Integer id) {
        return this.travelOderDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param travelOder 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<TravelOder> queryByPage(TravelOder travelOder, PageRequest pageRequest) {
        long total = this.travelOderDao.count(travelOder);
        return new PageImpl<>(this.travelOderDao.queryAllByLimit(travelOder, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param travelOder 实例对象
     * @return 实例对象
     */
    @Override
    public TravelOder insert(TravelOder travelOder) {
        this.travelOderDao.insert(travelOder);
        return travelOder;
    }

    /**
     * 修改数据
     *
     * @param travelOder 实例对象
     * @return 实例对象
     */
    @Override
    public TravelOder update(TravelOder travelOder) {
        this.travelOderDao.update(travelOder);
        return this.queryById(travelOder.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.travelOderDao.deleteById(id) > 0;
    }
}
