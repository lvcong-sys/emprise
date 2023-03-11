package com.lvcong.emprise.mapper;

import com.lvcong.emprise.bean.TravelBlog;
import com.lvcong.emprise.bean.TravelBlogExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 旅游博客映射器
 *
 * @author Kobe
 * @date 2023/03/04
 */
@Mapper
public interface TravelBlogMapper {
    /**
     * 计算实例
     *
     * @param example 例子
     * @return long
     */long countByExample(TravelBlogExample example);

    /**
     * 删除实例
     *
     * @param example 例子
     * @return int
     */int deleteByExample(TravelBlogExample example);

    /**
     * 按主键删除
     *
     * @param id id
     * @return int
     */int deleteByPrimaryKey(Integer id);

    /**
     * 插入
     *
     * @param record 记录
     * @return int
     */int insert(TravelBlog record);

    /**
     * 插入选择性
     *
     * @param record 记录
     * @return int
     */int insertSelective(TravelBlog record);

    /**
     * 选择通过例子blob
     *
     * @param example 例子
     * @return {@link List}<{@link TravelBlog}>
     */List<TravelBlog> selectByExampleWithBLOBs(TravelBlogExample example);

    /**
     * 选择例子
     *
     * @param example 例子
     * @return {@link List}<{@link TravelBlog}>
     */List<TravelBlog> selectByExample(TravelBlogExample example);

    /**
     * 选择通过主键
     *
     * @param id id
     * @return {@link TravelBlog}
     */TravelBlog selectByPrimaryKey(Integer id);

    /**
     * 更新例子有选择性
     *
     * @param record 记录
     * @param example 例子
     * @return int
     */int updateByExampleSelective(@Param("record") TravelBlog record, @Param("example") TravelBlogExample example);

    /**
     * 更新通过例子blob
     *
     * @param record 记录
     * @param example 例子
     * @return int
     */int updateByExampleWithBLOBs(@Param("record") TravelBlog record, @Param("example") TravelBlogExample example);

    /**
     * 更新例子
     *
     * @param record 记录
     * @param example 例子
     * @return int
     */int updateByExample(@Param("record") TravelBlog record, @Param("example") TravelBlogExample example);

    /**
     * 更新主键选择性
     *
     * @param record 记录
     * @return int
     */int updateByPrimaryKeySelective(TravelBlog record);

    /**
     * 更新通过主键blob
     *
     * @param record 记录
     * @return int
     */int updateByPrimaryKeyWithBLOBs(TravelBlog record);

    /**
     * 更新主键
     *
     * @param record 记录
     * @return int
     */int updateByPrimaryKey(TravelBlog record);
}