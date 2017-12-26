package com.spring.cui.web.controller;

import com.spring.cui.fs.service.TestService;
import com.spring.cui.fs.vo.BaseResponseVo;
import com.spring.cui.fs.vo.TestVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
@RequestMapping(value = "/test")
public class TestController {
     @Autowired
     private TestService testService;


   /* @RequestMapping(value = "/index",method = {RequestMethod.POST, RequestMethod.GET})
    public BaseResponseVo test(TestVo user){
        log.info("我是测试啊");
        return testService.testMothed("",1);
    }
*/

    @RequestMapping(value = "/rest",method = {RequestMethod.POST, RequestMethod.GET})
    public @ResponseBody  void rest(TestVo user){
        log.info("我是测试");
    }

    @ApiOperation(value = "添加测试",notes = "test")
    @RequestMapping(value = "/add",method = {RequestMethod.POST, RequestMethod.GET})
    public @ResponseBody BaseResponseVo add(TestVo test){
        return testService.addTest(test);
    }

}
