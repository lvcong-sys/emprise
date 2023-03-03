package com.lvcong.emprise.service.impl;

import com.lvcong.emprise.bean.SysUser;
import org.springframework.http.HttpRequest;

/**
 * @author Kobe
 */
public interface UserService {
    /**
     * 找到用户
     *
     * @param user 用户
     * @param request 请求
     * @return boolean
     */boolean findUser(SysUser user,HttpRequest request);

    /**
     * 找到用户id
     *
     * @param id id
     * @return {@link SysUser}
     */SysUser findUserById(int id);

     /**
      * 更新
      *
      * @param user 用户
      * @return boolean
      */boolean update(SysUser user);

}
