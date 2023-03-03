package com.lvcong.emprise.dao;

import com.lvcong.emprise.entity.TravelComment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * (TravelComment)表数据库访问层
 *
 * @author makejava
 * @since 2023-03-02 18:04:06
 */
@Mapper
public interface TravelCommentDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TravelComment queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param travelComment 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<TravelComment> queryAllByLimit(TravelComment travelComment, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param travelComment 查询条件
     * @return 总行数
     */
    long count(TravelComment travelComment);

    /**
     * 新增数据
     *
     * @param travelComment 实例对象
     * @return 影响行数
     */
    int insert(TravelComment travelComment);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TravelComment> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TravelComment> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TravelComment> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<TravelComment> entities);

    /**
     * 修改数据
     *
     * @param travelComment 实例对象
     * @return 影响行数
     */
    int update(TravelComment travelComment);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

