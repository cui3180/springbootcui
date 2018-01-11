package com.spring.cui.web.config.hessian;

import com.caucho.hessian.client.HessianProxy;
import com.caucho.hessian.client.HessianProxyFactory;
import com.caucho.hessian.io.HessianRemoteObject;

import java.lang.reflect.Proxy;
import java.net.URL;

/**
 * Created by huangjun on 2017/9/14.
 */
public class CustomHessianProxyFactory extends HessianProxyFactory {
    private String token;
    private int readTimeOut = 3000;
    private int connectTimeOut = 30000;
    private int poolMaxSize = 20;

    @Override
    public Object create(Class<?> api, URL url, ClassLoader loader) {
        if(api == null) {
            throw new NullPointerException("api must not be null for HessianProxyFactory.create()");
        } else {
            HessianProxy handler = null;
            handler = new CustomHessianProxy(url, this, api,token);
            return Proxy.newProxyInstance(loader, new Class[]{api, HessianRemoteObject.class}, handler);
        }
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getReadTimeOut() {
        return readTimeOut;
    }

    public void setReadTimeOut(int readTimeOut) {
        this.readTimeOut = readTimeOut;
    }

    public int getConnectTimeOut() {
        return connectTimeOut;
    }

    public void setConnectTimeOut(int connectTimeOut) {
        this.connectTimeOut = connectTimeOut;
    }

    public int getPoolMaxSize() {
        return poolMaxSize;
    }

    public void setPoolMaxSize(int poolMaxSize) {
        this.poolMaxSize = poolMaxSize;
    }
}
