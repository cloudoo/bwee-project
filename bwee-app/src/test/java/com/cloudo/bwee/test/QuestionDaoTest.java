package com.cloudo.bwee.test;



import com.cloudo.bwee.repository.QuestionRepository;


import com.cloudo.bwee.domain.Question;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:/META-INF/spring/*.xml" })
public class QuestionDaoTest  {

    private static final Logger logger = LoggerFactory.getLogger(QuestionDaoTest.class);

    @Autowired
    private QuestionRepository dao;

    @Test
    public void testCRUD(){

        Question question = new Question();
        question.setContent("test");
        question.setErrorCount(1);
        question.setType(Question.SELE_TYPE);
        question = dao.save(question);

        Assert.assertTrue(question.getId()>0);

        Question q2 = dao.getOne(question.getId());

        Assert.assertEquals(question.getContent(),q2.getContent());

        dao.deleteById(question.getId());

        q2 = dao.getOne(question.getId());

        Assert.assertNull(q2);


    }

    @Test
    public void testQuery(){

    }



}
