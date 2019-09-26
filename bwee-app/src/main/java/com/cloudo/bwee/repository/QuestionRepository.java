package com.cloudo.bwee.repository;

import com.cloudo.bwee.domain.Question;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository {
    public int insert(Question question);
    public Question findById(Long id);
    public int delete(Long id);
    public int update(Question question);

}
