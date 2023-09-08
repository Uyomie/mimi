package com.example.mpdemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.List;

@TableName("t_order")
public class Order {

    private int id;
    @TableField(value = "order_name")
    private String ordertime;
    private float total;
    @TableField(exist = false)
    private User user;
    public int getId(){return id;}
    public void setId(int id){this.id=id;}
    public String getOrdertime(){return ordertime;}
    public void setOrdertime(String ordertime){this.ordertime=ordertime;}
    public float getTotal(){return total;}
    public void setTotal(float total){this.total=total;}

    public User getUser(){return user;}

    public void setUser(User user){this.user=user;}


}
