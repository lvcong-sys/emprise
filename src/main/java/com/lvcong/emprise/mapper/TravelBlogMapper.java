package com.lvcong.emprise.mapper;

import com.lvcong.emprise.bean.TravelBlog;
import com.lvcong.emprise.bean.TravelBlogExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TravelBlogMapper {
    long countByExample(TravelBlogExample example);

    int deleteByExample(TravelBlogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TravelBlog record);

    int insertSelective(TravelBlog record);

    List<TravelBlog> selectByExampleWithBLOBs(TravelBlogExample example);

    List<TravelBlog> selectByExample(TravelBlogExample example);

    TravelBlog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TravelBlog record, @Param("example") TravelBlogExample example);

    int updateByExampleWithBLOBs(@Param("record") TravelBlog record, @Param("example") TravelBlogExample example);

    int updateByExample(@Param("record") TravelBlog record, @Param("example") TravelBlogExample example);

    int updateByPrimaryKeySelective(TravelBlog record);

    int updateByPrimaryKeyWithBLOBs(TravelBlog record);

    int updateByPrimaryKey(TravelBlog record);
}