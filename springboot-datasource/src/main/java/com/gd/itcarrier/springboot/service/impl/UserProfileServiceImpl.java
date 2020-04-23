package com.gd.itcarrier.springboot.service.impl;

import com.gd.itcarrier.springboot.dao.UserProfileDao;
import com.gd.itcarrier.springboot.service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.solo.springcloud.commons.entities.UserProfile;

@Service
public class UserProfileServiceImpl implements UserProfileService {

    @Autowired
    private UserProfileDao userProfileDao;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return userProfileDao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UserProfile record) {
        return userProfileDao.insert(record);
    }

    @Override
    public int insertSelective(UserProfile record) {
        return userProfileDao.insertSelective(record);
    }

    @Override
    public UserProfile selectByPrimaryKey(Integer id) {
        return userProfileDao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UserProfile record) {
        return userProfileDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UserProfile record) {
        return userProfileDao.updateByPrimaryKey(record);
    }

}


