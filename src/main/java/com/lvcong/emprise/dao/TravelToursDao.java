package com.lvcong.emprise.dao;

import com.lvcong.emprise.entity.TravelTours;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * (TravelTours)表数据库访问层
 *
 * @author makejava
 * @since 2023-03-02 18:04:24
 */
@Mapper
public interface TravelToursDao {

    /**
     * 通过ID查询单条数据
     *
     * @param toursId 主键
     * @return 实例对象
     */
    TravelTours queryById(Integer toursId);

    /**
     * 查询指定行数据
     *
     * @param travelTours 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<TravelTours> queryAllByLimit(TravelTours travelTours, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param travelTours 查询条件
     * @return 总行数
     */
    long count(TravelTours travelTours);

    /**
     * 新增数据
     *
     * @param travelTours 实例对象
     * @return 影响行数
     */
    int insert(TravelTours travelTours);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TravelTours> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TravelTours> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TravelTours> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<TravelTours> entities);

    /**
     * 修改数据
     *
     * @param travelTours 实例对象
     * @return 影响行数
     */
    int update(TravelTours travelTours);

    /**
     * 通过主键删除数据
     *
     * @param toursId 主键
     * @return 影响行数
     */
    int deleteById(Integer toursId);

}

