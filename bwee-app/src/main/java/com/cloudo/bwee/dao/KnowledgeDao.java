package com.cloudo.bwee.dao;

import com.cloudo.bwee.domain.KnowledgeTopic;

import org.springframework.stereotype.Repository;

@Repository
public interface KnowledgeDao {

    public int insert(KnowledgeTopic knowledgeTopic);
    public KnowledgeTopic findById(Long id);
    public int delete(Long id);
    public int update(KnowledgeTopic question);

}
