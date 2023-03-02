package com.lvcong.emprise.service.impl;

import com.lvcong.emprise.bean.TravelBlog;
import com.lvcong.emprise.bean.TravelBlogExample;
import com.lvcong.emprise.mapper.TravelBlogMapper;
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
 * @since 2023-03-02 13:30:19
 */
@Service("travelBlogService")
public class TravelBlogServiceImpl implements TravelBlogService {
    @Resource
    private final TravelBlogMapper travelBlogMapper;
    public TravelBlogServiceImpl(TravelBlogMapper travelBlogMapper) {
        this.travelBlogMapper = travelBlogMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TravelBlog queryById(Integer id) {
        return this.travelBlogMapper.selectByPrimaryKey(id);
    }

    /**
     * 分页查询
     *
     * @param travelBlog 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<TravelBlog> queryByPage(TravelBlogExample travelBlog, PageRequest pageRequest) {
        long total = this.travelBlogMapper.countByExample(travelBlog);
        return new PageImpl<>(this.travelBlogMapper.queryAllByLimit(travelBlog, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param travelBlog 实例对象
     * @return 实例对象
     */
    @Override
    public TravelBlog insert(TravelBlog travelBlog) {
        this.travelBlogMapper.insert(travelBlog);
        return travelBlog;
    }

    /**
     * 修改数据
     *
     * @param travelBlog 实例对象
     * @return 实例对象
     */
    @Override
    public TravelBlog update(TravelBlog blog,TravelBlogExample travelBlog) {
        this.travelBlogMapper.updateByExampleSelective(blog,travelBlog);
        return this.queryById(blog.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.travelBlogMapper.deleteByPrimaryKey(id) > 0;
    }
}
