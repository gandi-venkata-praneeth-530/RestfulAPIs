package com.praneeth.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    @ResponseBody
    public String greet(){
        return "welcome to my web app";
    }
    @RequestMapping("/about")
    public String about(){
        return "about my web app";
    }
}
