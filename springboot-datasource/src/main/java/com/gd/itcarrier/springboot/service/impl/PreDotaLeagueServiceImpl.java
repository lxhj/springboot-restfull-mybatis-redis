package com.gd.itcarrier.springboot.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.gd.itcarrier.springboot.dao.PreDotaLeagueDao;
import com.gd.itcarrier.springboot.entity.PreDotaLeague;
import com.gd.itcarrier.springboot.service.PreDotaLeagueService;
@Service
public class PreDotaLeagueServiceImpl implements PreDotaLeagueService{

    @Resource
    private PreDotaLeagueDao preDotaLeagueDao;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return preDotaLeagueDao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PreDotaLeague record) {
        return preDotaLeagueDao.insert(record);
    }

    @Override
    public int insertSelective(PreDotaLeague record) {
        return preDotaLeagueDao.insertSelective(record);
    }

    @Override
    public PreDotaLeague selectByPrimaryKey(Integer id) {
        return preDotaLeagueDao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PreDotaLeague record) {
        return preDotaLeagueDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PreDotaLeague record) {
        return preDotaLeagueDao.updateByPrimaryKey(record);
    }

}
