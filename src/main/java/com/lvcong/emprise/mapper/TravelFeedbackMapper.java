package com.lvcong.emprise.mapper;

import com.lvcong.emprise.bean.TravelFeedback;
import com.lvcong.emprise.bean.TravelFeedbackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TravelFeedbackMapper {
    long countByExample(TravelFeedbackExample example);

    int deleteByExample(TravelFeedbackExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TravelFeedback record);

    int insertSelective(TravelFeedback record);

    List<TravelFeedback> selectByExampleWithBLOBs(TravelFeedbackExample example);

    List<TravelFeedback> selectByExample(TravelFeedbackExample example);

    TravelFeedback selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TravelFeedback record, @Param("example") TravelFeedbackExample example);

    int updateByExampleWithBLOBs(@Param("record") TravelFeedback record, @Param("example") TravelFeedbackExample example);

    int updateByExample(@Param("record") TravelFeedback record, @Param("example") TravelFeedbackExample example);

    int updateByPrimaryKeySelective(TravelFeedback record);

    int updateByPrimaryKeyWithBLOBs(TravelFeedback record);

    int updateByPrimaryKey(TravelFeedback record);
}