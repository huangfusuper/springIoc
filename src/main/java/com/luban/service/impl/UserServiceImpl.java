package com.luban.service.impl;

import com.luban.dao.UserDao;
import com.luban.service.UserService;

/**
 * @author 皇甫
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    /*public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }*/

    /*public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }*/

    public void find() {
        userDao.find();
    }
}
