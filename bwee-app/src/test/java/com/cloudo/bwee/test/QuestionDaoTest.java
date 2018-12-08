package com.cloudo.bwee.test;



import com.cloudo.bwee.dao.QuestionDao;



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

    }



}
