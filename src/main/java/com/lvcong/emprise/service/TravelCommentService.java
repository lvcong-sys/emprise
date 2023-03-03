package com.lvcong.emprise.service;

import com.lvcong.emprise.entity.TravelComment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (TravelComment)表服务接口
 *
 * @author makejava
 * @since 2023-03-02 18:04:06
 */
public interface TravelCommentService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TravelComment queryById(Integer id);

    /**
     * 分页查询
     *
     * @param travelComment 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<TravelComment> queryByPage(TravelComment travelComment, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param travelComment 实例对象
     * @return 实例对象
     */
    TravelComment insert(TravelComment travelComment);

    /**
     * 修改数据
     *
     * @param travelComment 实例对象
     * @return 实例对象
     */
    TravelComment update(TravelComment travelComment);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
