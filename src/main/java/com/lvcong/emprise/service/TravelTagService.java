package com.lvcong.emprise.service;


import com.lvcong.emprise.entity.TravelTag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (TravelTag)表服务接口
 *
 * @author makejava
 * @since 2023-03-02 18:04:23
 */
public interface TravelTagService {

    /**
     * 通过ID查询单条数据
     *
     * @param tagId 主键
     * @return 实例对象
     */
    TravelTag queryById(Integer tagId);

    /**
     * 分页查询
     *
     * @param travelTag 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<TravelTag> queryByPage(TravelTag travelTag, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param travelTag 实例对象
     * @return 实例对象
     */
    TravelTag insert(TravelTag travelTag);

    /**
     * 修改数据
     *
     * @param travelTag 实例对象
     * @return 实例对象
     */
    TravelTag update(TravelTag travelTag);

    /**
     * 通过主键删除数据
     *
     * @param tagId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer tagId);

}
