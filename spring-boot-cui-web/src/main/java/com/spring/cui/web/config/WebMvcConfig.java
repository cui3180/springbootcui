/*
package com.spring.cui.web.config;

import com.spring.cui.web.interceptor.InterceptorTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


*/
/**
 * Created by sungang on 2016/12/15.
 *//*

@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {
    */
/**
     * 防止注入service 失败
     * @return
     *//*

    @Bean
    public HandlerInterceptor getMyInterceptor(){
        return new InterceptorTest();
    }
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 多个拦截器组成一个拦截器链
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用户排除拦截
        registry.addInterceptor(getMyInterceptor()).addPathPatterns("/test*/
/**");
        super.addInterceptors(registry);
    }
}
*/
