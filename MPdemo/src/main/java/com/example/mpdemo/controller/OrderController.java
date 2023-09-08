package com.example.mpdemo.controller;

import com.example.mpdemo.entity.User;
import com.example.mpdemo.mapper.OrderMapper;
import com.example.mpdemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

        @Autowired
        private OrderMapper orderMapper;

        @GetMapping("/order/findAll")
        public List find(){
            List orders=orderMapper.selectAllOrdersAndUser();
            return orders;

        }
}
