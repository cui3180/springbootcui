package com.spring.cui.tools.aspect;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by cjs
 * Date： 2017/12/15.
 * Time： 11:16.
 */
@Documented
@Retention(RUNTIME)
@Target(METHOD)
public @interface InterceptorAdmin {
    String value() default "拦截器注解";
}
