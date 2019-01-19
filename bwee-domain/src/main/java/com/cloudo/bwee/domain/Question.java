package com.cloudo.bwee.domain;

import com.cloudo.base.domain.BaseDomain;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * 考试题目
 *
 */
public class Question extends BaseDomain implements Serializable {

    public static int SELE_TYPE= 1;//选择题
    public static int FILL_TYPE= 2;//填空题

    private Long id;
    private String content;
    private int errorCount;//错误次数
    private int source;//出处，0-   1-   2-
    private int type;//试题类型
    private Long topicId;
    private KeyPoint topic;//所属知识点
    private Date uptm;

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

    public Long getTopicId() {
        return topicId;
    }

    public void setTopicId(Long topicId) {
        this.topicId = topicId;
    }

    public KeyPoint getTopic() {
        return topic;
    }

    public void setTopic(KeyPoint topic) {
        this.topic = topic;
    }


    public Date getUptm() {
        return uptm;
    }

    public void setUptm(Date uptm) {
        this.uptm = uptm;
    }
}
