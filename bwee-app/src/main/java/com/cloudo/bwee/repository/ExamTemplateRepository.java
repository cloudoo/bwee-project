package com.cloudo.bwee.repository;

import com.cloudo.bwee.domain.ExamTemplate;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;


public interface ExamTemplateRepository extends JpaRepository<ExamTemplate,Long> {

    //public int insertQuestions(Long examId, List<Long> qIds);
    //public  int deleteQuestions(Long examId, List<Long> qIds);
}
