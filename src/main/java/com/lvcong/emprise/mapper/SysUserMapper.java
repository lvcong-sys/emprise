package com.lvcong.emprise.mapper;

import com.lvcong.emprise.bean.SysUser;
import com.lvcong.emprise.bean.SysUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserMapper {
    /**
     * 计算实例
     *
     * @param example 例子
     * @return long
     */long countByExample(SysUserExample example);

    /**
     * 删除实例
     *
     * @param example 例子
     * @return int
     */int deleteByExample(SysUserExample example);

    /**
     * 按主键删除
     *
     * @param userId 用户id
     * @return int
     */int deleteByPrimaryKey(Long userId);

    /**
     * 插入
     *
     * @param record 记录
     * @return int
     */int insert(SysUser record);

    /**
     * 插入选择性
     *
     * @param record 记录
     * @return int
     */int insertSelective(SysUser record);

    /**
     * 选择例子
     *
     * @param example 例子
     * @return {@link List}<{@link SysUser}>
     */List<SysUser> selectByExample(SysUserExample example);

    /**
     * 选择通过主键
     *
     * @param userId 用户id
     * @return {@link SysUser}
     */SysUser selectByPrimaryKey(Long userId);

    /**
     * 只更新修改了的，要求所传回的实体类中的数据是需要被被修改的，应用比较广，我认为
     *
     * @param record 记录
     * @param example 例子
     * @return int
     */int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserExample example);

    /**
     * 更新例子
     *
     * @param record 记录
     * @param example 例子
     * @return int
     */int updateByExample(@Param("record") SysUser record, @Param("example") SysUserExample example);

    /**
     * 更新主键选择性
     *
     * @param record 记录
     * @return int
     */int updateByPrimaryKeySelective(SysUser record);

    /**
     * 根据主键来修改
     *
     * @param record 记录
     * @return int
     */int updateByPrimaryKey(SysUser record);
}