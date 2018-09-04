package com.example.demo.dao;

import com.example.demo.model.User;

public interface UserDao{
    
    User getUserById(Integer id);
    
    User getUserByName(String name);
}
