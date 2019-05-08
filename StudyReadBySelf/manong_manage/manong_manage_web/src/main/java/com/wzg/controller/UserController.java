package com.wzg.controller;

import com.wzg.pojo.User;

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
