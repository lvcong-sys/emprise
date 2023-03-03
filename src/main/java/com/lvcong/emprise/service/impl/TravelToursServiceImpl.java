package com.lvcong.emprise.service.impl;

import com.lvcong.emprise.dao.TravelToursDao;
import com.lvcong.emprise.entity.TravelTours;
import com.lvcong.emprise.service.TravelToursService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (TravelTours)表服务实现类
 *
 * @author makejava
 * @since 2023-03-02 18:04:24
 */
@Service("travelToursService")
public class TravelToursServiceImpl implements TravelToursService {
    @Resource
    private TravelToursDao travelToursDao;

    /**
     * 通过ID查询单条数据
     *
     * @param toursId 主键
     * @return 实例对象
     */
    @Override
    public TravelTours queryById(Integer toursId) {
        return this.travelToursDao.queryById(toursId);
    }

    /**
     * 分页查询
     *
     * @param travelTours 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<TravelTours> queryByPage(TravelTours travelTours, PageRequest pageRequest) {
        long total = this.travelToursDao.count(travelTours);
        return new PageImpl<>(this.travelToursDao.queryAllByLimit(travelTours, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param travelTours 实例对象
     * @return 实例对象
     */
    @Override
    public TravelTours insert(TravelTours travelTours) {
        this.travelToursDao.insert(travelTours);
        return travelTours;
    }

    /**
     * 修改数据
     *
     * @param travelTours 实例对象
     * @return 实例对象
     */
    @Override
    public TravelTours update(TravelTours travelTours) {
        this.travelToursDao.update(travelTours);
        return this.queryById(travelTours.getToursId());
    }

    /**
     * 通过主键删除数据
     *
     * @param toursId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer toursId) {
        return this.travelToursDao.deleteById(toursId) > 0;
    }
}
