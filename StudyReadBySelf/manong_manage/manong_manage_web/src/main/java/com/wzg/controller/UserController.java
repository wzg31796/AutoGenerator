package com.wzg.controller;

import com.wzg.pojo.User;
import com.wzg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/user/{userid}")

    @ResponseBody
    public User getUserById(@PathVariable Integer userid)
    {
        User user=userService.getUserById(userid);
        return user;
    }
}
