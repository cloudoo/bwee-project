package com.cloudo.bwee.service.impl;

import com.cloudo.bwee.domain.User;
import com.cloudo.bwee.repository.UserRepository;
import com.cloudo.bwee.service.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
//属于Dubbo的@Service注解，非Spring
@Service(version = "${bwee.service.version}",timeout = 10000,interfaceClass = UserService.class)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public User findById(String id){
          User user = userRepository.findById(Long.parseLong(id)).get();
         return user;
    }

    public boolean check(String name, String passwd) {

        User user = userRepository.findUserByName(name);
        if(user!=null){
            if(user.getName().equals(name)&&user.getPassword().equals(passwd)){
                return true;
            }
        }
        return false;
    }
}
