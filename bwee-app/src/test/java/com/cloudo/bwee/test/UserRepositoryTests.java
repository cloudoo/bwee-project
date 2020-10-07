
package com.cloudo.bwee.test;

import com.cloudo.bwee.app.Application;
import com.cloudo.bwee.domain.User;
import com.cloudo.bwee.repository.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= Application.class)
public class UserRepositoryTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testCRUD() {
        User user = new User();
        user.setCellphone("13580408819");
        user.setName("cloudo");
        user.setPassword("pjdwefs344");
        user.setRegisterTm(new Date());

        userRepository.save(user);

        // 测试查询
        User u3 = userRepository.findUserByName("clou");
        Assert.assertNull(u3);
        u3 = userRepository.findUserByName("cloudo");
        Assert.assertNotNull(u3);

        User u1 = userRepository.findById(user.getId()).get();
        Assert.assertEquals(user.getId(), u1.getId());
        Assert.assertEquals(user.getName(), u1.getName());
        Assert.assertEquals(user.getCellphone(), u1.getCellphone());
        Assert.assertEquals(user.getPassword(), u1.getPassword());

        u1.setName("雷");
        userRepository.save(u1);

        User u2 = userRepository.findById(user.getId()).get();

               Assert.assertEquals(u2.getName(), "雷");

        userRepository.deleteAll();

    }

}