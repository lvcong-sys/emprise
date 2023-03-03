package com.lvcong.emprise.service.impl;


import com.lvcong.emprise.dao.TravelNoticeDao;
import com.lvcong.emprise.entity.TravelNotice;
import com.lvcong.emprise.service.TravelNoticeService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (TravelNotice)表服务实现类
 *
 * @author makejava
 * @since 2023-03-02 18:04:14
 */
@Service("travelNoticeService")
public class TravelNoticeServiceImpl implements TravelNoticeService {
    @Resource
    private TravelNoticeDao travelNoticeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param noticeId 主键
     * @return 实例对象
     */
    @Override
    public TravelNotice queryById(Integer noticeId) {
        return this.travelNoticeDao.queryById(noticeId);
    }

    /**
     * 分页查询
     *
     * @param travelNotice 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<TravelNotice> queryByPage(TravelNotice travelNotice, PageRequest pageRequest) {
        long total = this.travelNoticeDao.count(travelNotice);
        return new PageImpl<>(this.travelNoticeDao.queryAllByLimit(travelNotice, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param travelNotice 实例对象
     * @return 实例对象
     */
    @Override
    public TravelNotice insert(TravelNotice travelNotice) {
        this.travelNoticeDao.insert(travelNotice);
        return travelNotice;
    }

    /**
     * 修改数据
     *
     * @param travelNotice 实例对象
     * @return 实例对象
     */
    @Override
    public TravelNotice update(TravelNotice travelNotice) {
        this.travelNoticeDao.update(travelNotice);
        return this.queryById(travelNotice.getNoticeId());
    }

    /**
     * 通过主键删除数据
     *
     * @param noticeId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer noticeId) {
        return this.travelNoticeDao.deleteById(noticeId) > 0;
    }
}
