package com.fh.config.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author xzg
 * @create 2020-12-01 下午 9:16
 */
@Configuration
public class CorsConfig extends WebMvcConfigurationSupport {

    @Autowired
    private CorsHandlerInterceptor corsHandlerInterceptor;


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(corsHandlerInterceptor).addPathPatterns("/**");
    }
}
