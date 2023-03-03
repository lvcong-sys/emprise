package com.lvcong.emprise.mapper;

import com.lvcong.emprise.bean.TravelTours;
import com.lvcong.emprise.bean.TravelToursExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TravelToursMapper {
    long countByExample(TravelToursExample example);

    int deleteByExample(TravelToursExample example);

    int deleteByPrimaryKey(Integer toursId);

    int insert(TravelTours record);

    int insertSelective(TravelTours record);

    List<TravelTours> selectByExample(TravelToursExample example);

    TravelTours selectByPrimaryKey(Integer toursId);

    int updateByExampleSelective(@Param("record") TravelTours record, @Param("example") TravelToursExample example);

    int updateByExample(@Param("record") TravelTours record, @Param("example") TravelToursExample example);

    int updateByPrimaryKeySelective(TravelTours record);

    int updateByPrimaryKey(TravelTours record);
}