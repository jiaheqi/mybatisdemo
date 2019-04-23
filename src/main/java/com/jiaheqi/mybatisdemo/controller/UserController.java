package com.jiaheqi.mybatisdemo.controller;

import com.github.pagehelper.PageHelper;
import com.jiaheqi.mybatisdemo.entity.UserEntity;
import com.jiaheqi.mybatisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/userlist")
    public List<UserEntity> queryList(){
        PageHelper.startPage(1,2);
        return userService.queryList();

    }

    @RequestMapping("/queryUser")
    public UserEntity queryUserEntity(Long userId){
        UserEntity userEntity = userService.findById(userId);
        return userEntity;
    }

    @RequestMapping("/insertUser")
    public int insertUserEntity(){
        return userService.insertEntity();
    }

    @RequestMapping("/deleteUser")
    public int deleteUserEntity(){
        return userService.deleteEntity();
    }

    @RequestMapping("/updateUser")
    public int updateUserEntity(){
        return userService.updateEntity();
    }





}
