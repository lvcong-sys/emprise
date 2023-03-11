package com.lvcong.emprise.service;

import com.lvcong.emprise.bean.SysUser;
import com.lvcong.emprise.bean.SysUserExample;
import org.springframework.http.HttpRequest;

import javax.servlet.http.HttpServletRequest;

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
     */boolean findUser(SysUser user,HttpServletRequest request);

    /**
     * 找到用户id
     *
     * @param id id
     * @return {@link SysUser}
     */SysUser findUserById(int id);

     /**
      * 找到用户例子
      *
      * @param sysUser 系统用户例子
      * @return {@link SysUser}
      */SysUser findUserByExample(SysUser sysUser);

     /**
      * 更新
      *
      * @param user 用户
      * @param request 请求
      * @return boolean
      */boolean update(SysUser user,HttpServletRequest request);

      /**
       * 插入
       *
       * @param user 用户
       * @param request 请求
       * @return boolean
       */boolean insert(SysUser user,HttpServletRequest request);

       /**
        * 删除
        *
        * @param user 用户
        * @return boolean
        */boolean delete(SysUser user,HttpServletRequest request);

        /**
         * 更新psw
         *
         * @param email 电子邮件
         * @param psw psw
         * @param request 请求
         * @return boolean
         */boolean updatePsw(String email, String psw, HttpServletRequest request);
}
