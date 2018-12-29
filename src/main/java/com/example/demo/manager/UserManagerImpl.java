package com.example.demo.manager;

import java.util.Date;

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

    @Override
    public void updateWrongCount(Integer count ,Integer id,Date date){
        // TODO Auto-generated method stub
         userDao.updateWrongCount(count, id,date);
    }

    @Override
    public void updateLastLoginTime(Date date ,Integer id){
        // TODO Auto-generated method stub
         userDao.updateLastLoginTime(date, id);
    }

    @Override
    public void updateWrongCountZero(Integer id){
        // TODO Auto-generated method stub
        userDao.updateWrongCountZero(id);
    }

}
