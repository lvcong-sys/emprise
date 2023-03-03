package com.lvcong.emprise.service;

import com.lvcong.emprise.entity.TravelLike;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (TravelLike)表服务接口
 *
 * @author makejava
 * @since 2023-03-02 18:04:11
 */
public interface TravelLikeService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TravelLike queryById(Integer id);

    /**
     * 分页查询
     *
     * @param travelLike 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<TravelLike> queryByPage(TravelLike travelLike, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param travelLike 实例对象
     * @return 实例对象
     */
    TravelLike insert(TravelLike travelLike);

    /**
     * 修改数据
     *
     * @param travelLike 实例对象
     * @return 实例对象
     */
    TravelLike update(TravelLike travelLike);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
