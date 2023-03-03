package com.lvcong.emprise.dao;

import com.lvcong.emprise.entity.TravelLike;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * (TravelLike)表数据库访问层
 *
 * @author makejava
 * @since 2023-03-02 18:04:11
 */
@Mapper
public interface TravelLikeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TravelLike queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param travelLike 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<TravelLike> queryAllByLimit(TravelLike travelLike, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param travelLike 查询条件
     * @return 总行数
     */
    long count(TravelLike travelLike);

    /**
     * 新增数据
     *
     * @param travelLike 实例对象
     * @return 影响行数
     */
    int insert(TravelLike travelLike);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TravelLike> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TravelLike> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TravelLike> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<TravelLike> entities);

    /**
     * 修改数据
     *
     * @param travelLike 实例对象
     * @return 影响行数
     */
    int update(TravelLike travelLike);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

