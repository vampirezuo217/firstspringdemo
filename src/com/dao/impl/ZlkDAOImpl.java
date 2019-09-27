package com.dao.impl;

import com.dao.ZlkDAO;
import org.springframework.stereotype.Repository;

//@Repository注解便属于最先引入的一批，它用于将数据访问层 (DAO 层 ) 的类标识为 Spring Bean
@Repository
public class ZlkDAOImpl implements ZlkDAO {

    @Override public int addUser() {
        System.out.println("add user ......");
        return 6666;
    }

    @Override public void updateUser() {
        System.out.println("update user ......");

    }

    @Override public void deleteUser() {
        System.out.println("delete user ......");

    }

    @Override public void findUser() {
        System.out.println("find user ......");
    }
}
