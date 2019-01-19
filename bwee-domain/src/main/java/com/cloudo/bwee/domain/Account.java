package com.cloudo.bwee.domain;

import com.cloudo.base.domain.BaseDomain;

import java.util.Date;

/**
 * Created by cloudpj on 2018-12-30.
 */
public class Account extends BaseDomain {

    private Long id;
    private String name;
    private String password;
    private Date registerTm;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getRegisterTm() {
        return registerTm;
    }

    public void setRegisterTm(Date registerTm) {
        this.registerTm = registerTm;
    }
}
