package com.lisihao.demo.web;

import com.lisihao.demo.entity.User;
import com.lisihao.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getUserList", method = RequestMethod.GET)
    public Map<String, Object> getUserList(){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<User> UserList = userService.getUserList();
        modelMap.put("user_list", UserList);
        return modelMap;
    }
}
