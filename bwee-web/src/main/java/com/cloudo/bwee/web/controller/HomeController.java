package com.cloudo.bwee.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/home")
public class HomeController {


    @RequestMapping(value = "/index.bw",method = RequestMethod.GET)
    public ModelAndView home(){
        return new ModelAndView("index");
    }

}
