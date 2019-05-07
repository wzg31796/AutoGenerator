package com.wzg.service.impl;

import com.wzg.mapper.UserMapper;
import com.wzg.pojo.User;
import com.wzg.pojo.UserExample;
import com.wzg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class userServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    public User getUserById(Integer id) {
        UserExample userExample=new UserExample();
        UserExample.Criteria criteria=userExample.createCriteria();
        criteria.andIdEqualTo(id);

        List<User> userList=userMapper.selectByExample(userExample);

        if(userList!=null)
        {
            return userList.get(0);
        }
        return null;
    }
}
