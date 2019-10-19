
package com.cloudo.bwee.app;

import com.cloudo.bwee.domain.Exam;
import com.cloudo.bwee.repository.ExamRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExamRepositoryTests {

    @Autowired
    private ExamRepository examRepository;

    @Test
    public void testCRUD() {
        Exam exam = new Exam();
        examRepository.save(exam);
    }

}