package com.spring.cui.fs.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by cjs
 * Date： 2018/1/2.
 * Time： 15:15.
 */
@Data
public class LoginParaVo implements Serializable{
    private String clientId;
    private String userName;
    private String password;
    private String captchaCode;
    private String captchaValue;
}
