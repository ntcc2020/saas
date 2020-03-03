package com.ntcc.accountservice.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * RabbitConfig
 * rabbitmq配置
 *
 * @author zhongwenhao
 * @date 2020/3/2
 */

@Configuration
public class RabbitConfig {
    @Bean
    public Queue queue() {
        return new Queue("stats.item.report");
    }
}
