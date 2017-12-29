package com.spring.cui.web.config.interceptor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by cjs
 * Date： 2017/12/28.
 * Time： 10:15.
 */

@Configuration
public class InterConfig extends WebMvcConfigurerAdapter {


    @Bean
    public HandlerInterceptor getMyInterceptor(){
        return new InterceptorTest();
    }
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(getMyInterceptor()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }
 }

