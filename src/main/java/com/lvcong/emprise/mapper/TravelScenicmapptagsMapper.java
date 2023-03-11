package com.lvcong.emprise.mapper;

import com.lvcong.emprise.bean.TravelScenicmapptagsExample;
import com.lvcong.emprise.bean.TravelScenicmapptagsKey;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 旅行scenicmapptags映射器
 *
 * @author Kobe
 * @date 2023/03/04
 */@Mapper
public interface TravelScenicmapptagsMapper {
    /**
     * 计算实例
     *
     * @param example 例子
     * @return long
     */long countByExample(TravelScenicmapptagsExample example);

    /**
     * 删除实例
     *
     * @param example 例子
     * @return int
     */int deleteByExample(TravelScenicmapptagsExample example);

    /**
     * 按主键删除
     *
     * @param key 关键
     * @return int
     */int deleteByPrimaryKey(TravelScenicmapptagsKey key);

    /**
     * 插入
     *
     * @param record 记录
     * @return int
     */int insert(TravelScenicmapptagsKey record);

    /**
     * 插入选择性
     *
     * @param record 记录
     * @return int
     */int insertSelective(TravelScenicmapptagsKey record);

    /**
     * 选择例子
     *
     * @param example 例子
     * @return {@link List}<{@link TravelScenicmapptagsKey}>
     */List<TravelScenicmapptagsKey> selectByExample(TravelScenicmapptagsExample example);

    /**
     * 更新例子有选择性
     *
     * @param record 记录
     * @param example 例子
     * @return int
     */int updateByExampleSelective(@Param("record") TravelScenicmapptagsKey record, @Param("example") TravelScenicmapptagsExample example);

    /**
     * 更新例子
     *
     * @param record 记录
     * @param example 例子
     * @return int
     */int updateByExample(@Param("record") TravelScenicmapptagsKey record, @Param("example") TravelScenicmapptagsExample example);
}