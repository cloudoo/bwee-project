package com.cloudo.bwee.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "bw_user")
@Entity
public class User implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 34939466855634700L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String password;
    private int age;
    private String cellphone;
    private String email;
    @Column(name = "register_tm")
    private Date registerTm;// 注册时间

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public Date getRegisterTm() {
        return registerTm;
    }

    public void setRegisterTm(Date registerTm) {
        this.registerTm = registerTm;
    }
}
