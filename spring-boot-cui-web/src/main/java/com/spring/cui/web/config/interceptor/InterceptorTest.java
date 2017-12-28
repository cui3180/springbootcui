package com.spring.cui.web.config.interceptor;

import com.alibaba.fastjson.JSONObject;
import com.spring.cui.fs.service.TestService;
import com.spring.cui.fs.vo.BaseResponseVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;


/**
 * Created by cjs
 * Date： 2017/12/15.
 * Time： 10:36.
 */
@Slf4j
public class InterceptorTest  implements HandlerInterceptor {


    @Autowired
    private TestService testServiceImpl;
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        BaseResponseVo baseResponseVo = testServiceImpl.testInterceptor(null);
        System.out.println("I AM InterceptorTest");
        baseResponseVo.setMessage("没有权限");
        PrintWriter writer=null;
        log.info("进入权限拦截器");
        if(!baseResponseVo.isSuccess()){
            try {
                httpServletResponse.setContentType("text/html;charset=UTF-8");
                writer = httpServletResponse.getWriter();
                writer.print(JSONObject.toJSONString(baseResponseVo));
            }catch (Exception e){

            }finally {
                writer.close();
            }
        }
        return baseResponseVo.isSuccess();
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
