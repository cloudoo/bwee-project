package com.cloudo.bwee.controller;

import com.cloudo.bwee.domain.User;
import com.cloudo.bwee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by cloudpj on 20/10/7.
 */

@RestController
@RequestMapping(value="/users")
public class TestController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String addUser(@RequestBody User user){
        String message = "";
        Assert.hasText(user.getName(),"用户名不能为空");
        Assert.hasText(user.getPassword(),"密码不能为空");

        if(userService.add(user)){
            return "OK";
        }else{
            return "FAIL";
        }

    }

    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    public User getUser(@PathVariable Long id) {

        return userService.findById(id);

    }

//    @RequestMapping(value="/{user}/customers", method=RequestMethod.GET)
//    List<User> getUserCustomers(@PathVariable Long user) {
//        return null;
//    }

    @RequestMapping(value="/{user}", method=RequestMethod.DELETE)
    public User deleteUser(@PathVariable Long user) {
        return null;
    }
}
