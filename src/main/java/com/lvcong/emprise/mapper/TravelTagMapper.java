package com.lvcong.emprise.mapper;

import com.lvcong.emprise.bean.TravelTag;
import com.lvcong.emprise.bean.TravelTagExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 旅行标签映射器
 *
 * @author Kobe
 * @date 2023/03/04
 */@Mapper
public interface TravelTagMapper {
    /**
     * 计算实例
     *
     * @param example 例子
     * @return long
     */long countByExample(TravelTagExample example);

    /**
     * 删除实例
     *
     * @param example 例子
     * @return int
     */int deleteByExample(TravelTagExample example);

    /**
     * 按主键删除
     *
     * @param tagId 标签id
     * @return int
     */int deleteByPrimaryKey(Integer tagId);

    /**
     * 插入
     *
     * @param record 记录
     * @return int
     */int insert(TravelTag record);

    /**
     * 插入选择性
     *
     * @param record 记录
     * @return int
     */int insertSelective(TravelTag record);

    /**
     * 选择例子
     *
     * @param example 例子
     * @return {@link List}<{@link TravelTag}>
     */List<TravelTag> selectByExample(TravelTagExample example);

    /**
     * 选择通过主键
     *
     * @param tagId 标签id
     * @return {@link TravelTag}
     */TravelTag selectByPrimaryKey(Integer tagId);

    /**
     * 更新例子有选择性
     *
     * @param record 记录
     * @param example 例子
     * @return int
     */int updateByExampleSelective(@Param("record") TravelTag record, @Param("example") TravelTagExample example);

    /**
     * 更新例子
     *
     * @param record 记录
     * @param example 例子
     * @return int
     */int updateByExample(@Param("record") TravelTag record, @Param("example") TravelTagExample example);

    /**
     * 更新主键选择性
     *
     * @param record 记录
     * @return int
     */int updateByPrimaryKeySelective(TravelTag record);

    /**
     * 更新主键
     *
     * @param record 记录
     * @return int
     */int updateByPrimaryKey(TravelTag record);
}