package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.manager.UserManager;
import com.example.demo.model.JsonResult;
import com.example.demo.model.User;



@RestController
public class UserController{

    @Autowired
    private UserManager userManager;
    
    @RequestMapping("/sayHello")
    public String login(){
        return "hello";
    }
    
    @RequestMapping(value = "user/{id}",method=RequestMethod.GET)
    public ResponseEntity<JsonResult> getUserById (@PathVariable(value = "id") Integer id){
        JsonResult r =new JsonResult();
        try{
            User user = userManager.getUserById(id);
            r.setResult(user);
            r.setStatus("ok");
        }catch (Exception e){
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return ResponseEntity.ok(r);
    }
}
