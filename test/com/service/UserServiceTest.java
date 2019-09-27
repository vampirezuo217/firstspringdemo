package com.service;

import com.model.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest {

    @Test
    public void testAdd() throws Exception {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        UserService service = (UserService)ctx.getBean("userService");
        System.out.println(service.getClass());
        service.init();
        service.add(new User());
        service.destroy();
        ctx.destroy();

    }

}
