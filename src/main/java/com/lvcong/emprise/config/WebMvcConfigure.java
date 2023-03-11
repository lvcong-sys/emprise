package com.lvcong.emprise.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ClassName WebMvcConfigure
 * @Description TODO
 * @Author Kobe
 * @Date 2023/3/4
 * @Version 1.0
 **/
@Configuration
public class WebMvcConfigure implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //windows
        registry.addResourceHandler("/file/**").addResourceLocations("file:///E:/courseFile/");

    }
}
