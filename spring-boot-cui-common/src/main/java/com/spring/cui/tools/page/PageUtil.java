package com.spring.cui.tools.page;


import com.spring.cui.fs.vo.PageInfo;

/**
 * Created by wenxin on 2015/12/30.
 */
public class PageUtil {

    public static int getStartIndex(int pageNo, int pageSize){
        if(pageNo <= 0 || pageSize <= 0)
            return 0;
        return (pageNo - 1) * pageSize;
    }

    public static PageInfo setPageInfo(PageInfo pageInfo, Integer totalCount, int pageNo, int pageSize){
        if(pageInfo == null || totalCount < 0 || pageNo < 0 || pageSize <= 0)
        return null;
        pageInfo.setCurrentPage(pageNo);
        pageInfo.setPageSize(pageSize);
        pageInfo.setTotalPage((int) (totalCount + pageSize - 1) / pageSize);
        pageInfo.setTotalRecord(totalCount);
        return pageInfo;
    }


}
