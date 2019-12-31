package com.lisihao.demo.dao;

import com.lisihao.demo.entity.Area;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class AreaDaoTest {
    @Autowired
    private AreaDao areaDao;

    @Test
    @Ignore
    public void queryArea(){
        List<Area> areaList= areaDao.queryArea();
        assertEquals(3, areaList.size());
    }

    @Test
    @Ignore
    public void queryAreaById(){
        Area area = areaDao.queryAreaById(1);
        assertEquals("area_one", area.getAreaName());
    }

    @Test
    @Ignore
    public void insertArea() {
        Area area = new Area();
        area.setAreaName("area_three");
        area.setPriority(1);
        int effectedNum = areaDao.insertArea(area);
        assertEquals(1, effectedNum);
    }

    @Test
    @Ignore
    public void updateArea() {
        Area area = new Area();
        area.setAreaId(4);
        area.setPriority(3);
        area.setAreaName("test3");
        int effectedNum = areaDao.updateArea(area);
        assertEquals(1, effectedNum);
    }

    @Test
    @Ignore
    public void deleteArea() {
        int result = areaDao.deleteArea(3);
        assertEquals(1, result);
    }
}