package com.gd.itcarrier.springboot.dao;

import com.solo.springcloud.commons.entities.PreDotaLeague;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PreDotaLeagueDao {
    int deleteByPrimaryKey(Integer id);

    int insert(PreDotaLeague record);

    int insertSelective(PreDotaLeague record);

    PreDotaLeague selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PreDotaLeague record);

    int updateByPrimaryKey(PreDotaLeague record);
}
