package com.lisihao.demo.service.impl;

import com.lisihao.demo.entity.User;
import com.lisihao.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    void getUserList() {
        List<User> userList = userService.getUserList();
        assertEquals(1,userList.size());
    }
}