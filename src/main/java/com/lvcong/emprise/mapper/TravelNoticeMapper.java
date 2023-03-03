package com.lvcong.emprise.mapper;

import com.lvcong.emprise.bean.TravelNotice;
import com.lvcong.emprise.bean.TravelNoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TravelNoticeMapper {
    long countByExample(TravelNoticeExample example);

    int deleteByExample(TravelNoticeExample example);

    int deleteByPrimaryKey(Integer noticeId);

    int insert(TravelNotice record);

    int insertSelective(TravelNotice record);

    List<TravelNotice> selectByExample(TravelNoticeExample example);

    TravelNotice selectByPrimaryKey(Integer noticeId);

    int updateByExampleSelective(@Param("record") TravelNotice record, @Param("example") TravelNoticeExample example);

    int updateByExample(@Param("record") TravelNotice record, @Param("example") TravelNoticeExample example);

    int updateByPrimaryKeySelective(TravelNotice record);

    int updateByPrimaryKey(TravelNotice record);
}