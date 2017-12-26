package com.spring.cui.dao.mapper;

import com.spring.cui.dao.domain.Test;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by cjs
 * Date： 2017/12/19.
 * Time： 16:59.
 */
@Mapper
public interface TestMapper  {

      int addTest(Test test);
}
