package com.cloudo.bwee.repository;


import com.cloudo.bwee.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    User findUserByName(String name);
    List<User> findUserByNameContaining(String name);
}
