package com.example.demo.model;

public class User{

    private int userid;
    private String userName;
    private String sex;
    private String password;
    public User(){
    }
    public User(int userid, String userName, String sex, String password){
        super();
        this.userid = userid;
        this.userName = userName;
        this.sex = sex;
        this.password = password;
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
    @Override
    public String toString(){
        return "User [userid=" + userid + ", userName=" + userName + ", sex=" + sex + ", password=" + password + "]";
    }
    
    
    
}
