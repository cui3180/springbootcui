/*package com.spring.cui.web.config.interceptor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

*//**
 * Created by cjs
 * Date： 2017/12/27.
 * Time： 10:41.
 *//*
@Configuration
public class InterceptorConfig {

    @Bean
    public HandlerInterceptor getMyInterceptor(){
        return new InterceptorTest();
    }

    @Bean
    public InterceptorRegistry interceptorRegistrationBean(){
        InterceptorRegistry interceptor =new InterceptorRegistry();
        interceptor.addInterceptor(getMyInterceptor()).addPathPatterns("*//**");
        return interceptor;
    }
}*/
