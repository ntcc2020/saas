package com.ntcc.userservice;

import com.ntcc.userservice.component.UserQueueSender;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserServiceApplicationTests {

    @Autowired
    private UserQueueSender userQueueSender;

    @Test
    public void contextLoads() {
        for (int i = 0; i < 100; i++) {
            userQueueSender.send("");
        }
    }

}
