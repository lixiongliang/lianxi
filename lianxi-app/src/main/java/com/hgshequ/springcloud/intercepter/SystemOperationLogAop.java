package com.hgshequ.springcloud.intercepter;

import com.hgshequ.springcloud.annotation.SystemOperationLogAnnotation;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author : Sunny
 * @version V1.0
 * @Project: lianxi
 * @Package com.hgshequ.springcloud.intercepter
 * @Description: TODO
 * @date Date : 2019年05月03日 15:42
 */
@Component
@Aspect
public class SystemOperationLogAop {

    @Pointcut("@annotation(com.hgshequ.springcloud.annotation.SystemOperationLogAnnotation)")
    public void annotationPoinCut(){
    }

    @After("annotationPoinCut()")
    public void after(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        SystemOperationLogAnnotation action = method.getAnnotation(SystemOperationLogAnnotation.class);
        System.out.println("注解式拦截 "+action.value());
    }

    @Before("execution(* com.hgshequ.springcloud.service.impl.*.*(..))")
    public void before(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法规则式拦截,"+method.getName());
    }

}
