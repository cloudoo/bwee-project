

package com.cloudo.bwee.app;

import com.cloudo.bwee.domain.ExamTemplate;
import com.cloudo.bwee.domain.Question;
import com.cloudo.bwee.repository.ExamRepository;
import com.cloudo.bwee.repository.ExamTemplateRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashSet;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExamTemplateRepositoryTests {

    @Autowired
    private ExamTemplateRepository examTemplateRepository;

    @Test
    public void testCreate() {
        ExamTemplate examTemplate = new ExamTemplate();
        examTemplate.setSubject("Chinese");
        examTemplate.setTime(90);

        Question q1 = new Question();
        q1.setContent("test1");
        q1.setAnswer("test1");
        q1.setErrorCount(1);
        q1.setSource(1);
        q1.setType(1);
        Question q2 = new Question();
        q2.setContent("test2");
        q2.setAnswer("test2");
        q2.setErrorCount(2);
        q2.setSource(2);
        q2.setType(2);

        Set<Question> questions = new HashSet<>();
        questions.add(q1);
        questions.add(q2);

        examTemplate.setQuestions(questions);

        examTemplateRepository.save(examTemplate);

        ExamTemplate e1 = examTemplateRepository.findById(examTemplate.getId()).get();

        Set<Question> qs = e1.getQuestions();
        Assert.assertNotNull(qs);

    }

    @Test
    public void testDelete(){
        ExamTemplate e1 = examTemplateRepository.findById(1l).get();
        Set<Question> questions = e1.getQuestions();

        for(Question qu:questions){
            System.out.println(qu.getContent());
        }


    }

}