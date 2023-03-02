package com.lvcong.emprise.service;


import com.lvcong.emprise.bean.TravelBlog;
import com.lvcong.emprise.bean.TravelBlogExample;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (TravelBlog)表服务接口
 *
 * @author makejava
 * @since 2023-03-02 13:30:19
 */
public interface TravelBlogService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TravelBlog queryById(Integer id);

    /**
     * 分页查询，sql语句待实现
     *
     * @param travelBlog 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */

    Page<TravelBlog> queryByPage(TravelBlogExample travelBlog, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param travelBlog 实例对象
     * @return 实例对象
     */
    TravelBlog insert(TravelBlog travelBlog);

    /**
     * 修改数据
     * @param blog 修改数据前的实例对象
     * @param travelBlog 实例对象
     * @return 实例对象
     *
     */
    TravelBlog update(TravelBlog blog, TravelBlogExample travelBlog);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
