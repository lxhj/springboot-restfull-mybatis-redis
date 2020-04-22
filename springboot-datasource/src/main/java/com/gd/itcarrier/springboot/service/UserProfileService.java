package com.gd.itcarrier.springboot.service;

import com.gd.itcarrier.springboot.entity.UserProfile;

public interface UserProfileService {


    int deleteByPrimaryKey(Integer id);

    int insert(UserProfile record);

    int insertSelective(UserProfile record);

    UserProfile selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserProfile record);

    int updateByPrimaryKey(UserProfile record);

}

