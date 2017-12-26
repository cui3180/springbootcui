package com.spring.cui.dao.domain;

import lombok.Data;

import java.util.Date;

/**
 * Created by cjs
 * Date： 2017/12/19.
 * Time： 16:55.
 */
@Data
public class Test {

    private Long id ;

    private String name ;

    private Integer sex;

    private Date createTime;

    private Date updateTime;
}
