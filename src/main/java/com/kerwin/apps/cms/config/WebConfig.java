package com.kerwin.apps.cms.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author kerwin
 * @title: WebConfig
 * @projectName cms
 * @date 2019/11/13 - 16:39
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")    //运行同行的IP路径
                .allowedMethods("GET","POST","PUT","OPTIONS","DELETE","PATCH")
                .allowedHeaders("*")
                .allowCredentials(true)
                .maxAge(3600);

    }
}
