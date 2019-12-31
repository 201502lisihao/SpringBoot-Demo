package com.lisihao.demo.dao;

import com.lisihao.demo.entity.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    void getUserList(){
        List<User> userList = userDao.getUserList();
        assertEquals(1, userList.size());
    }
}