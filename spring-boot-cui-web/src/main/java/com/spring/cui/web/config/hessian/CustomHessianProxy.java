package com.spring.cui.web.config.hessian;

import com.caucho.hessian.client.HessianConnection;
import com.caucho.hessian.client.HessianProxy;
import com.caucho.hessian.client.HessianProxyFactory;

import java.net.URL;

/**
 * Created by huangjun on 2017/9/14.
 */
public class CustomHessianProxy extends HessianProxy {
    private String token;

    protected CustomHessianProxy(URL url, HessianProxyFactory factory) {
        super(url, factory);
    }

    protected CustomHessianProxy(URL url, HessianProxyFactory factory, Class<?> type, String token) {
        super(url, factory, type);
        this.token = token;
    }

    @Override
    protected void addRequestHeaders(HessianConnection conn) {
        conn.addHeader("token",token);
        super.addRequestHeaders(conn);
    }
}
