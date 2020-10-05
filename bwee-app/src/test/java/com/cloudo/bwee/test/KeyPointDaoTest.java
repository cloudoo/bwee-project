package com.cloudo.bwee.test;


import com.cloudo.bwee.repository.KeyPointRepository;
import com.cloudo.bwee.domain.KeyPoint;
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
    private KeyPointRepository dao;

    @Test
    public void testCRUD(){

        KeyPoint keyPoint = new KeyPoint();
        keyPoint.setContent("test");
        keyPoint.setPageIndex(23);
        keyPoint.setSubject("math");
        keyPoint.setUpTm(new Date());
        keyPoint = dao.save(keyPoint);

        Assert.assertTrue(keyPoint.getId()>0);

        KeyPoint k2 = dao.findOne(keyPoint.getId());

        Assert.assertEquals(keyPoint.getContent(),k2.getContent());

        k2.setContent("test");
        k2.setContent("chinese");

        dao.save(k2);


        dao.delete(keyPoint.getId());

        k2 = dao.findOne(keyPoint.getId());

        Assert.assertNull(k2);


    }

    @Test
    public void testQuery(){

    }



}
