package com.lvcong.emprise.mapper;

import com.lvcong.emprise.bean.TravelCity;
import com.lvcong.emprise.bean.TravelCityExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 旅游城市映射器
 *
 * @author Kobe
 * @date 2023/03/04
 */@Mapper
public interface TravelCityMapper {
    /**
     * 计算实例
     *
     * @param example 例子
     * @return long
     */long countByExample(TravelCityExample example);

    /**
     * 删除实例
     *
     * @param example 例子
     * @return int
     */int deleteByExample(TravelCityExample example);

    /**
     * 按主键删除
     *
     * @param id id
     * @return int
     */int deleteByPrimaryKey(Integer id);

    /**
     * 插入
     *
     * @param record 记录
     * @return int
     */int insert(TravelCity record);

    /**
     * 插入选择性
     *
     * @param record 记录
     * @return int
     */int insertSelective(TravelCity record);

    /**
     * 选择例子
     *
     * @param example 例子
     * @return {@link List}<{@link TravelCity}>
     */List<TravelCity> selectByExample(TravelCityExample example);

    /**
     * 选择通过主键
     *
     * @param id id
     * @return {@link TravelCity}
     */TravelCity selectByPrimaryKey(Integer id);

    /**
     * 更新例子有选择性
     *
     * @param record 记录
     * @param example 例子
     * @return int
     */int updateByExampleSelective(@Param("record") TravelCity record, @Param("example") TravelCityExample example);

    /**
     * 更新例子
     *
     * @param record 记录
     * @param example 例子
     * @return int
     */int updateByExample(@Param("record") TravelCity record, @Param("example") TravelCityExample example);

    /**
     * 更新主键选择性
     *
     * @param record 记录
     * @return int
     */int updateByPrimaryKeySelective(TravelCity record);

    /**
     * 更新主键
     *
     * @param record 记录
     * @return int
     */int updateByPrimaryKey(TravelCity record);
}