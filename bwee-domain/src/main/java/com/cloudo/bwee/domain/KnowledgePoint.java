package com.cloudo.bwee.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * 知识考点
 */
@Table(name="bw_kdg_point")
@Entity
public class KnowledgePoint implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -6892576841046582736L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
