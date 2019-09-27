package com.demo;

import com.model.User;
import com.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.aop.MethodMatcher;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;

import java.lang.reflect.Method;

public class PointcutTest {

    @Test
    public void testPointcut() throws Exception {

        String expression = "execution(public * com.service..*.add(..))";

        AspectJExpressionPointcut pc = new AspectJExpressionPointcut();
        pc.setExpression(expression);

        MethodMatcher mm = pc.getMethodMatcher();

        Class<?> targetClass = UserService.class;
        Method method1 = targetClass.getMethod("add", User.class);
        Assert.assertTrue(mm.matches(method1, targetClass));

        Method method2 = targetClass.getMethod("init");
        Assert.assertFalse(mm.matches(method2, targetClass));


    }
}
