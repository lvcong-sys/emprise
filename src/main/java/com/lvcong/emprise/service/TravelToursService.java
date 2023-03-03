package com.lvcong.emprise.service;

import com.lvcong.emprise.entity.TravelTours;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (TravelTours)表服务接口
 *
 * @author makejava
 * @since 2023-03-02 18:04:24
 */
public interface TravelToursService {

    /**
     * 通过ID查询单条数据
     *
     * @param toursId 主键
     * @return 实例对象
     */
    TravelTours queryById(Integer toursId);

    /**
     * 分页查询
     *
     * @param travelTours 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<TravelTours> queryByPage(TravelTours travelTours, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param travelTours 实例对象
     * @return 实例对象
     */
    TravelTours insert(TravelTours travelTours);

    /**
     * 修改数据
     *
     * @param travelTours 实例对象
     * @return 实例对象
     */
    TravelTours update(TravelTours travelTours);

    /**
     * 通过主键删除数据
     *
     * @param toursId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer toursId);

}
