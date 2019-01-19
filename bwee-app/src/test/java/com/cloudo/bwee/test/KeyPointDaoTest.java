package com.cloudo.bwee.test;


import com.cloudo.bwee.dao.KeyPointDao;
import com.cloudo.bwee.dao.QuestionDao;
import com.cloudo.bwee.domain.KeyPoint;
import com.cloudo.bwee.domain.Question;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:/META-INF/spring/*.xml" })
public class KeyPointDaoTest {

    private static final Logger logger = LoggerFactory.getLogger(KeyPointDaoTest.class);

    @Autowired
    private KeyPointDao dao;

    @Test
    public void testCRUD(){

        KeyPoint keyPoint = new KeyPoint();
        keyPoint.setContent("test");
        keyPoint.setPageIndex(23);
        keyPoint.setSubject("math");
        keyPoint.setUpTm(new Date());
        int re = dao.insert(keyPoint);

        Assert.assertTrue(re>0);

        KeyPoint k2 = dao.findById(keyPoint.getId());

        Assert.assertEquals(keyPoint.getContent(),k2.getContent());

        k2.setContent("test");
        k2.setContent("chinese");

        dao.update(k2);


        dao.delete(keyPoint.getId());

        k2 = dao.findById(keyPoint.getId());

        Assert.assertNull(k2);


    }

    @Test
    public void testQuery(){

    }



}
