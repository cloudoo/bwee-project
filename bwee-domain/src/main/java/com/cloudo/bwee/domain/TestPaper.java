package com.cloudo.bwee.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class TestPaper implements Serializable {

    private Long id;
    /**
     * 考试题目
     */
    private List<Question> questions;
    private Date strDt;//开始时间
    private Date endDt;//结束时间

    private float score;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public Date getStrDt() {
        return strDt;
    }

    public void setStrDt(Date strDt) {
        this.strDt = strDt;
    }

    public Date getEndDt() {
        return endDt;
    }

    public void setEndDt(Date endDt) {
        this.endDt = endDt;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }
}
