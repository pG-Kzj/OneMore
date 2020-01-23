package com.onemore.portal.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.onemore.portal.entity.User;
import com.onemore.portal.mapper.UserMapper;
import com.onemore.portal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String mobile, String password) {
        return userMapper.login(mobile, password);
    }


    @Override
    public User selectByIds(Integer... ids) {
        System.out.println(ids);
        return null;
    }


}
