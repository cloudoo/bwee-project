package com.cloudo.bwee.service;

import com.cloudo.bwee.domain.User;

public interface UserService {
        /**
         * 验证用户密码是否正确
         * @param name
         * @param passwd
         * @return
         */
        boolean check(String name, String passwd);

        /**
         * 该用户名是否存在
         * @param name
         * @return
         */
        boolean check(String name);
        User findById(Long id);
        boolean add(User user);
}
