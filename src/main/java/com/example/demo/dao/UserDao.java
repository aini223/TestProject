package com.example.demo.dao;

import java.util.Date;

import javax.websocket.server.PathParam;

import org.apache.ibatis.annotations.Param;

import com.example.demo.model.User;

public interface UserDao{
    
    User getUserById(Integer id);
    
    User getUserByName(String name);
    
    void updateWrongCount(@Param("count")Integer count ,@Param("id")Integer id,@Param("date")Date date );
    
    void updateLastLoginTime(@Param("date")Date date ,@Param("id")Integer id);
    
    void updateWrongCountZero(@Param("id")Integer id);
    
    void logout(String name);
}

