package com.gd.itcarrier.springboot.dao;

import com.solo.springcloud.commons.entities.PreDotaGame;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PreDotaGameDao {
    int deleteByPrimaryKey(Integer gid);

    int insert(PreDotaGame record);

    int insertSelective(PreDotaGame record);

    PreDotaGame selectByPrimaryKey(Integer gid);

    int updateByPrimaryKeySelective(PreDotaGame record);

    int updateByPrimaryKey(PreDotaGame record);
}
