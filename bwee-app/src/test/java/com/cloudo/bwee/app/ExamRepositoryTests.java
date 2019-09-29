

package com.cloudo.bwee.app;

import com.cloudo.bwee.domain.Exam;
import com.cloudo.bwee.domain.KnowledgePoint;
import com.cloudo.bwee.domain.Question;
import com.cloudo.bwee.repository.ExamRepository;
import com.cloudo.bwee.repository.QuestionRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExamRepositoryTests {

    @Autowired
    private ExamRepository examRepository;

    @Test
    public void testCRUD() {

    }

}