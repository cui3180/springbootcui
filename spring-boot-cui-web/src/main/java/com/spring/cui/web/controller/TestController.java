package com.spring.cui.web.controller;

import com.spring.cui.fs.service.TestService;
import com.spring.cui.fs.vo.BaseResponseVo;
import com.spring.cui.fs.vo.TestVo;
import com.spring.cui.web.config.redis.RedisUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by cjs
 * Date： 2017/12/19.
 * Time： 16:15.
 */
@Slf4j
@Controller
@Api(description ="测试类A")
@RequestMapping(value = "/test")
public class TestController {
     @Autowired
     private TestService testService;
     @Autowired
     private RedisUtil redisUtil;


    @RequestMapping(value = "/index",method = {RequestMethod.POST, RequestMethod.GET})
    public @ResponseBody BaseResponseVo test(TestVo user){
        BaseResponseVo responseVo =new BaseResponseVo();
        log.info("redis 我是测试啊");
        //redisUtil.set("cuijinsong","111111111111111");
        Object cuijinsong = redisUtil.get("cuijinsong");
        log.info("redis test {}",cuijinsong);
        responseVo.setData(cuijinsong);
        responseVo.setIsSuccess(true);
        responseVo.setMessage("test success");
        return responseVo;
    }

    @RequestMapping(value = "/rest",method = {RequestMethod.POST, RequestMethod.GET})
    public @ResponseBody  void rest(TestVo user){
        log.info("我是测试");
    }

    @ApiOperation(value = "添加测试",notes = "test")
    @RequestMapping(value = "/add",method = {RequestMethod.POST, RequestMethod.GET})
    public @ResponseBody BaseResponseVo add(TestVo test){
        return testService.addTest(test);
    }

    @RequestMapping(value = "/love",method = {RequestMethod.POST, RequestMethod.GET})
    public String love(TestVo user){
        log.info("我是测试");
        return "/love";
    }
}
