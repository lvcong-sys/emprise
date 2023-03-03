package com.lvcong.emprise.service.impl;

import com.lvcong.emprise.dao.TravelTagDao;
import com.lvcong.emprise.entity.TravelTag;
import com.lvcong.emprise.service.TravelTagService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (TravelTag)表服务实现类
 *
 * @author makejava
 * @since 2023-03-02 18:04:24
 */
@Service("travelTagService")
public class TravelTagServiceImpl implements TravelTagService {
    @Resource
    private TravelTagDao travelTagDao;

    /**
     * 通过ID查询单条数据
     *
     * @param tagId 主键
     * @return 实例对象
     */
    @Override
    public TravelTag queryById(Integer tagId) {
        return this.travelTagDao.queryById(tagId);
    }

    /**
     * 分页查询
     *
     * @param travelTag 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<TravelTag> queryByPage(TravelTag travelTag, PageRequest pageRequest) {
        long total = this.travelTagDao.count(travelTag);
        return new PageImpl<>(this.travelTagDao.queryAllByLimit(travelTag, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param travelTag 实例对象
     * @return 实例对象
     */
    @Override
    public TravelTag insert(TravelTag travelTag) {
        this.travelTagDao.insert(travelTag);
        return travelTag;
    }

    /**
     * 修改数据
     *
     * @param travelTag 实例对象
     * @return 实例对象
     */
    @Override
    public TravelTag update(TravelTag travelTag) {
        this.travelTagDao.update(travelTag);
        return this.queryById(travelTag.getTagId());
    }

    /**
     * 通过主键删除数据
     *
     * @param tagId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer tagId) {
        return this.travelTagDao.deleteById(tagId) > 0;
    }
}
