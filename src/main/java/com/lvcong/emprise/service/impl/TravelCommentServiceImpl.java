package com.lvcong.emprise.service.impl;

import com.lvcong.emprise.dao.TravelCommentDao;
import com.lvcong.emprise.entity.TravelComment;
import com.lvcong.emprise.service.TravelCommentService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (TravelComment)表服务实现类
 *
 * @author makejava
 * @since 2023-03-02 18:04:06
 */
@Service("travelCommentService")
public class TravelCommentServiceImpl implements TravelCommentService {
    @Resource
    private TravelCommentDao travelCommentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TravelComment queryById(Integer id) {
        return this.travelCommentDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param travelComment 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<TravelComment> queryByPage(TravelComment travelComment, PageRequest pageRequest) {
        long total = this.travelCommentDao.count(travelComment);
        return new PageImpl<>(this.travelCommentDao.queryAllByLimit(travelComment, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param travelComment 实例对象
     * @return 实例对象
     */
    @Override
    public TravelComment insert(TravelComment travelComment) {
        this.travelCommentDao.insert(travelComment);
        return travelComment;
    }

    /**
     * 修改数据
     *
     * @param travelComment 实例对象
     * @return 实例对象
     */
    @Override
    public TravelComment update(TravelComment travelComment) {
        this.travelCommentDao.update(travelComment);
        return this.queryById(travelComment.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.travelCommentDao.deleteById(id) > 0;
    }
}
