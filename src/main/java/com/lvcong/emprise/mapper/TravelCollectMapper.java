package com.lvcong.emprise.mapper;

import com.lvcong.emprise.bean.TravelCollectExample;
import com.lvcong.emprise.bean.TravelCollectKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TravelCollectMapper {
    long countByExample(TravelCollectExample example);

    int deleteByExample(TravelCollectExample example);

    int deleteByPrimaryKey(TravelCollectKey key);

    int insert(TravelCollectKey record);

    int insertSelective(TravelCollectKey record);

    List<TravelCollectKey> selectByExample(TravelCollectExample example);

    int updateByExampleSelective(@Param("record") TravelCollectKey record, @Param("example") TravelCollectExample example);

    int updateByExample(@Param("record") TravelCollectKey record, @Param("example") TravelCollectExample example);
}