package com.cloudo.bwee.domain;

import com.cloudo.base.domain.BaseDomain;

import java.io.Serializable;
import java.util.Date;

public class KeyPoint extends BaseDomain implements Serializable {

    private Long id;
    private String subject;//科目
    private String content;//内容
    private int pageIndex;//哪一页
    private Date upTm;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Date getUpTm() {
        return upTm;
    }

    public void setUpTm(Date upTm) {
        this.upTm = upTm;
    }
}