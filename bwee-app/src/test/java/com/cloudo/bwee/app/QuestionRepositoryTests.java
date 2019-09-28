

package com.cloudo.bwee.app;

import com.cloudo.bwee.domain.Question;
import com.cloudo.bwee.repository.QuestionRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QuestionRepositoryTests {

    @Autowired
    private QuestionRepository questionRepository;

    @Test
    public void testFind() {
        Question question = new Question();
        question.setContent("test1");
        question.setAnswer("test1");
        question.setErrorCount(2);
        question.setSource(1);

        question.setType(1);

        questionRepository.save(question);

        Question question2 = new Question();
        question2.setContent("test2");
        question2.setAnswer("test2");
        question2.setErrorCount(1);
        question2.setSource(2);

        question2.setType(2);
        questionRepository.save(question2);


        List<Question> questions  = questionRepository.findAll();

        for(Question qu:questions){
            System.out.println(qu);
        }


        questionRepository.deleteAll();



    }

    @Test
    public void testOther(){
        for(int i=0;i<97;i++){
            String test= ",{\"type\":\"string\",\"index\":"+i+",\"format\":\"\"}";
            System.out.println(test);
        }
    }
}