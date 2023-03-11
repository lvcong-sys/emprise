package com.lvcong.emprise.mapper;

import com.lvcong.emprise.bean.TravelFeedback;
import com.lvcong.emprise.bean.TravelFeedbackExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 旅行反馈映射器
 *
 * @author Kobe
 * @date 2023/03/04
 */@Mapper
public interface TravelFeedbackMapper {
    /**
     * 计算实例
     *
     * @param example 例子
     * @return long
     */long countByExample(TravelFeedbackExample example);

    /**
     * 删除实例
     *
     * @param example 例子
     * @return int
     */int deleteByExample(TravelFeedbackExample example);

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
     */int insert(TravelFeedback record);

    /**
     * 插入选择性
     *
     * @param record 记录
     * @return int
     */int insertSelective(TravelFeedback record);

    /**
     * 选择通过例子blob
     *
     * @param example 例子
     * @return {@link List}<{@link TravelFeedback}>
     */List<TravelFeedback> selectByExampleWithBLOBs(TravelFeedbackExample example);

    /**
     * 选择例子
     *
     * @param example 例子
     * @return {@link List}<{@link TravelFeedback}>
     */List<TravelFeedback> selectByExample(TravelFeedbackExample example);

    /**
     * 选择通过主键
     *
     * @param id id
     * @return {@link TravelFeedback}
     */TravelFeedback selectByPrimaryKey(Integer id);

    /**
     * 更新例子有选择性
     *
     * @param record 记录
     * @param example 例子
     * @return int
     */int updateByExampleSelective(@Param("record") TravelFeedback record, @Param("example") TravelFeedbackExample example);

    /**
     * 更新通过例子blob
     *
     * @param record 记录
     * @param example 例子
     * @return int
     */int updateByExampleWithBLOBs(@Param("record") TravelFeedback record, @Param("example") TravelFeedbackExample example);

    /**
     * 更新例子
     *
     * @param record 记录
     * @param example 例子
     * @return int
     */int updateByExample(@Param("record") TravelFeedback record, @Param("example") TravelFeedbackExample example);

    /**
     * 更新主键选择性
     *
     * @param record 记录
     * @return int
     */int updateByPrimaryKeySelective(TravelFeedback record);

    /**
     * 更新通过主键blob
     *
     * @param record 记录
     * @return int
     */int updateByPrimaryKeyWithBLOBs(TravelFeedback record);

    /**
     * 更新主键
     *
     * @param record 记录
     * @return int
     */int updateByPrimaryKey(TravelFeedback record);
}