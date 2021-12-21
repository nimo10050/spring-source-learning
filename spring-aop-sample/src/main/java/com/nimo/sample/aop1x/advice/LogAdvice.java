package com.nimo.sample.aop1x.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class LogAdvice implements MethodBeforeAdvice {

    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("-----记录日志-----");
        // method.invoke(o,objects);
    }

}
