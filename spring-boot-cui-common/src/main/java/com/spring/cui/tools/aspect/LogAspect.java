package com.spring.cui.tools.aspect;

/**
 * Created by cjs
 * Date： 2017/12/14.
 * Time： 15:31.
 */
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Slf4j
@Component
@Aspect
public class LogAspect {
    @Pointcut("@annotation(com.spring.cui.tools.aspect.Log)")
    private void cut() {
    }
    @Before("cut()")
    public void methodBefore(JoinPoint joinPoint) {
        //ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        //HttpServletRequest request = requestAttributes.getRequest();
        //打印请求内容
       /* log.info("请求地址:" + request.getRequestURL().toString());
        log.info("请求方式:" + request.getMethod());*/
        log.info("Begin:" + joinPoint.getSignature() + "params:" + Arrays.toString(joinPoint.getArgs()));
    }
    //在方法执行完结后打印返回内容
    @AfterReturning(returning = "o", pointcut = "cut()")
    public void methodAfterReturing(JoinPoint joinPoint,Object o) {
        log.info("End:"+ joinPoint.getSignature() +"Returning："+ JSONObject.toJSONString(o));
    }

    @AfterThrowing( throwing="ex" , pointcut = "cut()")
    public void afterThrowing(JoinPoint joinPoint, Exception ex) {
        log.error("ERROR:"+ joinPoint.getSignature() +"MSG："+ ex);
    }

}
