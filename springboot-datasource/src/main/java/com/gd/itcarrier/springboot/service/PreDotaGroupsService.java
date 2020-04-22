package com.gd.itcarrier.springboot.service;

import com.gd.itcarrier.springboot.entity.PreDotaGroups;
public interface PreDotaGroupsService{


    int deleteByPrimaryKey(Integer id);

    int insert(PreDotaGroups record);

    int insertSelective(PreDotaGroups record);

    PreDotaGroups selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PreDotaGroups record);

    int updateByPrimaryKey(PreDotaGroups record);

}
