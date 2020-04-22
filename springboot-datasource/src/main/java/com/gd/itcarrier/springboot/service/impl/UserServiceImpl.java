package com.gd.itcarrier.springboot.service.impl;

import com.gd.itcarrier.springboot.dao.UserDao;
import com.solo.springcloud.commons.entities.User;
import com.gd.itcarrier.springboot.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * 业务逻辑实现类
 * @author yuzg
 */
@Service
public class UserServiceImpl implements UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAllUser() {
        return userDao.findAllUser();
    }

    @Override
    public User findUserById(Long id) {
        User user = userDao.findById(id);
        return user;
    }

    @Override
    public Long saveUser(User user) {
        return userDao.saveUser(user);
    }

    @Override
    public Long updateUser(User user) {
        Long let = userDao.updateUser(user);
        return let;
    }

    @Override
    public Long deleteUser(Long id) {
        Long let = userDao.deleteUser(id);
        return let;
    }

    @Override
    public User login(User user){
        User let = userDao.login(user);
        return let;
    }
}
