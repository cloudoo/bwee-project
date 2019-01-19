package com.cloudo.bwee.dao;

import com.cloudo.bwee.domain.Exam;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExamDao extends BaseDao<Exam>{


    public  int insertQuestions(@Param("examId")Long examId, @Param("qIds")List<Long> qIds);
    public  int deleteQuestions(@Param("examId")Long examId, @Param("qIds")List<Long> qIds);

}
