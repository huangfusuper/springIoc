package com.luban.annotatethebook.dao.impl;

import com.luban.annotatethebook.anno.Repository;
import com.luban.annotatethebook.dao.UserDao;

/**
 * @author 皇甫
 */
@Repository
public class UserDaoImpl implements UserDao {
    public String findUser() {
        return "皇甫";
    }
}
