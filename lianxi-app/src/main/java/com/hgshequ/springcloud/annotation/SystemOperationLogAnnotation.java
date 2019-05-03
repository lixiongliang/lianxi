package com.hgshequ.springcloud.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author : Sunny
 * @version V1.0
 * @Project: lianxi
 * @Package com.hgshequ.springcloud.annotation
 * @Description: TODO
 * @date Date : 2019年05月03日 15:39
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SystemOperationLogAnnotation {
    String value();
}
