package com.cloudo.bwee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String index(){
        return "login";
    }

    @RequestMapping(value = "/home")
    public String home(){
        return "home";
    }
}
