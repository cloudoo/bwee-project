package com.cloudo.bwee.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value="/")
public class UserAuthController {

    @RequestMapping(value = "login.bw",method = RequestMethod.GET)
    public ModelAndView login() {
        return new ModelAndView("login");
    }

    @RequestMapping(value = "submit.bw",method = RequestMethod.POST)
    public ModelAndView submit(String username, String password, String testCode, boolean rememberMe, HttpServletRequest request) {
        return new ModelAndView("redirect:/home/index.bw");
    }

}
