package com.example.demo.controller;

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
                model.addAttribute("success", "登录成功");
            }else{
                model.addAttribute("success", "登录失败，密码错误");
            }
        }else{
            model.addAttribute("success", "登录失败，用户名不存在");
        }
        
        return "login";
    }
}
