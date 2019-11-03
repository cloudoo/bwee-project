package com.cloudo.bwee.controller;

import com.cloudo.bwee.domain.User;
import com.cloudo.bwee.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/user")
public class UserController {

    @Reference(version = "${bwee.server.version}")
    private UserService userService;

    @RequestMapping(value = "/find/{id}",method = RequestMethod.GET)
    public User find(@PathVariable String id){

        User user = userService.findById(id);

      return user;
    }


}
