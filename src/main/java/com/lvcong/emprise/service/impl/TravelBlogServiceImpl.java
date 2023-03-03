package com.lvcong.emprise.service.impl;


import com.lvcong.emprise.dao.TravelBlogDao;
import com.lvcong.emprise.entity.TravelBlog;
import com.lvcong.emprise.service.TravelBlogService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (TravelBlog)表服务实现类
 *
 * @author makejava
 * @since 2023-03-02 18:03:54
 */
@Service("travelBlogService")
public class TravelBlogServiceImpl implements TravelBlogService {
    @Resource
    private TravelBlogDao travelBlogDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TravelBlog queryById(Integer id) {
        return this.travelBlogDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param travelBlog 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<TravelBlog> queryByPage(TravelBlog travelBlog, PageRequest pageRequest) {
        long total = this.travelBlogDao.count(travelBlog);
        return new PageImpl<>(this.travelBlogDao.queryAllByLimit(travelBlog, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param travelBlog 实例对象
     * @return 实例对象
     */
    @Override
    public TravelBlog insert(TravelBlog travelBlog) {
        this.travelBlogDao.insert(travelBlog);
        return travelBlog;
    }

    /**
     * 修改数据
     *
     * @param travelBlog 实例对象
     * @return 实例对象
     */
    @Override
    public TravelBlog update(TravelBlog travelBlog) {
        this.travelBlogDao.update(travelBlog);
        return this.queryById(travelBlog.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.travelBlogDao.deleteById(id) > 0;
    }
}
