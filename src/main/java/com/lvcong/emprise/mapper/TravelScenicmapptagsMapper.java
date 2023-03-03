package com.lvcong.emprise.mapper;

import com.lvcong.emprise.bean.TravelScenicmapptagsExample;
import com.lvcong.emprise.bean.TravelScenicmapptagsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TravelScenicmapptagsMapper {
    long countByExample(TravelScenicmapptagsExample example);

    int deleteByExample(TravelScenicmapptagsExample example);

    int deleteByPrimaryKey(TravelScenicmapptagsKey key);

    int insert(TravelScenicmapptagsKey record);

    int insertSelective(TravelScenicmapptagsKey record);

    List<TravelScenicmapptagsKey> selectByExample(TravelScenicmapptagsExample example);

    int updateByExampleSelective(@Param("record") TravelScenicmapptagsKey record, @Param("example") TravelScenicmapptagsExample example);

    int updateByExample(@Param("record") TravelScenicmapptagsKey record, @Param("example") TravelScenicmapptagsExample example);
}