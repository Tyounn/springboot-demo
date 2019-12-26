package com.backlight.springboot.springbootdemo.Dao;

import lombok.Data;

import java.util.Date;
@Data
public class User {

    private Integer id;
    private String user_id;
    private String name;
    private Integer age;
    private String sex;
    private Date birthday;
}
