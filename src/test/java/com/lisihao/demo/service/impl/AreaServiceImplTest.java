package com.lisihao.demo.service.impl;

import com.lisihao.demo.entity.Area;
import com.lisihao.demo.service.AreaService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class AreaServiceImplTest {

    @Autowired
    @Qualifier("areaServiceImpl")
    private AreaService areaServiceImpl;

    @Test
    void getAreaList() {
        List<Area> areaList = areaServiceImpl.getAreaList();
        assertEquals(3, areaList.size());
    }

    @Test
    void getAreaById() {
        Area area = areaServiceImpl.getAreaById(1);
        assertEquals("area_one", area.getAreaName());
    }

    @Test
    void addArea() {
        Area area = new Area();
        area.setAreaName("test111");
        area.setPriority(2);
        Boolean result = areaServiceImpl.addArea(area);
        assertEquals(true, result);
    }

    @Test
    void editArea() {
        Area area =new Area();
        area.setAreaId(10);
        area.setAreaName("test222");
        Boolean result = areaServiceImpl.editArea(area);
        assertEquals(true, result);
    }

    @Test
    void deleteArea() {
        Boolean result = areaServiceImpl.deleteArea(10);
        assertEquals(true, result);
    }
}