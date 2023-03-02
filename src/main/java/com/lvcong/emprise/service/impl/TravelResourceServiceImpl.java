package com.lvcong.emprise.service.impl;

import com.lvcong.emprise.bean.TravelResource;
import com.lvcong.emprise.mapper.TravelResourceMapper;
import com.lvcong.emprise.service.TravelResourceService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (TravelResource)表服务实现类
 *
 * @author makejava
 * @since 2023-03-02 14:25:22
 */
@Service("travelResourceService")
public class TravelResourceServiceImpl implements TravelResourceService {
    @Resource
    private final TravelResourceMapper travelResourceMapper;

    public TravelResourceServiceImpl(TravelResourceMapper travelResourceMapper) {
        this.travelResourceMapper = travelResourceMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TravelResource queryById(Integer id) {
        return this.travelResourceMapper.selectByPrimaryKey(id);
    }
    /**
     * 新增数据
     *
     * @param travelResource 实例对象
     * @return 实例对象
     */
    @Override
    public TravelResource insert(TravelResource travelResource) {
        this.travelResourceMapper.insert(travelResource);
        return travelResource;
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.travelResourceMapper.deleteByPrimaryKey(id) > 0;
    }
}
