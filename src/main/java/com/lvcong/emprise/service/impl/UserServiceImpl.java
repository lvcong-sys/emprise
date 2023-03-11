package com.lvcong.emprise.service.impl;

import cn.dev33.satoken.secure.SaSecureUtil;
import cn.hutool.core.date.DateUtil;
import com.lvcong.emprise.bean.SysUser;
import com.lvcong.emprise.bean.SysUserExample;
import com.lvcong.emprise.mapper.SysUserMapper;
import com.lvcong.emprise.service.UserService;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author Kobe
 */
@Service
public class UserServiceImpl implements UserService {
    private final SysUserMapper sysUserMapper;

    public UserServiceImpl(SysUserMapper sysUserMapper) {
        this.sysUserMapper = sysUserMapper;
    }

    /**
     * 找到用户
     * @param user    用户
     * @param request 请求
     * @return boolean
     *
     */
    @Override
    public boolean findUser(SysUser user, HttpServletRequest request) {
        SysUserExample userExample = new SysUserExample();
        SysUserExample.Criteria criteria = userExample.createCriteria();
        String psw = SaSecureUtil.md5(user.getPassword());
        criteria.andEmailEqualTo(user.getEmail());
        criteria.andPasswordEqualTo(psw);
        List<SysUser> userList = sysUserMapper.selectByExample(userExample);
        user.setUserId(userList.get(0).getUserId());
        try{
            if (userList.size()>0){
                return true;
            }else {
                request.setAttribute("message","邮箱或密码错误！");
            }
        }catch (Exception e){
            e.printStackTrace();
            request.setAttribute("message","发生错误，请联系管理员！");
            return false;
        }
        return false;
    }

    /**
     * 找到用户id
     *
     * @param id id
     * @return {@link SysUser}
     */
    @Override
    public SysUser findUserById(int id) {
        SysUserExample sysUserExample = new SysUserExample();
        SysUserExample.Criteria criteria = sysUserExample.createCriteria();
        sysUserExample.setDistinct(true);
        return null;
    }

    /**
     * 找到用户例子
     *
     * @param sysUser 系统用户例子
     * @return {@link SysUser}
     */
    @Override
    public SysUser findUserByExample(SysUser sysUser) {
        SysUserExample sysUserExample = new SysUserExample();
        SysUserExample.Criteria criteria = sysUserExample.createCriteria();
        criteria.andEmailEqualTo(sysUser.getEmail());
        sysUserExample.setDistinct(true);
        return sysUserMapper.selectByExample(sysUserExample).get(0);
    }

    /**
     * 更新
     *
     * @param user    用户
     * @param request 请求
     * @return boolean
     */
    @Override
    public boolean update(SysUser user, HttpServletRequest request) {
        return false;
    }

    /**
     * 插入
     *
     * @param user 用户
     * @return boolean
     */
    @Override
    public boolean insert(SysUser user,HttpServletRequest request) {
        String psw = SaSecureUtil.md5(user.getPassword());
        user.setPassword(psw);
        user.setCreateTime(DateUtil.date());
        user.setDeptId(8L);
        user.setUsername("user"+user.getEmail());
        user.setGender("男");
        user.setIsAdmin(false);
        if (sysUserMapper.insertSelective(user)>0){
            return true;
        }else {
            request.setAttribute("message","注册出错");
            return false;
        }
    }

    /**
     * 删除
     *
     * @param user 用户
     * @return boolean
     */
    @Override
    public boolean delete(SysUser user,HttpServletRequest request) {
        return false;
    }

    /**
     * 更新psw
     *
     * @param email   电子邮件
     * @param psw     psw
     * @param request 请求
     * @return boolean
     */
    @Override
    public boolean updatePsw(String email, String psw, HttpServletRequest request) {
        return false;
    }
}
