package com.cloudo.bwee.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * 考试题目
 */
@Table(name = "bw_question")
@Entity
public class Question implements Serializable {

    public static int SELE_TYPE = 1;//选择题
    public static int FILL_TYPE = 2;//填空题

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;//题目内容
    private String answer;//答案
    @Column(name = "error_count")
    private int errorCount;// 错误次数
    private int source;// 出处，0- 1- 2-
    private int type;// 试题类型
    private int value;// 分值

    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinTable(name = "bw_question_kdg", joinColumns = {
            @JoinColumn(name = "question_id", foreignKey = @ForeignKey(name = "none", value = ConstraintMode.NO_CONSTRAINT))}, inverseJoinColumns = {
            @JoinColumn(name = "kdg_id", foreignKey = @ForeignKey(name = "none", value = ConstraintMode.NO_CONSTRAINT))})
    private Set<KeyPoint> topics;// 所属知识点

    private Date upTm;

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

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
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

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Set<KeyPoint> getTopics() {
        return topics;
    }

    public void setTopics(Set<KeyPoint> topics) {
        this.topics = topics;
    }

    public Date getUpTm() {
        return upTm;
    }

    public void setUpTm(Date upTm) {
        this.upTm = upTm;
    }
}
