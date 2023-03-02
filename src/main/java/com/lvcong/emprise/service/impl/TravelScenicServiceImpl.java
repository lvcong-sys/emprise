package com.lvcong.emprise.service.impl;

import com.lvcong.emprise.bean.TravelScenic;
import com.lvcong.emprise.bean.TravelScenicExample;
import com.lvcong.emprise.bean.TravelScenicKey;
import com.lvcong.emprise.mapper.TravelScenicMapper;
import com.lvcong.emprise.service.TravelScenicService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (TravelScenic)表服务实现类
 *
 * @author makejava
 * @since 2023-03-02 13:30:19
 */
@Service("travelScenicService")
public class TravelScenicServiceImpl implements TravelScenicService {
    @Resource
    private final TravelScenicMapper travelScenicMapper;

    public TravelScenicServiceImpl(TravelScenicMapper travelScenicMapper) {
        this.travelScenicMapper = travelScenicMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param scenicId 主键
     * @return 实例对象
     */
    @Override
    public TravelScenic queryById(TravelScenicKey scenicId) {
        return this.travelScenicMapper.selectByPrimaryKey(scenicId);
    }

    /**
     * 分页查询
     *
     * @param travelScenic 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<TravelScenic> queryByPage(TravelScenicExample travelScenic, PageRequest pageRequest) {
        long total = this.travelScenicMapper.countByExample(travelScenic);
        return new PageImpl<>(this.travelScenicMapper.queryAllByLimit(travelScenic, pageRequest), pageRequest, total);
    }

}
