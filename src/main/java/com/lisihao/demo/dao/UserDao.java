package com.lisihao.demo.dao;

import com.lisihao.demo.entity.User;

import java.util.List;

public interface UserDao {
    /**
     * 列出所有用户信息
     */
    List<User> getUserList();
}
