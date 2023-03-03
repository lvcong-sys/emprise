//package com.lvcong.emprise.controller;
//
//import org.springframework.http.HttpRequest;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import javax.annotation.Resource;
//
///**
// * @ClassName UserController
// * @Description TODO
// * @Author Kobe
// * @Date 2023/3/3
// * @Version 1.0
// **/
//@Controller
//@RequestMapping("user")
//public class UserController {
//    @Resource
//    private final SysUserService sysUserService;
//
//    public UserController(SysUserService sysUserService) {
//        this.sysUserService = sysUserService;
//    }
//
//    @RequestMapping("/login")
//    public String login(){
//        return "/login";
//    }
//
//    @RequestMapping("/doLogin")
//    public String doLogin(SysUser user, HttpRequest request){
//        boolean bl = sysUserService.queryById();
//        return "/index";
//    }
//
//    @RequestMapping("/signup")
//    public String signup(){
//        return "/signup";
//    }
//
//    @RequestMapping("/doSignup")
//    public String doSignup(){
//        return "/index";
//    }
//}
