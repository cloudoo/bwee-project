package com.cloudo.bwee.repository;

import com.cloudo.bwee.domain.Exam;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface ExamRepository extends CrudRepository<Exam,Long> {

    public  int insertQuestions(Long examId, List<Long> qIds);
    public  int deleteQuestions(Long examId, List<Long> qIds);

}
