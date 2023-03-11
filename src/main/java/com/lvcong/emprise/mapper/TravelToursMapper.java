package com.lvcong.emprise.mapper;

import com.lvcong.emprise.bean.TravelTours;
import com.lvcong.emprise.bean.TravelToursExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 旅游旅游映射器
 *
 * @author Kobe
 * @date 2023/03/04
 */@Mapper
public interface TravelToursMapper {
    /**
     * 计算实例
     *
     * @param example 例子
     * @return long
     */long countByExample(TravelToursExample example);

    /**
     * 删除实例
     *
     * @param example 例子
     * @return int
     */int deleteByExample(TravelToursExample example);

    /**
     * 按主键删除
     *
     * @param toursId 旅游标识
     * @return int
     */int deleteByPrimaryKey(Integer toursId);

    /**
     * 插入
     *
     * @param record 记录
     * @return int
     */int insert(TravelTours record);

    /**
     * 插入选择性
     *
     * @param record 记录
     * @return int
     */int insertSelective(TravelTours record);

    /**
     * 选择例子
     *
     * @param example 例子
     * @return {@link List}<{@link TravelTours}>
     */List<TravelTours> selectByExample(TravelToursExample example);

    /**
     * 选择通过主键
     *
     * @param toursId 旅游标识
     * @return {@link TravelTours}
     */TravelTours selectByPrimaryKey(Integer toursId);

    /**
     * 更新例子有选择性
     *
     * @param record 记录
     * @param example 例子
     * @return int
     */int updateByExampleSelective(@Param("record") TravelTours record, @Param("example") TravelToursExample example);

    /**
     * 更新例子
     *
     * @param record 记录
     * @param example 例子
     * @return int
     */int updateByExample(@Param("record") TravelTours record, @Param("example") TravelToursExample example);

    /**
     * 更新主键选择性
     *
     * @param record 记录
     * @return int
     */int updateByPrimaryKeySelective(TravelTours record);

    /**
     * 更新主键
     *
     * @param record 记录
     * @return int
     */int updateByPrimaryKey(TravelTours record);
}