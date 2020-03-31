package com.itszt.service;

import com.itszt.domain.User;

import java.util.List;

public interface UserService {
    List<User> selectAll();


    void insertUser(String name, int age);


    User getById(Integer id);
}
