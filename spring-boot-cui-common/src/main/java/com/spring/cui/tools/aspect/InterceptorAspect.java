package com.spring.cui.tools.aspect;

import com.spring.cui.fs.service.TestService;
import com.spring.cui.fs.vo.BaseResponseVo;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by cjs
 * Date： 2017/12/15.
 * Time： 11:26.
 */
@Component
@Aspect
public class InterceptorAspect {
    @Pointcut("@annotation(com.spring.cui.tools.aspect.InterceptorAdmin)")
    private void cut() {
    }
    @Autowired
    private TestService testService;

    @Before("cut()")
    public void testAspect(JoinPoint joinPoint){
        System.out.print("++++++++++++++++++++++++++++++++++++++"+joinPoint.getSignature());
        BaseResponseVo baseResponseVo = testService.testInterceptor(null);

    }

}
