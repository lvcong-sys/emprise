package com.lvcong.emprise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName CommonController
 * @Description TODO
 * @Author Kobe
 * @Date 2023/3/5
 * @Version 1.0
 **/
@Controller
public class CommonController {

    /**
     * 跳转到主页
     *
     * @return {@link String}
     */@RequestMapping("/index")
    String toIndex(){
        return "index";
    }

    /**
     * 跳转到博客
     *
     * @return {@link String}
     */@RequestMapping("/blog")
    String toBlog(){
         return "/blog-sidebar";
    }

    /**
     * 跳转到联系也页面
     *
     * @return {@link String}
     */@RequestMapping("/contact")
    String toContact(){
         return "/contact";
    }

    /**
     * 关于我们
     *
     * @return {@link String}
     */@RequestMapping("/aboutUs")
    String toAboutUs(){
         return "/about";
    }

    /**
     * 跳转到景点页面
     *
     * @return {@link String}
     */@RequestMapping("/destination")
    String toDestination(){
         return "/destination";
    }
}
