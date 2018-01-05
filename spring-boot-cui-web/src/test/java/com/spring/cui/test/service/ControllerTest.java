package com.spring.cui.test.service;

import com.spring.cui.fs.service.TestService;
import com.spring.cui.fs.vo.BaseResponseVo;
import com.spring.cui.test.AbstractBaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by cjs
 * Date： 2017/12/22.
 * Time： 14:51.
 */
public class ControllerTest extends AbstractBaseTest {

    @Autowired
    private TestService testService;
  
    @Test
    public  void test(){
        BaseResponseVo baseResponseVo = testService.testMothed("",2);
        System.out.println("2111111111111111");
    }

}
