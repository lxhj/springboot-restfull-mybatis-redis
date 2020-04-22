package com.gd.itcarrier.springboot.dao;

import com.gd.itcarrier.springboot.entity.PreDotaGroups;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PreDotaGroupsDao {
    int deleteByPrimaryKey(Integer id);

    int insert(PreDotaGroups record);

    int insertSelective(PreDotaGroups record);

    PreDotaGroups selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PreDotaGroups record);

    int updateByPrimaryKey(PreDotaGroups record);
}