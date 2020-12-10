package com.easyarch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class PageController {
    @RequestMapping("/login")
    public String login(){
        return "first/Login";
    }
}
