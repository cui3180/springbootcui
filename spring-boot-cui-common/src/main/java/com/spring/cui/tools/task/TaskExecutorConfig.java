package com.spring.cui.tools.task;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * Created by cjs
 * Date： 2017/12/14.
 * Time： 17:44.
 */


public class TaskExecutorConfig implements AsyncConfigurer {//实现AsyncConfigurer接口

@Bean
public Executor getAsyncExecutor() {
    //实现AsyncConfigurer接口并重写getAsyncExecutor方法，并返回一个ThreadPoolTaskExecutor，这样我们就获得了一个基于线程池TaskExecutor
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(5);
        taskExecutor.setMaxPoolSize(10);
        taskExecutor.setQueueCapacity(25);
        taskExecutor.initialize();
        return taskExecutor;
        }

@Override
public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return null;
        }

        }