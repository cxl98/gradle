package com.easyarch.controller;

import com.easyarch.entity.User;
import com.easyarch.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    private User user=new User();
    @RequestMapping(value = "ok",method = RequestMethod.POST)
    public Object ok(String username,String password){
        user=userService.login(username, password);
        return user;
    }

    @RequestMapping("search")
    public Object search(){
        if (null==user){
            return null;
        }
        return user;
    }

    @RequestMapping(value = "addUser",method = RequestMethod.POST)
    public Object add(String id,String password){
        System.out.println("vvvvvvvv "+id);
        user.setUsername(id);
        user.setPassword(password);
//        int i = userService.addUser(user);
        if (1==1){
            return "ok";
        }
        return 0;
    }

    @RequestMapping(value = "isused",method = RequestMethod.POST)
    public String isUser(String id){
        System.out.println("isUser "+id);
        User byUsername = userService.findByUsername(0 + id);
        if (byUsername!=null){
            return "ok";
        }
        return "no";
    }


}
