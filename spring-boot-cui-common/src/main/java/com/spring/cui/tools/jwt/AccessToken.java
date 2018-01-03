package com.spring.cui.tools.jwt;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by cjs
 * Date： 2018/1/2.
 * Time： 15:19.
 */
@Data
public class AccessToken implements Serializable{
    private String access_token;
    private String token_type;
    private long expires_in;
}
