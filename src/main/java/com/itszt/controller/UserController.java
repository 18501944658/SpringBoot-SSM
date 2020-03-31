package com.itszt.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itszt.domain.User;
import com.itszt.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    @ResponseBody
    public PageInfo selectAll(Integer pageNum, Integer pageSize) {

        List<User> users = userService.selectAll();
        PageHelper.startPage(pageNum, pageSize);
        PageInfo<User> pageInfo = new PageInfo(users);
        return pageInfo;
    }

    @PostMapping("/save")
    @ResponseBody
    public void saveOne(@RequestBody User user) {
        System.out.println("user = " + user);
        userService.insertUser(user.getName(), user.getAge());
    }


    @GetMapping("/select")
    @ResponseBody
    public User getOne(Integer id) {

        System.out.println("id = " + id);
        User user = userService.getById(id);

        System.out.println("user = " + user);

        return user;
    }
}
