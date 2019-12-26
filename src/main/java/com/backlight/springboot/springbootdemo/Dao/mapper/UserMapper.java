package com.backlight.springboot.springbootdemo.Dao.mapper;

import com.backlight.springboot.springbootdemo.Dao.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface UserMapper {
    @Select("select * from user")
    List<User> findAll();
}
