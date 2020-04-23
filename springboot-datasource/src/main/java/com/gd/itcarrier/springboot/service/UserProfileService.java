package com.gd.itcarrier.springboot.service;

import com.solo.springcloud.commons.entities.UserProfile;

public interface UserProfileService {


    int deleteByPrimaryKey(Integer id);

    int insert(UserProfile record);

    int insertSelective(UserProfile record);

    UserProfile selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserProfile record);

    int updateByPrimaryKey(UserProfile record);

}

