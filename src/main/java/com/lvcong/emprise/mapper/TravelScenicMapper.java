package com.lvcong.emprise.mapper;

import com.lvcong.emprise.bean.TravelScenic;
import com.lvcong.emprise.bean.TravelScenicExample;
import com.lvcong.emprise.bean.TravelScenicKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TravelScenicMapper {
    long countByExample(TravelScenicExample example);

    int deleteByExample(TravelScenicExample example);

    int deleteByPrimaryKey(TravelScenicKey key);

    int insert(TravelScenic record);

    int insertSelective(TravelScenic record);

    List<TravelScenic> selectByExample(TravelScenicExample example);

    TravelScenic selectByPrimaryKey(TravelScenicKey key);

    int updateByExampleSelective(@Param("record") TravelScenic record, @Param("example") TravelScenicExample example);

    int updateByExample(@Param("record") TravelScenic record, @Param("example") TravelScenicExample example);

    int updateByPrimaryKeySelective(TravelScenic record);

    int updateByPrimaryKey(TravelScenic record);
}