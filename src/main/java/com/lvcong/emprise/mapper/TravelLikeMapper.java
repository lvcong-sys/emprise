package com.lvcong.emprise.mapper;

import com.lvcong.emprise.bean.TravelLikeExample;
import com.lvcong.emprise.bean.TravelLikeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TravelLikeMapper {
    long countByExample(TravelLikeExample example);

    int deleteByExample(TravelLikeExample example);

    int deleteByPrimaryKey(TravelLikeKey key);

    int insert(TravelLikeKey record);

    int insertSelective(TravelLikeKey record);

    List<TravelLikeKey> selectByExample(TravelLikeExample example);

    int updateByExampleSelective(@Param("record") TravelLikeKey record, @Param("example") TravelLikeExample example);

    int updateByExample(@Param("record") TravelLikeKey record, @Param("example") TravelLikeExample example);
}