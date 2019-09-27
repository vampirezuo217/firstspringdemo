package com.bean;

import com.service.AccountService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigurationAnnotation {

    @Test
    public void testByConfigurationAnnotation() throws Exception {

        AnnotationConfigApplicationContext config=new AnnotationConfigApplicationContext(BeanConfiguration.class);

        //名称必须BeanConfiguration中工程方法名称一致
        AccountService accountService= (AccountService) config.getBean("accountService");
        accountService.doSomething();

    }
}
