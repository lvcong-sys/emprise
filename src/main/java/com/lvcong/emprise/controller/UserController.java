package com.lvcong.emprise.controller;

import cn.dev33.satoken.stp.StpUtil;
import cn.dev33.satoken.util.SaResult;
import com.lvcong.emprise.bean.SysUser;
import com.lvcong.emprise.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author Kobe
 * @Date 2023/3/3
 * @Version 1.0
 **/
@Controller
@RequestMapping("user")
public class UserController {
    @Resource
    private final UserService UserService;

    public UserController(com.lvcong.emprise.service.UserService userService) {
        UserService = userService;
    }

    /**
     * 用户登录后的主页
     *
     * @param model 模型
     * @return {@link String}
     */@RequestMapping("/index")
    public String toIndex(Model model){
         return "index";
    }


    /**
     * 登录
     *
     * @return {@link String}
     */@RequestMapping("/login")
    public String login(){
        return "/login";
    }

    /**
     * 做登录
     *
     * @param user 用户
     * @param request 请求
     * @return {@link String}
     */@RequestMapping("/doLogin")
    public String doLogin(SysUser user, HttpServletRequest request){
        boolean bl = UserService.findUser(user,request);
        if (bl){
            StpUtil.login(user.getUserId());
            return "redirect:index";
        }else {
            request.setAttribute("message","账号或密码错误");
            return "redirect:login";
        }
    }

    /**
     * 登出
     *
     * @return {@link String}
     */@RequestMapping("/logout")
    public String logout() {
        StpUtil.logout();
        return "redirect:/index";
    }

    /**
     * 注册
     *
     * @return {@link String}
     */@RequestMapping("/signup")
    public String signup(){
        return "/signup";
    }

    /**
     * 做注册
     *
     * @return {@link String}
     */@RequestMapping("/doSignup")
    public String doSignup(SysUser user,HttpServletRequest request){
         boolean bl = UserService.insert(user,request);
         if (bl){
            return "index";
         }else {
             return "redirect:/signup";
         }

    }

    @RequestMapping("/toDetail")
    public String toDetail(){
         return "/account-details";
    }


}
