package com.spring.cui.fs.vo;

import java.io.Serializable;
import java.util.Set;

/**
 * Created by wenxin on 2015/12/29.
 */
public class BaseResponseVo<T>  implements Serializable {
    /**
     * 调用成功标识 true/false
     */
    protected boolean isSuccess;

    /**
     * 错误描述
     */
    protected String message;

    /**
     * 错误编码
     */
    protected int errorCode;

    /**
     * 返回数据
     */
    protected T data;

    /**
     * 处理异常的数据集合
     */
    protected /*transient*/ Set<String> errStrSet;

    /**
     * 分页
     */
    protected PageInfo pageInfo;

    private String requestId;

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public Set<String> getErrStrSet() {
        return errStrSet;
    }

    public void setErrStrSet(Set<String> errStrSet) {
        this.errStrSet = errStrSet;
    }

    public BaseResponseVo(){}

    public BaseResponseVo(boolean isSuccess, int errCode, String msg){
        this.isSuccess = isSuccess;
        this.errorCode = errCode;
        this.message = msg;
    }

    public BaseResponseVo(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }
    public void setSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public String toString() {
        return "BaseResponseVo{" +
                "isSuccess=" + isSuccess +
                ", message='" + message + '\'' +
                ", errorCode=" + errorCode +
                ", data=" + data +
                ", errStrSet=" + errStrSet +
                ", pageInfo=" + pageInfo +
                ", requestId=" + requestId +
                '}';
    }
    public BaseResponseVo<T> requestId(String requestId){
        this.requestId = requestId;
        return this;
    }
}
