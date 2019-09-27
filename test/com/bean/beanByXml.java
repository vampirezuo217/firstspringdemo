package com.bean;

import com.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Spring IOC 读取xml文件配置，通过利用反射技术帮助我们创建对应的类对象
 */
public class beanByXml {

    @Test
    public void testByXml() throws Exception {
        //加载配置文件  默认查找classpath路径下的文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        //默认为项目工作路径 即项目的根目录
        FileSystemXmlApplicationContext applicationContext1 = new FileSystemXmlApplicationContext("/src/resource/beans.xml");


        //也可以读取classpath下的文件
        FileSystemXmlApplicationContext applicationContext2 = new FileSystemXmlApplicationContext("classpath:/beans.xml");


//        AccountService accountService=applicationContext.getBean("accountService",AccountService.class);
        //多次获取并不会创建多个accountService对象,因为spring默认创建是单实例的作用域
        AccountService accountService = (AccountService) applicationContext.getBean("accountService");
        accountService.doSomething();
    }
}
