package com.itszt.service;

import com.itszt.domain.User;
import com.itszt.repositery.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDao userDao;

    @Override
    public List<User> selectAll() {
        return userDao.selectAll();
    }

    @Override
    public void insertUser(String name, int age) {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        user.setTime(LocalDateTime.now());
        userDao.insertUser(user);
    }

    @Override
    public User getById(Integer id) {
        return userDao.selectByPrimaryKey(id);
    }
}
