package com.lisihao.demo.service;

import com.lisihao.demo.entity.User;

import java.util.List;

public interface UserService {
    /**
     * 获取所有用户
     * @return
     */
    List<User> getUserList();
}
