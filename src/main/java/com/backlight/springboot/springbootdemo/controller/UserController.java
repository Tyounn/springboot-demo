package com.backlight.springboot.springbootdemo.controller;

import com.backlight.springboot.springbootdemo.Dao.User;
import com.backlight.springboot.springbootdemo.Dao.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserMapper userMapper;

    @RequestMapping("/listUser")
    public String listUser (Model model) {
        List<User> users = userMapper.findAll();
        model.addAttribute("users", users);
        return "listUsers";
    }
}
