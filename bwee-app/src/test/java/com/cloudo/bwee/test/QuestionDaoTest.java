package com.cloudo.bwee.test;



import com.cloudo.bwee.dao.QuestionDao;


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
    private QuestionDao dao;

    @Test
    public void testSelect(){




    }

    @Test
    public void testCRUD(){
        Question question = new Question();
        question.setContent("test");
        question.setErrorCount(1);
        question.setType(Question.SELE_TYPE);
        int re = dao.insert(question);

        Assert.assertTrue(re>0);

        Question q2 = dao.findById(question.getId());

        Assert.assertEquals(question.getContent(),q2.getContent());

        q2.setErrorCount(3);
        q2.setContent("leisy");
        re = dao.update(q2);

        Question q3 = dao.findById(question.getId());

        Assert.assertEquals(q2.getContent(),q3.getContent());
        Assert.assertEquals(q2.getErrorCount(),q3.getErrorCount());

        dao.delete(question.getId());

        q2 = dao.findById(question.getId());

        Assert.assertNull(q2);


    }



}
