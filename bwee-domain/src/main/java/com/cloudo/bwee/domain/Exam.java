package com.cloudo.bwee.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * 考试试卷
 */
@Table(name="bw_exam")
@Entity
public class Exam implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL,optional = true)
    @JoinColumn(name="template_id")
    private ExamTemplate examTemplate;

    @ManyToOne(cascade = CascadeType.ALL,optional = true)
    @JoinColumn(name="user_id")
    private User user;

    @Column(name="str_dt")
    private Date strDt;//开始时间
    @Column(name="end_dt")
    private Date endDt;//结束时间

    private float score;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ExamTemplate getExamTemplate() {
        return examTemplate;
    }

    public void setExamTemplate(ExamTemplate examTemplate) {
        this.examTemplate = examTemplate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
