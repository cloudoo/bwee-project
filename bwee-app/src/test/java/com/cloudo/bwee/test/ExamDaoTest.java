package com.cloudo.bwee.test;


import com.cloudo.bwee.repository.ExamRepository;
import com.cloudo.bwee.domain.Exam;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:/META-INF/spring/*.xml" })
public class ExamDaoTest {

    private static final Logger logger = LoggerFactory.getLogger(ExamDaoTest.class);

    @Autowired
    private ExamRepository dao;

    @Test
    public void testCRUD(){

        Exam exam = new Exam();
        exam.setDescription("啊哈哈");
        exam.setScore(34.4f);
        exam.setStrDt(new Date());
        exam.setEndDt(new Date());
        exam = dao.save(exam);

        Assert.assertTrue(exam.getId()>0);

        Exam q2 = dao.findOne(exam.getId());

        Assert.assertEquals(exam.getDescription(),q2.getDescription());

        dao.delete(exam.getId());

        q2 = dao.findOne(exam.getId());

        Assert.assertNull(q2);


        List<Long>  qIds = new ArrayList();
        qIds.add(12l);
        qIds.add(5l);
        qIds.add(3l);
        dao.insertQuestions(1l,qIds);
        dao.deleteQuestions(1l,qIds);

        Assert.assertNull(q2);


    }

    @Test
    public void testQuery(){

    }



}
