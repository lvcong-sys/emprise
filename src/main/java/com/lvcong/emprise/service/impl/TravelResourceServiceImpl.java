package com.lvcong.emprise.service.impl;


import com.lvcong.emprise.dao.TravelResourceDao;
import com.lvcong.emprise.entity.TravelResource;
import com.lvcong.emprise.service.TravelResourceService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (TravelResource)表服务实现类
 *
 * @author makejava
 * @since 2023-03-02 18:04:18
 */
@Service("travelResourceService")
public class TravelResourceServiceImpl implements TravelResourceService {
    @Resource
    private TravelResourceDao travelResourceDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TravelResource queryById(Integer id) {
        return this.travelResourceDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param travelResource 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<TravelResource> queryByPage(TravelResource travelResource, PageRequest pageRequest) {
        long total = this.travelResourceDao.count(travelResource);
        return new PageImpl<>(this.travelResourceDao.queryAllByLimit(travelResource, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param travelResource 实例对象
     * @return 实例对象
     */
    @Override
    public TravelResource insert(TravelResource travelResource) {
        this.travelResourceDao.insert(travelResource);
        return travelResource;
    }

    /**
     * 修改数据
     *
     * @param travelResource 实例对象
     * @return 实例对象
     */
    @Override
    public TravelResource update(TravelResource travelResource) {
        this.travelResourceDao.update(travelResource);
        return this.queryById(travelResource.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.travelResourceDao.deleteById(id) > 0;
    }
}
