package com.lvcong.emprise.mapper;

import com.lvcong.emprise.bean.TravelResource;
import com.lvcong.emprise.bean.TravelResourceExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 旅游资源映射器
 *
 * @author Kobe
 * @date 2023/03/04
 */@Mapper
public interface TravelResourceMapper {
    /**
     * 计算实例
     *
     * @param example 例子
     * @return long
     */long countByExample(TravelResourceExample example);

    /**
     * 删除实例
     *
     * @param example 例子
     * @return int
     */int deleteByExample(TravelResourceExample example);

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
     */int insert(TravelResource record);

    /**
     * 插入选择性
     *
     * @param record 记录
     * @return int
     */int insertSelective(TravelResource record);

    /**
     * 选择例子
     *
     * @param example 例子
     * @return {@link List}<{@link TravelResource}>
     */List<TravelResource> selectByExample(TravelResourceExample example);

    /**
     * 选择通过主键
     *
     * @param id id
     * @return {@link TravelResource}
     */TravelResource selectByPrimaryKey(Integer id);

    /**
     * 更新例子有选择性
     *
     * @param record 记录
     * @param example 例子
     * @return int
     */int updateByExampleSelective(@Param("record") TravelResource record, @Param("example") TravelResourceExample example);

    /**
     * 更新例子
     *
     * @param record 记录
     * @param example 例子
     * @return int
     */int updateByExample(@Param("record") TravelResource record, @Param("example") TravelResourceExample example);

    /**
     * 更新主键选择性
     *
     * @param record 记录
     * @return int
     */int updateByPrimaryKeySelective(TravelResource record);

    /**
     * 更新主键
     *
     * @param record 记录
     * @return int
     */int updateByPrimaryKey(TravelResource record);
}