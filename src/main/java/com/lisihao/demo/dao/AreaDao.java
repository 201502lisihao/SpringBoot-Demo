package com.lisihao.demo.dao;

import com.lisihao.demo.entity.Area;

import java.util.List;

public interface AreaDao {
    /**
     * 列出区域列表
     * @return areaList
     */
    List<Area> queryArea();

    /**
     * 根据Id列出其具体区域
     * @param areaId
     * @return
     */
    Area queryAreaById(int areaId);

    /**
     * 插入区域信息
     * @param area
     * @return
     */
    int insertArea(Area area);

    /**
     * 更新区域信息
     * @param area
     * @return
     */
    int updateArea(Area area);

    /**
     * 根据Id删除区域信息
     * @param areaId
     * @return
     */
    int deleteArea(int areaId);
}
