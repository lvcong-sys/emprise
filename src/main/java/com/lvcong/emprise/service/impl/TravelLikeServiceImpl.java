package com.lvcong.emprise.service.impl;

import com.lvcong.emprise.dao.TravelLikeDao;
import com.lvcong.emprise.entity.TravelLike;
import com.lvcong.emprise.service.TravelLikeService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (TravelLike)表服务实现类
 *
 * @author makejava
 * @since 2023-03-02 18:04:11
 */
@Service("travelLikeService")
public class TravelLikeServiceImpl implements TravelLikeService {
    @Resource
    private TravelLikeDao travelLikeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TravelLike queryById(Integer id) {
        return this.travelLikeDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param travelLike 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<TravelLike> queryByPage(TravelLike travelLike, PageRequest pageRequest) {
        long total = this.travelLikeDao.count(travelLike);
        return new PageImpl<>(this.travelLikeDao.queryAllByLimit(travelLike, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param travelLike 实例对象
     * @return 实例对象
     */
    @Override
    public TravelLike insert(TravelLike travelLike) {
        this.travelLikeDao.insert(travelLike);
        return travelLike;
    }

    /**
     * 修改数据
     *
     * @param travelLike 实例对象
     * @return 实例对象
     */
    @Override
    public TravelLike update(TravelLike travelLike) {
        this.travelLikeDao.update(travelLike);
        return this.queryById(travelLike.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.travelLikeDao.deleteById(id) > 0;
    }
}
