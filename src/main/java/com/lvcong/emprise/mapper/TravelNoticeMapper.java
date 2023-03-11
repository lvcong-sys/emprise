package com.lvcong.emprise.mapper;

import com.lvcong.emprise.bean.TravelNotice;
import com.lvcong.emprise.bean.TravelNoticeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 旅行注意映射器
 *
 * @author Kobe
 * @date 2023/03/04
 */@Mapper
public interface TravelNoticeMapper {
    /**
     * 计算实例
     *
     * @param example 例子
     * @return long
     */long countByExample(TravelNoticeExample example);

    /**
     * 删除实例
     *
     * @param example 例子
     * @return int
     */int deleteByExample(TravelNoticeExample example);

    /**
     * 按主键删除
     *
     * @param noticeId 注意id
     * @return int
     */int deleteByPrimaryKey(Integer noticeId);

    /**
     * 插入
     *
     * @param record 记录
     * @return int
     */int insert(TravelNotice record);

    /**
     * 插入选择性
     *
     * @param record 记录
     * @return int
     */int insertSelective(TravelNotice record);

    /**
     * 选择例子
     *
     * @param example 例子
     * @return {@link List}<{@link TravelNotice}>
     */List<TravelNotice> selectByExample(TravelNoticeExample example);

    /**
     * 选择通过主键
     *
     * @param noticeId 注意id
     * @return {@link TravelNotice}
     */TravelNotice selectByPrimaryKey(Integer noticeId);

    /**
     * 更新例子有选择性
     *
     * @param record 记录
     * @param example 例子
     * @return int
     */int updateByExampleSelective(@Param("record") TravelNotice record, @Param("example") TravelNoticeExample example);

    /**
     * 更新例子
     *
     * @param record 记录
     * @param example 例子
     * @return int
     */int updateByExample(@Param("record") TravelNotice record, @Param("example") TravelNoticeExample example);

    /**
     * 更新主键选择性
     *
     * @param record 记录
     * @return int
     */int updateByPrimaryKeySelective(TravelNotice record);

    /**
     * 更新主键
     *
     * @param record 记录
     * @return int
     */int updateByPrimaryKey(TravelNotice record);
}