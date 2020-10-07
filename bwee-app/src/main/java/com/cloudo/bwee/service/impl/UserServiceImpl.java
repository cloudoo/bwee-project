package com.cloudo.bwee.service.impl;

import com.cloudo.bwee.domain.User;
import com.cloudo.bwee.repository.UserRepository;
import com.cloudo.bwee.service.UserService;
//import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
//属于Dubbo的@Service注解，非Spring
//@Service(version = "${bwee.service.version}",timeout = 10000,interfaceClass = UserService.class)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public User findById(Long id){

         User user = userRepository.findById(id).get();
         return user;
    }

    @Override
    public boolean add(User user) {
        if(!check(user.getName())){
            user = userRepository.save(user);
            return user.getId()!=null;
        }

        return false;
    }

    public boolean check(String name, String passwd) {
        User user = userRepository.findUserByName(name);
        if(user!=null){
            return user.getName().equals(name) && user.getPassword().equals(passwd);
        }
        return false;
    }

    @Override
    public boolean check(String name) {
        User user = userRepository.findUserByName(name);
        return user!=null;
    }
}
