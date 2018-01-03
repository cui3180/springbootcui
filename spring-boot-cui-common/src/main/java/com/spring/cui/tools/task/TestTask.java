package com.spring.cui.tools.task;

import com.spring.cui.fs.service.TestService;
import com.spring.cui.tools.aspect.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 定时任务
 * Created by cjs
 * Date： 2017/12/14.
 * Time： 17:11.
 */
@Component
public class TestTask {

    @Autowired
    private TestService testService;

    @Scheduled(cron = "0/10 * * * * ?")
    @Async
    @Log
    public void getTask() {
        System.out.println("执行:"+ new Date() + Thread.currentThread().getName());
    }
}
