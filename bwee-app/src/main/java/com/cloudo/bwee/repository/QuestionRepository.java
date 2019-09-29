package com.cloudo.bwee.repository;

import com.cloudo.bwee.domain.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question,Long> {


    List<Question> findByContentContains(String content);
    List<Question> findByContent(String content);

}
