package com.example.mpdemo.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.mpdemo.mapper.UserMapper;
import com.example.mpdemo.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.management.Query;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/user/findAll")
    public List<User> find(){
        return userMapper.selectAllUserAndOrders();
        }
    @GetMapping("/user/find")
    public List<User> findByCond(){
        QueryWrapper<User> queryWrapper=new QueryWrapper();
        queryWrapper.eq("username","mimi");
        return userMapper.selectList(queryWrapper);
    }


    @PostMapping("/user")
    public String save(User user){
        int i =userMapper.insert(user);
        System.out.println(user);
        if (i>0){
            return "success!";
        }else{
            return "false!";
        }

    }
}
