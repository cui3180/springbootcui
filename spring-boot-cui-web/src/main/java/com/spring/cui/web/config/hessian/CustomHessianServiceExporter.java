package com.spring.cui.web.config.hessian;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.remoting.caucho.HessianServiceExporter;
import org.springframework.util.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
public class CustomHessianServiceExporter extends HessianServiceExporter {
    @Value("${api.token}")
    private String token;

    @Override
    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String value = request.getHeader("token");
        if(StringUtils.isEmpty(value) || !value.equals(token)){
            log.error("token error");
            return;
        }
        super.handleRequest(request, response);
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
