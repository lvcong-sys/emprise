package com.lvcong.emprise.service;


import com.lvcong.emprise.bean.TravelResource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (TravelResource)表服务接口
 *
 * @author makejava
 * @since 2023-03-02 14:25:22
 */
public interface TravelResourceService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TravelResource queryById(Integer id);


    /**
     * 新增数据
     *
     * @param travelResource 实例对象
     * @return 实例对象
     */
    TravelResource insert(TravelResource travelResource);


    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
