package com.lvcong.emprise.mapper;

import com.lvcong.emprise.bean.TravelCollectExample;
import com.lvcong.emprise.bean.TravelCollectKey;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 旅行收集映射器
 *
 * @author Kobe
 * @date 2023/03/04
 */@Mapper
public interface TravelCollectMapper {
    /**
     * 计算实例
     *
     * @param example 例子
     * @return long
     */long countByExample(TravelCollectExample example);

    /**
     * 删除实例
     *
     * @param example 例子
     * @return int
     */int deleteByExample(TravelCollectExample example);

    /**
     * 按主键删除
     *
     * @param key 关键
     * @return int
     */int deleteByPrimaryKey(TravelCollectKey key);

    /**
     * 插入
     *
     * @param record 记录
     * @return int
     */int insert(TravelCollectKey record);

    /**
     * 插入选择性
     *
     * @param record 记录
     * @return int
     */int insertSelective(TravelCollectKey record);

    /**
     * 选择例子
     *
     * @param example 例子
     * @return {@link List}<{@link TravelCollectKey}>
     */List<TravelCollectKey> selectByExample(TravelCollectExample example);

    /**
     * 更新例子有选择性
     *
     * @param record 记录
     * @param example 例子
     * @return int
     */int updateByExampleSelective(@Param("record") TravelCollectKey record, @Param("example") TravelCollectExample example);

    /**
     * 更新例子
     *
     * @param record 记录
     * @param example 例子
     * @return int
     */int updateByExample(@Param("record") TravelCollectKey record, @Param("example") TravelCollectExample example);
}