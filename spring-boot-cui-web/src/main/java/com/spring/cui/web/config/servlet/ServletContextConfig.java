package com.spring.cui.web.config.servlet;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * Created by cjs
 * Date： 2017/12/13.
 * Time： 15:30.
 */
@Configuration
public class ServletContextConfig extends WebMvcConfigurationSupport {


      /**
      * * 发现如果继承了WebMvcConfigurationSupport，则在yml中配置的相关内容会失效。
          * 需要重新指定静态资源
          * @param registry
          */
   @Override
   public void addResourceHandlers(ResourceHandlerRegistry registry) {
               registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
                registry.addResourceHandler("/swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");
                registry.addResourceHandler("/webjars/**")
               .addResourceLocations("classpath:/META-INF/resources/webjars/");
              super.addResourceHandlers(registry);
            }

    /**
       * 配置servlet处理
      */
   @Override
     public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
                configurer.enable();
             }
}
