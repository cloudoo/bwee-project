package com.cloudo.bwee.service;

import com.cloudo.bwee.domain.User;

public interface UserService {
        public boolean check(String name,String passwd);
        public User findById(String id);
}
