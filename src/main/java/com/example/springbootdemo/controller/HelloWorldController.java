package com.example.springbootdemo.controller;

import com.example.springbootdemo.dto.User;
import com.example.springbootdemo.dto.req.Id;
import com.example.springbootdemo.service.IUserService;
import com.snfq.base.dto.ResultDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
    @Autowired
    private IUserService iUserService;

    @RequestMapping(value ="/index", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
    @ResponseBody
    public ResultDTO<String> getHello() {
        return new ResultDTO<>(true,"项目启动成功");
    }

    @RequestMapping(value = "/findalluser", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
    @ResponseBody
    public ResultDTO<List<User>> findAllUser() {
        return   new ResultDTO<>(true,"查找成功",iUserService.findAllUser());
    }

    @RequestMapping(value = "/finduserbyid/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResultDTO<User> findUserby(@PathVariable String id) {
        return  new ResultDTO<>(true,"查找成功",iUserService.findUserById(Long.valueOf(id)));
    }

    @RequestMapping(value = "/createuser/{id}/{name}", method = RequestMethod.GET)
    @ResponseBody
    public ResultDTO<String>  createUser(@PathVariable String id,@PathVariable String name) {
        User user=new User();
        user.setId(id);
        user.setUsername(name);
       return new ResultDTO<>(true,"插入成功 count >>"+iUserService.createUser(user));
    }

    @RequestMapping(value = "/createuserpost", method = RequestMethod.POST)
    @ResponseBody
    public ResultDTO<String> createUser(@RequestBody @Valid User req) {
        int user = iUserService.createUser(req);
        if (user>0){
            return new ResultDTO<>(true,"数据插入成功 count >>"+user);
        }else {
            return new ResultDTO<>(true,"数据插入失败 count >>"+user);
        }
    }
    @RequestMapping(value = "/deletebyprimarykey", method = RequestMethod.POST)
    @ResponseBody
    ResultDTO<String> deleteByPrimaryKey(@RequestBody @Valid Id req){
        int count = iUserService.deleteByPrimaryKey(req.getId());
        if (count == 0) {
            return new ResultDTO<>(true,"数据删除失败 count >>"+count);
        }
        return new ResultDTO<>(true,"数据删除成功 count >>"+count);
    }

    @RequestMapping(value = "/updatebyprimarykey", method = RequestMethod.POST)
    @ResponseBody
    ResultDTO<String> updateUser(@RequestBody @Valid User req){
        int count = iUserService.updateUserInfo(req);
        if (count == 0) {
            return new ResultDTO<>(true,"更新数据失败 count >>"+count);
        }
        return new ResultDTO<>(true,"更新数据成功 count >>"+count);
    }
}