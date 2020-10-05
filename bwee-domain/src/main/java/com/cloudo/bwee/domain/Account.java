package com.cloudo.bwee.domain;



import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by cloudpj on 2018-12-30.
 */
@Entity
@Table(name = "account")
public class Account implements Serializable {


    private Long id;
    private String name;
    private String password;
    private Date registerTm;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
