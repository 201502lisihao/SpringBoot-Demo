package com.lisihao.demo.service;

import com.lisihao.demo.entity.Area;

import java.util.List;

public interface AreaService {
    /**
     * 获取区域列表
     * @return List<Area>
     */
    List<Area> getAreaList();

    /**
     * 根据area_id获取area信息
     * @param areaId
     * @return Area
     */
    Area getAreaById(int areaId);

    /**
     * 增加区域
     * @param area
     * @return Boolean
     */
    Boolean addArea(Area area);

    /**
     * 修改区域信息
     * @param area
     * @return Boolean
     */
    Boolean editArea(Area area);

    /**
     * 根据id删除区域
     * @param areaId
     * @return Boolean
     */
    Boolean deleteArea(int areaId);
}
