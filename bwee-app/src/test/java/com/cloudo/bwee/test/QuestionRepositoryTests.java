

package com.cloudo.bwee.test;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import com.cloudo.bwee.domain.KeyPoint;
import com.cloudo.bwee.domain.Question;
import com.cloudo.bwee.repository.QuestionRepository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QuestionRepositoryTests {

    @Autowired
    private QuestionRepository questionRepository;

    @Test
    public void testCRUD() {

        Question q = new Question();
        q.setContent("test1");
        q.setAnswer("test1");
        q.setErrorCount(2);
        q.setSource(1);
        q.setType(1);

        questionRepository.save(q);
       Assert.assertNotNull(q.getId());

        List<Question> qs = questionRepository.findByContent(q.getContent());
        Assert.assertEquals(1,qs.size());
        Question tempQ = qs.get(0);
        Assert.assertEquals(q.getId(),tempQ.getId());
        Assert.assertEquals(q.getContent(),tempQ.getContent());
        Assert.assertEquals(q.getAnswer(),tempQ.getAnswer());
        Assert.assertEquals(q.getErrorCount(),tempQ.getErrorCount());
        Assert.assertEquals(q.getSource(),tempQ.getSource());
        Assert.assertEquals(q.getType(),tempQ.getType());

        Question q2 = new Question();
        q2.setContent("test2");
        q2.setAnswer("test2");
        q2.setErrorCount(1);
        q2.setSource(2);
        q2.setType(2);
        questionRepository.save(q2);

        List<Question> questions  = questionRepository.findAll();
        Assert.assertEquals(questions.size(),2);

         Optional<Question> q3o= questionRepository.findById(q2.getId());
        Question q3 = q3o.get();
        q3.setAnswer("修改一下");
        q3.setContent("没有的事情");
        q3.setErrorCount(1);
        questionRepository.save(q3);

        Optional<Question> q4q = questionRepository.findById(q3.getId());
        Question q4 = q4q.get();
        Assert.assertEquals(q4.getContent(),"没有的事情");
        Assert.assertEquals(q4.getAnswer(),"修改一下");

        questionRepository.deleteAll();
        questions  = questionRepository.findAll();

        Assert.assertEquals(questions.size(),0);


    }

    @Test
    public void testChildSave(){

        Question q1 = new Question();
        q1.setContent("test2");
        q1.setAnswer("test2");
        q1.setErrorCount(1);
        q1.setSource(2);
        q1.setType(2);
        //更新子类测试
        KeyPoint point = new KeyPoint();
        point.setContent("哈哈");
        point.setPageIndex(1);
        point.setSubject("语文");
        Set<KeyPoint> pointSet = new HashSet<>();
        pointSet.add(point);
        q1.setTopics(pointSet);

        questionRepository.save(q1);
        Optional<Question> q5q = questionRepository.findById(q1.getId());
        Question q5 = q5q.get();
        Assert.assertNotNull(q5.getTopics());

        questionRepository.delete(q1);
        Optional<Question>  qq = questionRepository.findById(q1.getId());
        Assert.assertNull(qq.get());
    }

    @Test
    public void testDelete(){

        Optional<Question> qo = questionRepository.findById(26l);
        Question q = qo.get();

        questionRepository.delete(q);
        Optional<Question> qq = questionRepository.findById(26l);
        Assert.assertNull(qq.get());

    }



    @Test
    public void testOther(){

    }
}