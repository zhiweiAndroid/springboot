package com.example.springbootdemo.service.impl;

import com.example.springbootdemo.dto.User;
import com.example.springbootdemo.mapper.UserMapper;
import com.example.springbootdemo.service.IRegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IUserServiceImpl implements IRegService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void createUser(User user) {
        userMapper.createUser(user);
    }

    @Override
    public List<User> findAllUser() {
        return userMapper.findAllUser();
    }
}