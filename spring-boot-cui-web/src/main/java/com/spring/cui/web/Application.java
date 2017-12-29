package com.spring.cui.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;


/**
 * Created by cjs
 * Date： 2017/7/12.
 * Time： 11:30.
 */
@SpringBootApplication
@ServletComponentScan
@EnableScheduling
@ComponentScan("com.spring.cui")
@MapperScan("com.spring.cui.dao")
@EnableAsync
//@ImportResource(locations = "classpath:spring/spring-config.xml")
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }


}