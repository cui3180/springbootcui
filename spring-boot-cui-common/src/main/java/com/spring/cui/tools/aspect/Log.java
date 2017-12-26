package com.spring.cui.tools.aspect;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by cjs
 * Date： 2017/12/14.
 * Time： 15:29.
 */
@Documented
@Retention(RUNTIME)
@Target(METHOD)
public @interface Log {
    String value() default "我是日志注解";
}
