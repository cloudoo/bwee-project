package com.cloudo.bwee.repository;

import com.cloudo.bwee.domain.KnowledgePoint;

import org.springframework.stereotype.Repository;

@Repository
public interface KnowledgeRepository {

    public int insert(KnowledgePoint knowledgePoint);
    public KnowledgePoint findById(Long id);
    public int delete(Long id);
    public int update(KnowledgePoint question);

}
