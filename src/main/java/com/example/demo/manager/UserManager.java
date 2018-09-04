package com.example.demo.manager;

import com.example.demo.model.User;

public interface UserManager{

    User getUserById(Integer id);
    
    User getUserByName(String name);
}
