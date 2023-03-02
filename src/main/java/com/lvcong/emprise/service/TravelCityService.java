package com.lvcong.emprise.service;

import com.lvcong.emprise.bean.TravelCity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (TravelCity)表服务接口
 *
 * @author makejava
 * @since 2023-03-02 13:30:19
 */
public interface TravelCityService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TravelCity queryById(Integer id);

    /**
     * 分页查询
     *
     * @param travelCity 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
//    Page<TravelCity> queryByPage(TravelCity travelCity, PageRequest pageRequest);
//
//    /**
//     * 新增数据
//     *
//     * @param travelCity 实例对象
//     * @return 实例对象
//     */
//    TravelCity insert(TravelCity travelCity);
//
//    /**
//     * 修改数据
//     *
//     * @param travelCity 实例对象
//     * @return 实例对象
//     */
//    TravelCity update(TravelCity travelCity);
//
//    /**
//     * 通过主键删除数据
//     *
//     * @param id 主键
//     * @return 是否成功
//     */
//    boolean deleteById(Integer id);

}
