package com.ntcc.accountservice;

import com.ntcc.accountservice.component.AccountQueueSender;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AccountServiceApplicationTests {

    @Autowired
    private AccountQueueSender accountQueueSender;

    @Test
    public void contextLoads() {
        for (int i = 0; i < 100; i++) {
            accountQueueSender.send("");
        }
    }

}
