package com.lvcong.emprise.service;


import com.lvcong.emprise.bean.TravelScenic;
import com.lvcong.emprise.bean.TravelScenicExample;
import com.lvcong.emprise.bean.TravelScenicKey;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (TravelScenic)表服务接口
 *
 * @author makejava
 * @since 2023-03-02 13:30:19
 */
public interface TravelScenicService {

    /**
     * 通过ID查询单条数据
     *
     * @param scenicId 主键
     * @return 实例对象
     */
    TravelScenic queryById(TravelScenicKey scenicId);
    /**
     * 分页查询
     *
     * @param travelScenic 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<TravelScenic> queryByPage(TravelScenicExample travelScenic, PageRequest pageRequest);
}
