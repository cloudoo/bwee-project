package com.cloudo.bwee.repository;

import com.cloudo.bwee.domain.Exam;
import com.cloudo.bwee.domain.Question;
import org.springframework.data.repository.CrudRepository;

public interface QuestionRepository  extends CrudRepository<Question,Long> {

}
