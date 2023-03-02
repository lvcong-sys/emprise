package com.lvcong.emprise.service;

import com.lvcong.emprise.bean.SysUser;
import com.lvcong.emprise.bean.SysUserExample;

/**
 * 系统用户(SysUser)表服务接口
 *
 * @author makejava
 * @since 2023-03-02 13:32:54
 */
public interface SysUserService {

    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    SysUser queryById(Long userId);


    /**
     * 新增数据
     *
     * @param sysUser 实例对象
     * @return 实例对象
     */
    SysUser insert(SysUser sysUser);

    /**
     * 修改数据
     * @param user  修改前的对象
     * @param sysUser 实例对象
     * @return 实例对象
     */

    SysUser update(SysUser user, SysUserExample sysUser);

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 是否成功
     */
    boolean deleteById(Long userId);

}
