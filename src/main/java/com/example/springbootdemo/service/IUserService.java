package com.example.springbootdemo.service;

import com.example.springbootdemo.dto.User;

import java.util.List;

public interface IUserService {

    /**
     * 新增用户
     * @param user
     */
    void createUser(User user);
    /**
     * 查询用户列表
     * @return
     */
    User findUserById(Long id);
    /**
     * 查询用户列表
     * @return
     */
    List<User>findAllUser();

}