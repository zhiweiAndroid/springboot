package com.example.springbootdemo.mapper;

import com.example.springbootdemo.dto.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    /**
     * 新增用户
     * @param user
     */
    void createUser(User user);
    /**
     * 查询用户列表
     * @return
     */
//    @Select("select * from user")
    User findUserById(@Param("id") Long id);

    /**
     * 查询用户列表
     * @return
     */
    List<User> findAllUser();
}