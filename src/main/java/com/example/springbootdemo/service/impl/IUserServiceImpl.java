package com.example.springbootdemo.service.impl;

import com.example.springbootdemo.dto.User;
import com.example.springbootdemo.mapper.UserMapper;
import com.example.springbootdemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IUserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public int createUser(User user) {
       return userMapper.createUser(user);
    }

    @Override
    public User findUserById(Long id) {
        return userMapper.findUserById(id);
    }

    @Override
    public List<User> findAllUser() {
        return userMapper.findAllUser();
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateUserInfo(User user) {
        return userMapper.updateByPrimaryKey(user);
    }
}