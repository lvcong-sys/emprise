package com.lvcong.emprise.service.impl;

import com.lvcong.emprise.bean.TravelNotice;
import com.lvcong.emprise.mapper.TravelNoticeMapper;
import com.lvcong.emprise.service.TravelNoticeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (TravelNotice)表服务实现类
 *
 * @author makejava
 * @since 2023-03-02 13:30:18
 */
@Service("travelNoticeService")
public class TravelNoticeServiceImpl implements TravelNoticeService {
    @Resource
    private final TravelNoticeMapper travelNoticeMapper;

    public TravelNoticeServiceImpl(TravelNoticeMapper travelNoticeMapper) {
        this.travelNoticeMapper = travelNoticeMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param noticeId 主键
     * @return 实例对象
     */
    @Override
    public TravelNotice queryById(Integer noticeId) {
        return this.travelNoticeMapper.selectByPrimaryKey(noticeId);
    }
}
