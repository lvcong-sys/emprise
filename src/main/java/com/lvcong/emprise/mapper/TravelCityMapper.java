package com.lvcong.emprise.mapper;

import com.lvcong.emprise.bean.TravelCity;
import com.lvcong.emprise.bean.TravelCityExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TravelCityMapper {
    long countByExample(TravelCityExample example);

    int deleteByExample(TravelCityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TravelCity record);

    int insertSelective(TravelCity record);

    List<TravelCity> selectByExample(TravelCityExample example);

    TravelCity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TravelCity record, @Param("example") TravelCityExample example);

    int updateByExample(@Param("record") TravelCity record, @Param("example") TravelCityExample example);

    int updateByPrimaryKeySelective(TravelCity record);

    int updateByPrimaryKey(TravelCity record);
}