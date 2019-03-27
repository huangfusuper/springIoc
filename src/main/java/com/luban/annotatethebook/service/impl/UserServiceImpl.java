package com.luban.annotatethebook.service.impl;

import com.luban.annotatethebook.anno.Autowired;
import com.luban.annotatethebook.anno.Service;
import com.luban.annotatethebook.dao.UserDao;
import com.luban.annotatethebook.service.UserService;

/**
 * 用户业务类
 * @author 皇甫
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    /**
     * 查询方法
     * @return
     */
    public String findUser() {
        return userDao.findUser();
    }


}
