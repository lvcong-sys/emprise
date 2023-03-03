package com.lvcong.emprise.service.impl;

import com.lvcong.emprise.dao.TravelScenicDao;
import com.lvcong.emprise.entity.TravelScenic;
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
 * @since 2023-03-02 18:04:21
 */
@Service("travelScenicService")
public class TravelScenicServiceImpl implements TravelScenicService {
    @Resource
    private TravelScenicDao travelScenicDao;

    /**
     * 通过ID查询单条数据
     *
     * @param scenicId 主键
     * @return 实例对象
     */
    @Override
    public TravelScenic queryById(Integer scenicId) {
        return this.travelScenicDao.queryById(scenicId);
    }

    /**
     * 分页查询
     *
     * @param travelScenic 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<TravelScenic> queryByPage(TravelScenic travelScenic, PageRequest pageRequest) {
        long total = this.travelScenicDao.count(travelScenic);
        return new PageImpl<>(this.travelScenicDao.queryAllByLimit(travelScenic, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param travelScenic 实例对象
     * @return 实例对象
     */
    @Override
    public TravelScenic insert(TravelScenic travelScenic) {
        this.travelScenicDao.insert(travelScenic);
        return travelScenic;
    }

    /**
     * 修改数据
     *
     * @param travelScenic 实例对象
     * @return 实例对象
     */
    @Override
    public TravelScenic update(TravelScenic travelScenic) {
        this.travelScenicDao.update(travelScenic);
        return this.queryById(travelScenic.getScenicId());
    }

    /**
     * 通过主键删除数据
     *
     * @param scenicId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer scenicId) {
        return this.travelScenicDao.deleteById(scenicId) > 0;
    }
}
