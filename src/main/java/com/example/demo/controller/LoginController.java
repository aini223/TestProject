package com.example.demo.controller;

import java.util.Date;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.manager.UserManager;
import com.example.demo.model.User;

@Controller
public class LoginController{
    
    @Autowired
    private UserManager userManager;
    
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
    
    @RequestMapping("/login")
    public String login(@PathParam(value = "name") String name,@PathParam(value = "psw") String psw,Model model){
        User user = userManager.getUserByName(name);
        if(!(null == user)){
            if(user.getPassword().equals(psw)){
                if(user.getWrong_count()>=3){
                    Date d = user.getLast_login_time();
                    Date nowdate = new Date();
                    if(nowdate.getTime() - d.getTime() < 1*60*1000){
                        model.addAttribute("success", "你已经连续错误3次");
                    }
                    else{
                        userManager.updateWrongCountZero(user.getUserid());
                        model.addAttribute("success", "登录成功");
                        model.addAttribute("User", user);
                        return "login";
                    }
                }
                else{
                    userManager.updateWrongCountZero(user.getUserid());
                    model.addAttribute("success", "登录成功");
                    model.addAttribute("User", user);
                    return "login";
                }
            }else{
                Integer count = user.getWrong_count();
                if(count >= 3){
                    model.addAttribute("success", "你已经连续错误3次");
                }else{
                    Date date = new Date();
                    count = count + 1;
                    userManager.updateWrongCount(count, user.getUserid(),date);
                    model.addAttribute("success", "登录失败，密码错误");
                }
            }
        }else{
            model.addAttribute("success", "登录失败，用户名不存在");
        }
        return "login";
    }
    
}
