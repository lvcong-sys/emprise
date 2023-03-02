package com.lvcong.emprise.mapper;

import com.lvcong.emprise.bean.TravelResource;
import com.lvcong.emprise.bean.TravelResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TravelResourceMapper {
    long countByExample(TravelResourceExample example);

    int deleteByExample(TravelResourceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TravelResource record);

    int insertSelective(TravelResource record);

    List<TravelResource> selectByExample(TravelResourceExample example);

    TravelResource selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TravelResource record, @Param("example") TravelResourceExample example);

    int updateByExample(@Param("record") TravelResource record, @Param("example") TravelResourceExample example);

    int updateByPrimaryKeySelective(TravelResource record);

    int updateByPrimaryKey(TravelResource record);
}