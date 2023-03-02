package com.lvcong.emprise.service;


import com.lvcong.emprise.bean.TravelNotice;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (TravelNotice)表服务接口
 *
 * @author makejava
 * @since 2023-03-02 13:30:18
 */
public interface TravelNoticeService {

    /**
     * 通过ID查询单条数据
     *
     * @param noticeId 主键
     * @return 实例对象
     */
    TravelNotice queryById(Integer noticeId);


}
