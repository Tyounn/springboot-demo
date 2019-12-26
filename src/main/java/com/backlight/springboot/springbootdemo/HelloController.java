package com.backlight.springboot.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.Date;

@Controller
public class HelloController {
    @Autowired
    private UserProperties userProperties;

    @RequestMapping("/hello")
    public String hello (Model m) {
        m.addAttribute("now", DateFormat.getDateInstance().format(new Date()));
        return "hello";
    }
}
