package com.example.demo.manager;

import java.util.Date;

import com.example.demo.model.User;

public interface UserManager{

    User getUserById(Integer id);
    
    User getUserByName(String name);
    
    void updateWrongCount(Integer count ,Integer id,Date date);
    
    void updateLastLoginTime(Date date ,Integer id);
    
    void updateWrongCountZero(Integer id);
}
