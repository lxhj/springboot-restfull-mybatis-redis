package com.gd.itcarrier.springboot.dao;

import com.gd.itcarrier.springboot.entity.PreDotaPlayer;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PreDotaPlayerDao {
    int deleteByPrimaryKey(Integer pid);

    int insert(PreDotaPlayer record);

    int insertSelective(PreDotaPlayer record);

    PreDotaPlayer selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(PreDotaPlayer record);

    int updateByPrimaryKey(PreDotaPlayer record);
}