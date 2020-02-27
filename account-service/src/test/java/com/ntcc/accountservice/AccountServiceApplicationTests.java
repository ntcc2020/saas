package com.ntcc.accountservice;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AccountServiceApplicationTests {

    @Autowired
    private RabbitProvider rabbitProvider;

    @Test
    public void contextLoads() {
        for (int i = 0; i < 100; i++) {
            rabbitProvider.send();
        }
    }

}
