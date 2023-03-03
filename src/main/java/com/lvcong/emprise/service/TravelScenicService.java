package com.lvcong.emprise.service;


import com.lvcong.emprise.entity.TravelScenic;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (TravelScenic)表服务接口
 *
 * @author makejava
 * @since 2023-03-02 18:04:20
 */
public interface TravelScenicService {

    /**
     * 通过ID查询单条数据
     *
     * @param scenicId 主键
     * @return 实例对象
     */
    TravelScenic queryById(Integer scenicId);

    /**
     * 分页查询
     *
     * @param travelScenic 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<TravelScenic> queryByPage(TravelScenic travelScenic, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param travelScenic 实例对象
     * @return 实例对象
     */
    TravelScenic insert(TravelScenic travelScenic);

    /**
     * 修改数据
     *
     * @param travelScenic 实例对象
     * @return 实例对象
     */
    TravelScenic update(TravelScenic travelScenic);

    /**
     * 通过主键删除数据
     *
     * @param scenicId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer scenicId);

}
