package com.lvcong.emprise.mapper;

import com.lvcong.emprise.bean.TravelTag;
import com.lvcong.emprise.bean.TravelTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TravelTagMapper {
    long countByExample(TravelTagExample example);

    int deleteByExample(TravelTagExample example);

    int deleteByPrimaryKey(Integer tagId);

    int insert(TravelTag record);

    int insertSelective(TravelTag record);

    List<TravelTag> selectByExample(TravelTagExample example);

    TravelTag selectByPrimaryKey(Integer tagId);

    int updateByExampleSelective(@Param("record") TravelTag record, @Param("example") TravelTagExample example);

    int updateByExample(@Param("record") TravelTag record, @Param("example") TravelTagExample example);

    int updateByPrimaryKeySelective(TravelTag record);

    int updateByPrimaryKey(TravelTag record);
}