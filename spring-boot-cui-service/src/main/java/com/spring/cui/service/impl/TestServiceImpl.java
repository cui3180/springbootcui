package com.spring.cui.service.impl;

import com.spring.cui.dao.domain.Test;
import com.spring.cui.dao.mapper.TestMapper;
import com.spring.cui.fs.service.TestService;
import com.spring.cui.fs.vo.BaseResponseVo;
import com.spring.cui.fs.vo.TestVo;
import com.spring.cui.tools.aspect.Log;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by cjs
 * Date： 2017/12/20.
 * Time： 16:52.
 */
@Service("testService")
public class TestServiceImpl implements TestService{
    @Autowired
    private TestMapper testMapper;

    @Log
    @Override
    public BaseResponseVo testMothed(String ad , Integer type ) {
        BaseResponseVo baseResponseVo =new BaseResponseVo();
        baseResponseVo.setIsSuccess(true);
        baseResponseVo.setMessage("I AM TEST!");
        if(type == 1){
            throw  new RuntimeException("LOG TEST ERROR");
        }
        return baseResponseVo;
    }

    @Log
    @Override
    public BaseResponseVo testInterceptor(String str) {
        BaseResponseVo baseResponseVo =new BaseResponseVo();
        baseResponseVo.setIsSuccess(false);
        return baseResponseVo;
    }

    /**
     * addTest
     *
     * @param test
     * @return
     */
    @Log
    @Override
    public BaseResponseVo addTest(TestVo test) {
        BaseResponseVo responseVo =new BaseResponseVo();
        Test test1 =new Test();
        BeanUtils.copyProperties(test,test1);
        int i = testMapper.addTest(test1);
        responseVo.setIsSuccess(true);
        responseVo.setData(i);
        return responseVo;
    }


}
