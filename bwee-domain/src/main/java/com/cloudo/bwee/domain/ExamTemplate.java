package com.cloudo.bwee.domain;


import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * 考试试卷
 */
@Table(name="bw_exam_template")
@Entity
public class ExamTemplate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String subject;//科目
    /**
     * 考试题目
     */
    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.MERGE,
                    CascadeType.PERSIST
            })
    @JoinTable(name="bw_exam_template_question",
            joinColumns = {@JoinColumn
                    (name="exam_template_id",
                    foreignKey = @ForeignKey(name = "none",value = ConstraintMode.NO_CONSTRAINT))
            },
            inverseJoinColumns = {@JoinColumn(name="question_id",foreignKey = @ForeignKey(name = "none",value = ConstraintMode.NO_CONSTRAINT))})
    private Set<Question> questions;

    /**
     * 考试时间(分钟)
     */
    private float time;

    @Column(name="up_tm")
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

    public Date getUpTm() {
        return upTm;
    }

    public void setUpTm(Date upTm) {
        this.upTm = upTm;
    }

    public Set<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(Set<Question> questions) {
        this.questions = questions;
    }

    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
    }


}
