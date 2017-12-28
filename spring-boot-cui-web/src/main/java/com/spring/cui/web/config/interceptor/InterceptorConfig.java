package com.spring.cui.web.config.interceptor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;

/**
 * Created by cjs
 * Date： 2017/12/27.
 * Time： 10:41.
 */
@Configuration
public class InterceptorConfig {

    @Bean
    public HandlerInterceptor getMyInterceptor(){
        return new InterceptorTest();
    }

    @Bean
    public InterceptorRegistration interceptorRegistrationBean(){
        InterceptorRegistration interceptor =new InterceptorRegistration(getMyInterceptor());
        interceptor.addPathPatterns("/**");
        return interceptor;
    }
}
