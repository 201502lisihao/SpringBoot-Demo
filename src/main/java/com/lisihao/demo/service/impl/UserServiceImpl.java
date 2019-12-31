package com.lisihao.demo.service.impl;

import com.lisihao.demo.dao.UserDao;
import com.lisihao.demo.entity.User;
import com.lisihao.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getUserList(){
        return userDao.getUserList();
    }
}
