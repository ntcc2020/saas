package com.ntcc.accountservice.component;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * AccountQueueSender
 * account服务 消息队列
 * 
 * @author zhongwenhao
 * @date 2020/3/2
 */

@Component
public class AccountQueueSender {
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(String statsDomain) {
        amqpTemplate.convertAndSend("stats.item.report", statsDomain);
    }
}
