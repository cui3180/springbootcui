package com.spring.cui.fs.vo;

import lombok.Data;
import lombok.NonNull;

import java.util.Date;

/**
 * Created by cjs
 * Date： 2017/12/20.
 * Time： 16:41.
 */
@Data
public class TestVo extends PageInfo{
    private Long id ;

    private String name;

    private Integer sex;

    private Date createTime;

    private Date updateTime;
}
