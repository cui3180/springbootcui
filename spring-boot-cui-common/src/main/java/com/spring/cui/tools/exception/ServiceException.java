package com.spring.cui.tools.exception;


public class ServiceException extends RuntimeException {
    private int code;
    private String msg;

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }


    public ServiceException(Integer errorCode, String errorMsg) {
        super(errorMsg);
        this.code = errorCode;
        this.msg = errorMsg;
    }

    public ServiceException(Integer errorCode, String errorMsg, Throwable throwable) {
        super(errorMsg, throwable);
        this.code = errorCode;
        this.msg = errorMsg;
    }

    @Deprecated
    public ServiceException(ErrorCode errorCode) {
        super(errorCode.getMsg());
        this.code = errorCode.getCode();
        this.msg = errorCode.getMsg();
    }

    @Deprecated
    public ServiceException(ErrorCode errorCode, Throwable throwable) {
        super(errorCode.getMsg(), throwable);
        this.code = errorCode.getCode();
        this.msg = errorCode.getMsg();
    }
}

