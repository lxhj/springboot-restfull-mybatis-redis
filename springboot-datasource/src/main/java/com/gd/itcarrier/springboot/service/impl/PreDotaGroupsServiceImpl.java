package com.gd.itcarrier.springboot.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.gd.itcarrier.springboot.dao.PreDotaGroupsDao;
import com.gd.itcarrier.springboot.entity.PreDotaGroups;
import com.gd.itcarrier.springboot.service.PreDotaGroupsService;
@Service
public class PreDotaGroupsServiceImpl implements PreDotaGroupsService{

    @Resource
    private PreDotaGroupsDao preDotaGroupsDao;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return preDotaGroupsDao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PreDotaGroups record) {
        return preDotaGroupsDao.insert(record);
    }

    @Override
    public int insertSelective(PreDotaGroups record) {
        return preDotaGroupsDao.insertSelective(record);
    }

    @Override
    public PreDotaGroups selectByPrimaryKey(Integer id) {
        return preDotaGroupsDao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PreDotaGroups record) {
        return preDotaGroupsDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PreDotaGroups record) {
        return preDotaGroupsDao.updateByPrimaryKey(record);
    }

}
