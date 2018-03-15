package com.spring.cui.fs.service;

import com.spring.cui.fs.vo.BaseResponseVo;
import com.spring.cui.fs.vo.TestVo;

/**
 * Created by cjs
 * Date： 2017/12/20.
 * Time： 16:17.
 */
public interface TestService {

    /**
     * 特特人
     * log test
     * @param ad
     * @param type
     * @return
     */
    BaseResponseVo testMothed(String ad , Integer type );


    /**
     * Interceptor
     * @param str
     * @return
     */
    BaseResponseVo testInterceptor (String str);

    /**
     * addTest
     * @param test
     * @return
     */
    BaseResponseVo addTest(TestVo test);
}
