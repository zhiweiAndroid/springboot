package com.example.springbootdemo.controller;

import com.example.springbootdemo.dto.User;
import com.example.springbootdemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class HelloWorld {
    @Autowired
    private IUserService iRegService;

    @RequestMapping(value ="/index", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
    @ResponseBody
    public String getHello() {
        return "Hello  SpringBoot!";
    }

    @RequestMapping(value = "/findalluser", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
    @ResponseBody
    List<User> findAllUser() {
        return   iRegService.findAllUser();
    }

    @RequestMapping(value = "/finduserbyid/{id}", method = RequestMethod.GET)
    @ResponseBody
    User findUserby(@PathVariable String id) {
        return   iRegService.findUserById(Long.valueOf(id));
    }

    @RequestMapping(value = "/createuser/{id}/{name}", method = RequestMethod.GET)
    @ResponseBody
    void createUser(@PathVariable String id,@PathVariable String name) {
        User user=new User();
        user.setId(id);
        user.setUsername(name);
       iRegService.createUser(user);
    }

    @RequestMapping(value = "/createuserpost", method = RequestMethod.POST)
    @ResponseBody
    void createUser(@RequestBody @Valid User req) {
        iRegService.createUser(req);
    }

}