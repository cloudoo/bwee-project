package com.cloudo.bwee.domain;

import java.io.Serializable;

/**
 *
 * 考试题目
 *
 */
public class Question implements Serializable {

    private Long id;
    private String content;
    private int errorCount;//错误次数
    private int source;//出处，0-   1-   2-
    private int type;//试题类型

    private KnowledgeTopic topic;//所属知识点


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(int errorCount) {
        this.errorCount = errorCount;
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public KnowledgeTopic getTopic() {
        return topic;
    }

    public void setTopic(KnowledgeTopic topic) {
        this.topic = topic;
    }




}
