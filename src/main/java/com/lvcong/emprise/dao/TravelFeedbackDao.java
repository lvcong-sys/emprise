package com.lvcong.emprise.dao;

import com.lvcong.emprise.entity.TravelFeedback;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (TravelFeedback)表数据库访问层
 *
 * @author makejava
 * @since 2023-03-02 18:04:07
 */
@Mapper
public interface TravelFeedbackDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TravelFeedback queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param travelFeedback 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<TravelFeedback> queryAllByLimit(TravelFeedback travelFeedback, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param travelFeedback 查询条件
     * @return 总行数
     */
    long count(TravelFeedback travelFeedback);

    /**
     * 新增数据
     *
     * @param travelFeedback 实例对象
     * @return 影响行数
     */
    int insert(TravelFeedback travelFeedback);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TravelFeedback> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TravelFeedback> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TravelFeedback> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<TravelFeedback> entities);

    /**
     * 修改数据
     *
     * @param travelFeedback 实例对象
     * @return 影响行数
     */
    int update(TravelFeedback travelFeedback);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

