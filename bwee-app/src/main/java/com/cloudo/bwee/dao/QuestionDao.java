package com.cloudo.bwee.dao;

import com.cloudo.bwee.domain.Question;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionDao {
    public int insert(Question question);
}
