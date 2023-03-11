package com.lvcong.emprise.config;

import cn.dev33.satoken.stp.StpUtil;
import cn.dev33.satoken.thymeleaf.dialect.SaTokenDialect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;

/**
 * @ClassName SaTokenConfigure
 * @Description 实现对sa-token的配置
 * @Author Kobe
 * @Date 2023/3/4
 * @Version 1.0
 **/
@Configuration
public class SaTokenConfigure {

    /**
     * 获得sa牌方言
     *
     * @return {@link SaTokenDialect}
     */@Bean
    public SaTokenDialect getSaTokenDialect() {
        return new SaTokenDialect();
    }

    /**
//     * 配置thymeleaf静态var
//     * 为 Thymeleaf 注入全局变量，以便在页面中调用 Sa-Token 的方法
//     * @param viewResolver 视图解析器
//     */
//    @Autowired
//    private void configureThymeleafStaticVars(ThymeleafViewResolver viewResolver) {
//        viewResolver.addStaticVariable("stp", StpUtil.stpLogic);
//    }
}
