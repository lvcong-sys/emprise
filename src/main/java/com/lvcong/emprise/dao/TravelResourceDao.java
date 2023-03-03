package com.lvcong.emprise.dao;


import com.lvcong.emprise.entity.TravelResource;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (TravelResource)表数据库访问层
 *
 * @author makejava
 * @since 2023-03-02 18:04:15
 */
@Mapper
public interface TravelResourceDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TravelResource queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param travelResource 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<TravelResource> queryAllByLimit(TravelResource travelResource, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param travelResource 查询条件
     * @return 总行数
     */
    long count(TravelResource travelResource);

    /**
     * 新增数据
     *
     * @param travelResource 实例对象
     * @return 影响行数
     */
    int insert(TravelResource travelResource);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TravelResource> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TravelResource> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TravelResource> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<TravelResource> entities);

    /**
     * 修改数据
     *
     * @param travelResource 实例对象
     * @return 影响行数
     */
    int update(TravelResource travelResource);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

