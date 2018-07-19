package com.example.springbootdemo.controller;

import com.example.springbootdemo.dto.User;
import com.example.springbootdemo.service.IRegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HelloWorld {
    @Autowired
    private IRegService iRegService;

    @RequestMapping(value ="/index", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
    @ResponseBody
    public String getHello() {
        return "Hello  SpringBoot!";
    }

//    @RequestMapping(value = "/finduserbyid/{id}", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
//    @ResponseBody
//    User finduserbyid(@RequestParam("id") Long id) {
//        regService.findUserByUserid(id);
//        return   regService.findUserByUserid(id);
//    }

    @RequestMapping(value = "/findalluser", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
    @ResponseBody
    List<User> findAllUser() {
        return   iRegService.findAllUser();
    }
}