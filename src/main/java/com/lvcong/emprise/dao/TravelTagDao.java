package com.lvcong.emprise.dao;


import com.lvcong.emprise.entity.TravelTag;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (TravelTag)表数据库访问层
 *
 * @author makejava
 * @since 2023-03-02 18:04:22
 */
@Mapper
public interface TravelTagDao {

    /**
     * 通过ID查询单条数据
     *
     * @param tagId 主键
     * @return 实例对象
     */
    TravelTag queryById(Integer tagId);

    /**
     * 查询指定行数据
     *
     * @param travelTag 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<TravelTag> queryAllByLimit(TravelTag travelTag, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param travelTag 查询条件
     * @return 总行数
     */
    long count(TravelTag travelTag);

    /**
     * 新增数据
     *
     * @param travelTag 实例对象
     * @return 影响行数
     */
    int insert(TravelTag travelTag);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TravelTag> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TravelTag> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TravelTag> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<TravelTag> entities);

    /**
     * 修改数据
     *
     * @param travelTag 实例对象
     * @return 影响行数
     */
    int update(TravelTag travelTag);

    /**
     * 通过主键删除数据
     *
     * @param tagId 主键
     * @return 影响行数
     */
    int deleteById(Integer tagId);

}

