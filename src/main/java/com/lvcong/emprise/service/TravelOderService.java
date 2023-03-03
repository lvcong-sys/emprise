package com.lvcong.emprise.service;

import com.lvcong.emprise.entity.TravelOder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (TravelOder)表服务接口
 *
 * @author makejava
 * @since 2023-03-02 18:04:25
 */
public interface TravelOderService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TravelOder queryById(Integer id);

    /**
     * 分页查询
     *
     * @param travelOder 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<TravelOder> queryByPage(TravelOder travelOder, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param travelOder 实例对象
     * @return 实例对象
     */
    TravelOder insert(TravelOder travelOder);

    /**
     * 修改数据
     *
     * @param travelOder 实例对象
     * @return 实例对象
     */
    TravelOder update(TravelOder travelOder);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
