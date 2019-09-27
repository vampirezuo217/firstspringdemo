package com.demo;

import com.aop.LogInterceptor;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.aop.config.MethodLocatingFactoryBean;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.lang.reflect.Method;

public class MethodLocatingFactoryTest {

    @Test
    public void testGetMethod() throws Exception{

        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        Resource resource = new ClassPathResource("beans.xml");
        reader.loadBeanDefinitions(resource);

        MethodLocatingFactoryBean methodLocatingFactory = new MethodLocatingFactoryBean();
        methodLocatingFactory.setTargetBeanName("logInterceptor");
        methodLocatingFactory.setMethodName("before");
        methodLocatingFactory.setBeanFactory(beanFactory);

        Method m = methodLocatingFactory.getObject();

        Assert.assertTrue(LogInterceptor.class.equals(m.getDeclaringClass()));
        Assert.assertTrue(m.equals(LogInterceptor.class.getMethod("before")));

    }
}
