package com.cloudo.bwee.repository;

import com.cloudo.bwee.domain.KnowledgePoint;

import com.cloudo.bwee.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KnowledgeRepository extends JpaRepository<KnowledgePoint,Long> {

}
