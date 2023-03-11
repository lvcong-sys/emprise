package com.lvcong.emprise.mapper;

import com.lvcong.emprise.bean.TravelLikeExample;
import com.lvcong.emprise.bean.TravelLikeKey;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 旅行就像映射器
 *
 * @author Kobe
 * @date 2023/03/04
 */@Mapper
public interface TravelLikeMapper {
    /**
     * 计算实例
     *
     * @param example 例子
     * @return long
     */long countByExample(TravelLikeExample example);

    /**
     * 删除实例
     *
     * @param example 例子
     * @return int
     */int deleteByExample(TravelLikeExample example);

    /**
     * 按主键删除
     *
     * @param key 关键
     * @return int
     */int deleteByPrimaryKey(TravelLikeKey key);

    /**
     * 插入
     *
     * @param record 记录
     * @return int
     */int insert(TravelLikeKey record);

    /**
     * 插入选择性
     *
     * @param record 记录
     * @return int
     */int insertSelective(TravelLikeKey record);

    /**
     * 选择例子
     *
     * @param example 例子
     * @return {@link List}<{@link TravelLikeKey}>
     */List<TravelLikeKey> selectByExample(TravelLikeExample example);

    /**
     * 更新例子有选择性
     *
     * @param record 记录
     * @param example 例子
     * @return int
     */int updateByExampleSelective(@Param("record") TravelLikeKey record, @Param("example") TravelLikeExample example);

    /**
     * 更新例子
     *
     * @param record 记录
     * @param example 例子
     * @return int
     */int updateByExample(@Param("record") TravelLikeKey record, @Param("example") TravelLikeExample example);
}