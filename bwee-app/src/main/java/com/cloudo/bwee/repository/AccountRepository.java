package com.cloudo.bwee.repository;

import com.cloudo.bwee.domain.Account;
import com.cloudo.bwee.domain.Question;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AccountRepository extends CrudRepository<Account,Long> {

    public List<Account> findAccountByName(String name);

}
