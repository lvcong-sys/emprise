package com.lvcong.emprise.service.impl;

import com.lvcong.emprise.dao.TravelCollectDao;
import com.lvcong.emprise.entity.TravelCollect;
import com.lvcong.emprise.service.TravelCollectService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (TravelCollect)表服务实现类
 *
 * @author makejava
 * @since 2023-03-02 18:04:04
 */
@Service("travelCollectService")
public class TravelCollectServiceImpl implements TravelCollectService {
    @Resource
    private TravelCollectDao travelCollectDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TravelCollect queryById(Integer id) {
        return this.travelCollectDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param travelCollect 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<TravelCollect> queryByPage(TravelCollect travelCollect, PageRequest pageRequest) {
        long total = this.travelCollectDao.count(travelCollect);
        return new PageImpl<>(this.travelCollectDao.queryAllByLimit(travelCollect, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param travelCollect 实例对象
     * @return 实例对象
     */
    @Override
    public TravelCollect insert(TravelCollect travelCollect) {
        this.travelCollectDao.insert(travelCollect);
        return travelCollect;
    }

    /**
     * 修改数据
     *
     * @param travelCollect 实例对象
     * @return 实例对象
     */
    @Override
    public TravelCollect update(TravelCollect travelCollect) {
        this.travelCollectDao.update(travelCollect);
        return this.queryById(travelCollect.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.travelCollectDao.deleteById(id) > 0;
    }
}
