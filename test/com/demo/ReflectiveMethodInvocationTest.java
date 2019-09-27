//package com.demo;
//
//import com.aop.LogInterceptor;
//import com.service.UserService;
//import org.aopalliance.intercept.MethodInterceptor;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.springframework.aop.aspectj.*;
//import org.springframework.aop.framework.ReflectiveMethodInvocation;
//import org.springframework.aop.framework.adapter.MethodBeforeAdviceInterceptor;
//
//import java.lang.reflect.Method;
//import java.util.ArrayList;
//import java.util.List;
//
//public class ReflectiveMethodInvocationTest {
//
//    private MethodBeforeAdviceInterceptor beforeAdvice = null;
//    private AspectJAfterAdvice afterAdvice = null;
//    private AspectJAfterThrowingAdvice afterThrowingAdvice = null;
//    //目标对象
//    private UserService userService = null;
//    private LogInterceptor logInterceptor;
//
//
//    @Before
//    public void setUp() throws Exception {
//        userService = new UserService();
//        logInterceptor = new LogInterceptor();
//
////        beforeAdvice = new MethodBeforeAdviceInterceptor(
////                LogInterceptor.class.getMethod("before"),
////                null, (AspectInstanceFactory) logInterceptor);
//
//        afterAdvice = new AspectJAfterAdvice(
//                LogInterceptor.class.getMethod("after"),
//                null,
//                (AspectInstanceFactory) logInterceptor);
//
//    }
//
//    @Test
//    public void testMethodInvocation() throws Throwable {
//
//        Method targetMethod = UserService.class.getMethod("after");
//        //拦截器列表
//        List<MethodInterceptor> interceptors = new ArrayList<MethodInterceptor>();
////        interceptors.add(beforeAdvice);
//        interceptors.add(afterAdvice);
//        ReflectiveMethodInvocation mi = new ReflectiveMethodInvocation(userService,userService,targetMethod, new Object[0],null, interceptors);
//        mi.proceed();
//
//
//    }
//}
