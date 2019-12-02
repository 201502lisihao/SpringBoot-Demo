package com.lisihao.demo.service.impl;

import com.lisihao.demo.dao.AreaDao;
import com.lisihao.demo.entity.Area;
import com.lisihao.demo.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class AreaServiceImpl implements AreaService {
    @Autowired
    private AreaDao areaDao;

    @Override
    public List<Area> getAreaList() {
        return areaDao.queryArea();
    }

    @Override
    public Area getAreaById(int areaId) {
        return areaDao.queryAreaById(areaId);
    }

    //开启事务控制，抛出RuntimeException就回滚
    @Transactional
//    @Transactional(rollbackFor = Exception.class)
    @Override
    public Boolean addArea(Area area) {
        //空值判断，主要是AreaName不能为空
        if (area.getAreaName() != null && !"".equals(area.getAreaName())){
            //设置默认值
            area.setCreateTime(new Date());
            area.setLastEditTime(new Date());
            try {
                int effecedNum = areaDao.insertArea(area);
                if (effecedNum > 0){
                    return true;
                } else {
                  throw new RuntimeException("插入区域信息失败!");
                }
            }catch (Exception e){
                throw new RuntimeException("插入区域信息失败!" + e.getMessage());
            }
        } else {
            throw new RuntimeException("区域信息不能为空!");
        }
    }

    @Transactional
    @Override
    public Boolean editArea(Area area) {
        //空值判断，主要是areaId不能为空
        if (area.getAreaId() != null && area.getAreaId() > 0){
            //设置默认值
            area.setLastEditTime(new Date());
            try {
                int effecedNum = areaDao.updateArea(area);
                if (effecedNum > 0){
                    return true;
                } else {
                    throw new RuntimeException("更新区域信息失败!");
                }
            }catch (Exception e){
                throw new RuntimeException("更新区域信息失败!" + e.getMessage());
            }
        } else {
            throw new RuntimeException("区域Id不能为空!");
        }
    }

    @Transactional
    @Override
    public Boolean deleteArea(int areaId) {
        if (areaId > 0){
            try {
                int effectedNum = areaDao.deleteArea(areaId);
                if (effectedNum > 0){
                    return true;
                } else {
                    throw new RuntimeException("删除区域信息失败!");
                }
            } catch (Exception e){
                throw new RuntimeException("删除区域信息失败!" + e.getMessage());
            }
        } else {
            throw new RuntimeException("区域Id不能为空!");
        }
    }
}
