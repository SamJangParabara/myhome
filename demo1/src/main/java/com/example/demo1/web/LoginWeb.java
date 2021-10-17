package com.example.demo1.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginWeb {
    @GetMapping
    public String loginMain(){
        return "loginPage/loginMain";
    }
}
