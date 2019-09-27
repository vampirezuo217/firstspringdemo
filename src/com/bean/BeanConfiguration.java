package com.bean;

import com.dao.AccountDao;
import com.dao.impl.AccountDaoImpl;
import com.service.AccountService;
import com.service.impl.AccountServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 采用注解的方式来达到上述xml的配置(不常用）
 */
@Configuration
public class BeanConfiguration {

    @Bean
    public AccountDao accountDao() {
        return new AccountDaoImpl();
    }

    @Bean
    public AccountService accountService() {
        AccountServiceImpl bean = new AccountServiceImpl();
        //注入dao
        bean.setAccountDao(accountDao());

//        AccountServiceImpl bean = new AccountServiceImpl(accountDao());
        return bean;
    }
}
