package com.spring.cui.tools.exception;

public enum ErrorCode {
    FAILURE(1, "失败"),
    ERROR_PARAMS(2, "请求参数错误"),
    ERROR_DB_EXCEPTION(3, "数据库操作异常");

    private int code;
    private String msg;

    ErrorCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
