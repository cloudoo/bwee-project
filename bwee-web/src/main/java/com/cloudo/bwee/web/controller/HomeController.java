package com.cloudo.bwee.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class HomeController {


    @RequestMapping("/home.bw")
    public ModelAndView home(){

        return new ModelAndView("index");
    }

}
