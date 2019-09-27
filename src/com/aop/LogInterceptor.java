package com.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogInterceptor {

    public void myMethod(){};


    public void before() {
        System.out.println("method before");
    }


    public void aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("method around start");
        pjp.proceed();
        System.out.println("method around end");
    }

    public void after() {
        System.out.println("method after");
    }
}
