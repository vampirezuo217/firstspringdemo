package com.service.impl;

import com.dao.AccountDao;
import com.service.AccountService;

public class AccountServiceImpl implements AccountService {

    /**
     * 需要注入的对象
     */
    private AccountDao accountDao;

    /**
     * setter注入
     */
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public AccountServiceImpl(){
    }

    /**
     * 构造注入
     */
    public AccountServiceImpl(AccountDao accountDao){
        this.accountDao=accountDao;
    }


    @Override
    public void doSomething() {
        System.out.println("AccountServiceImpl#doSomething......");
        accountDao.addAccount();

    }
}
