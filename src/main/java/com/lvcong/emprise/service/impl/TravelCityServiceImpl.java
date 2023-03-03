package com.lvcong.emprise.service.impl;

import com.lvcong.emprise.dao.TravelCityDao;
import com.lvcong.emprise.entity.TravelCity;
import com.lvcong.emprise.service.TravelCityService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (TravelCity)表服务实现类
 *
 * @author makejava
 * @since 2023-03-02 18:03:57
 */
@Service("travelCityService")
public class TravelCityServiceImpl implements TravelCityService {
    @Resource
    private TravelCityDao travelCityDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TravelCity queryById(Integer id) {
        return this.travelCityDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param travelCity 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<TravelCity> queryByPage(TravelCity travelCity, PageRequest pageRequest) {
        long total = this.travelCityDao.count(travelCity);
        return new PageImpl<>(this.travelCityDao.queryAllByLimit(travelCity, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param travelCity 实例对象
     * @return 实例对象
     */
    @Override
    public TravelCity insert(TravelCity travelCity) {
        this.travelCityDao.insert(travelCity);
        return travelCity;
    }

    /**
     * 修改数据
     *
     * @param travelCity 实例对象
     * @return 实例对象
     */
    @Override
    public TravelCity update(TravelCity travelCity) {
        this.travelCityDao.update(travelCity);
        return this.queryById(travelCity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.travelCityDao.deleteById(id) > 0;
    }
}
