package com.dao.impl;

import com.dao.UserDAO;
import com.model.User;
import org.springframework.stereotype.Component;

@Component("u")
public class UserDAOImpl implements UserDAO {

    public void save(User user) {
        System.out.println("user saved!");
    }

}
