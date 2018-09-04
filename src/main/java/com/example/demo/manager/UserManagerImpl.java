package com.example.demo.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDao;
import com.example.demo.model.User;

@Service
public class UserManagerImpl implements UserManager{
    
    @Autowired
    UserDao userDao;

    @Override
    public User getUserById(Integer id){
        // TODO Auto-generated method stub
        return userDao.getUserById(id);
    }

    @Override
    public User getUserByName(String name){
        // TODO Auto-generated method stub
        return userDao.getUserByName(name);
    }

}
