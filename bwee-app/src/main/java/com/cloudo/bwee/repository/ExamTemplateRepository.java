package com.cloudo.bwee.repository;

import com.cloudo.bwee.domain.Exam;
import com.cloudo.bwee.domain.ExamTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamTemplateRepository extends JpaRepository<ExamTemplate,Long> {

}
