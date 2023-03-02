package com.lvcong.emprise.service.impl;

import com.lvcong.emprise.bean.SysUser;
import com.lvcong.emprise.bean.SysUserExample;
import com.lvcong.emprise.mapper.SysUserMapper;
import com.lvcong.emprise.service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 系统用户(SysUser)表服务实现类
 *
 * @author makejava
 * @since 2023-03-02 13:32:56
 */
@Service
public class SysUserServiceImpl implements SysUserService {
    @Resource
    private final SysUserMapper sysUserMapper;

    public SysUserServiceImpl(SysUserMapper sysUserMapper) {
        this.sysUserMapper = sysUserMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    @Override
    public SysUser queryById(Long userId) {
        return this.sysUserMapper.selectByPrimaryKey(userId);
    }

    /**
     * 新增数据
     *
     * @param sysUser 实例对象
     * @return 实例对象
     */
    @Override
    public SysUser insert(SysUser sysUser) {
        this.sysUserMapper.insert(sysUser);
        return sysUser;
    }

    /**
     * 修改数据
     *
     * @param sysUser 实例对象
     * @return 实例对象
     */
    @Override
    public SysUser update(SysUser user, SysUserExample sysUser) {
        this.sysUserMapper.updateByExample(user,sysUser);
        return this.queryById(user.getUserId());
    }

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long userId) {
        return this.sysUserMapper.deleteByPrimaryKey(userId) > 0;
    }
}
