package com.spring.cui.fs.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by huangjun on 2017/4/10.
 */
@Data
public class PageInfo implements Serializable {
    private Integer currentPage;
    private Integer pageSize;
    private Integer totalRecord;
    private Integer totalPage;

}
