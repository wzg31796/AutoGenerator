package com.wzg.controller;

import com.wzg.pojo.User;
import com.wzg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class IndexController {



    @RequestMapping("/")
    public String requestIndex()
    {
        return "index";
    }
}
