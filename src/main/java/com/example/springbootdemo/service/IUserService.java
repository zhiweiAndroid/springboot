package com.example.springbootdemo.service;

import com.example.springbootdemo.dto.User;

import java.util.List;

public interface IUserService {

    /**
     * 新增用户
     * @param user
     */
    int createUser(User user);
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

    /**
     * 通过id删除用户
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 更新用户信息
     * @param user
     * @return
     */
    int updateUserInfo(User user);
}