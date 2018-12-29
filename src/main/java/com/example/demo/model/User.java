package com.example.demo.model;

import java.util.Date;

public class User{

    private int userid;
    private String userName;
    private String sex;
    private String password;
    private int wrong_count;
    private Date last_login_time;
    public User(){
    }
    
    public int getUserid(){
        return userid;
    }
    
    public void setUserid(int userid){
        this.userid = userid;
    }
    
    public String getUserName(){
        return userName;
    }
    
    public void setUserName(String userName){
        this.userName = userName;
    }
    
    public String getSex(){
        return sex;
    }
    
    public void setSex(String sex){
        this.sex = sex;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }

    
    public int getWrong_count(){
        return wrong_count;
    }

    
    public void setWrong_count(int wrong_count){
        this.wrong_count = wrong_count;
    }

    
    public Date getLast_login_time(){
        return last_login_time;
    }

    
    public void setLast_login_time(Date last_login_time){
        this.last_login_time = last_login_time;
    }

    @Override
    public String toString(){
        return "User [userid=" + userid + ", userName=" + userName + ", sex=" + sex + ", password=" + password + ", wrong_count=" + wrong_count + ", last_login_time=" + last_login_time + "]";
    }


    
    
    
    
    
}
