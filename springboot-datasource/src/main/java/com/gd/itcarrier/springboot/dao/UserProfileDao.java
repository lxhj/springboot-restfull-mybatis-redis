package com.gd.itcarrier.springboot.dao;

import com.solo.springcloud.commons.entities.UserProfile;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserProfileDao {
    int deleteByPrimaryKey(Integer id);

    int insert(UserProfile record);

    int insertSelective(UserProfile record);

    UserProfile selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserProfile record);

    int updateByPrimaryKey(UserProfile record);
}
