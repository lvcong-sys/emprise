package com.lvcong.emprise.dao;


import com.lvcong.emprise.entity.TravelBlog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (TravelBlog)表数据库访问层
 *
 * @author makejava
 * @since 2023-03-02 18:03:52
 */
@Mapper
public interface TravelBlogDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TravelBlog queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param travelBlog 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<TravelBlog> queryAllByLimit(TravelBlog travelBlog, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param travelBlog 查询条件
     * @return 总行数
     */
    long count(TravelBlog travelBlog);

    /**
     * 新增数据
     *
     * @param travelBlog 实例对象
     * @return 影响行数
     */
    int insert(TravelBlog travelBlog);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TravelBlog> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TravelBlog> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TravelBlog> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<TravelBlog> entities);

    /**
     * 修改数据
     *
     * @param travelBlog 实例对象
     * @return 影响行数
     */
    int update(TravelBlog travelBlog);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

