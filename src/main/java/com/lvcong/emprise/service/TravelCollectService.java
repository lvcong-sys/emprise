package com.lvcong.emprise.service;

import com.lvcong.emprise.entity.TravelCollect;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (TravelCollect)表服务接口
 *
 * @author makejava
 * @since 2023-03-02 18:04:03
 */
public interface TravelCollectService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TravelCollect queryById(Integer id);

    /**
     * 分页查询
     *
     * @param travelCollect 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<TravelCollect> queryByPage(TravelCollect travelCollect, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param travelCollect 实例对象
     * @return 实例对象
     */
    TravelCollect insert(TravelCollect travelCollect);

    /**
     * 修改数据
     *
     * @param travelCollect 实例对象
     * @return 实例对象
     */
    TravelCollect update(TravelCollect travelCollect);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
