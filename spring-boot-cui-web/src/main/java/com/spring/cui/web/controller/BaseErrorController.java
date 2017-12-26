package com.spring.cui.web.controller;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by cjs
 * Date： 2017/12/19.
 * Time： 15:26.
 * 全局错误返回页面
 */
@Controller
@RequestMapping(value = "error")
public class BaseErrorController implements ErrorController {

    @Override
    public String getErrorPath() {
        return "/err";
    }
    @RequestMapping
    public String error() {
        return getErrorPath();
    }
}
