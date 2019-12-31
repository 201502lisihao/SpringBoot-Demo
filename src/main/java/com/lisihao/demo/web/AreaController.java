package com.lisihao.demo.web;

import com.lisihao.demo.entity.Area;
import com.lisihao.demo.service.AreaService;
import org.apache.coyote.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@Controller
//@ResponseBody
@RestController
//@RequestMapping("/superadmin")
/**
 * 对外提供area的增删改查方法
 */
public class AreaController {
    //单个实现类自动加载，多个实现类需要指定名字
    //@Qualifier("areaServiceImpl")
    @Autowired
    private AreaService areaService;

    @RequestMapping(value = "/listarea", method = RequestMethod.GET)
    private Map<String, Object> listArea(){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<Area> list = areaService.getAreaList();
        modelMap.put("areaList", list);
        return modelMap;
    }

    @RequestMapping(value = "/getareabyid", method = RequestMethod.GET)
    private Map<String, Object> getAreaById(int areaId){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        Area area = areaService.getAreaById(areaId);
        modelMap.put("area", area);
        return modelMap;
    }

    @RequestMapping(value = "/addarea", method = RequestMethod.GET)
    private Map<String, Object> addArea(String areaName, int priority){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        Area area = new Area();
        area.setAreaName(areaName);
        area.setPriority(priority);
        Boolean bool = areaService.addArea(area);
        modelMap.put("success", bool);
        return modelMap;
    }

//    //POST请求
//    @RequestMapping(value = "/addarea", method = RequestMethod.POST)
//    private Map<String, Object> addArea(@RequestBody Area area){
//        Map<String, Object> modelMap = new HashMap<String, Object>();
//        Boolean bool = areaService.addArea(area);
//        modelMap.put("success", bool);
//        return modelMap;
//    }

    @RequestMapping(value = "editarea", method = RequestMethod.GET)
    private Map<String, Object> editArea(int areaId, String areaName, int priority){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        Area area = new Area();
        area.setAreaId(areaId);
        area.setAreaName(areaName);
        area.setPriority(priority);
        Boolean bool = areaService.editArea(area);
        modelMap.put("success", bool);
        return modelMap;
    }

//    //POST请求
//    @RequestMapping(value = "/editarea", method = RequestMethod.POST)
//    private Map<String, Object> editArea(@RequestBody Area area){
//        Map<String, Object> modelMap = new HashMap<String, Object>();
//        Boolean bool = areaService.editArea(area);
//        modelMap.put("success", bool);
//        return modelMap;
//    }

    @RequestMapping(value = "deletearea", method = RequestMethod.GET)
    private Map<String, Object> deleteArea(int areaId){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        Boolean bool = areaService.deleteArea(areaId);
        modelMap.put("success", bool);
        return modelMap;
    }
}
