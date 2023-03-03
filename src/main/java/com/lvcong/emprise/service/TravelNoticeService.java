package com.lvcong.emprise.service;

import com.lvcong.emprise.entity.TravelNotice;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (TravelNotice)表服务接口
 *
 * @author makejava
 * @since 2023-03-02 18:04:14
 */
public interface TravelNoticeService {

    /**
     * 通过ID查询单条数据
     *
     * @param noticeId 主键
     * @return 实例对象
     */
    TravelNotice queryById(Integer noticeId);

    /**
     * 分页查询
     *
     * @param travelNotice 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<TravelNotice> queryByPage(TravelNotice travelNotice, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param travelNotice 实例对象
     * @return 实例对象
     */
    TravelNotice insert(TravelNotice travelNotice);

    /**
     * 修改数据
     *
     * @param travelNotice 实例对象
     * @return 实例对象
     */
    TravelNotice update(TravelNotice travelNotice);

    /**
     * 通过主键删除数据
     *
     * @param noticeId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer noticeId);

}
