package com.lvcong.emprise.mapper;

import com.lvcong.emprise.bean.TravelScenic;
import com.lvcong.emprise.bean.TravelScenicExample;
import com.lvcong.emprise.bean.TravelScenicKey;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 旅游景区映射器
 *
 * @author Kobe
 * @date 2023/03/04
 */@Mapper
public interface TravelScenicMapper {
    /**
     * 计算实例
     *
     * @param example 例子
     * @return long
     */long countByExample(TravelScenicExample example);

    /**
     * 删除实例
     *
     * @param example 例子
     * @return int
     */int deleteByExample(TravelScenicExample example);

    /**
     * 按主键删除
     *
     * @param key 关键
     * @return int
     */int deleteByPrimaryKey(TravelScenicKey key);

    /**
     * 插入
     *
     * @param record 记录
     * @return int
     */int insert(TravelScenic record);

    /**
     * 插入选择性
     *
     * @param record 记录
     * @return int
     */int insertSelective(TravelScenic record);

    /**
     * 选择例子
     *
     * @param example 例子
     * @return {@link List}<{@link TravelScenic}>
     */List<TravelScenic> selectByExample(TravelScenicExample example);

    /**
     * 选择通过主键
     *
     * @param key 关键
     * @return {@link TravelScenic}
     */TravelScenic selectByPrimaryKey(TravelScenicKey key);

    /**
     * 更新例子有选择性
     *
     * @param record 记录
     * @param example 例子
     * @return int
     */int updateByExampleSelective(@Param("record") TravelScenic record, @Param("example") TravelScenicExample example);

    /**
     * 更新例子
     *
     * @param record 记录
     * @param example 例子
     * @return int
     */int updateByExample(@Param("record") TravelScenic record, @Param("example") TravelScenicExample example);

    /**
     * 更新主键选择性
     *
     * @param record 记录
     * @return int
     */int updateByPrimaryKeySelective(TravelScenic record);

    /**
     * 更新主键
     *
     * @param record 记录
     * @return int
     */int updateByPrimaryKey(TravelScenic record);
}