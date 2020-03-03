package com.ntcc.statsservice.component;

import com.ntcc.statsservice.service.StatsService;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * StatsQueueReceiver
 *
 * @author zhongwenhao
 * @date 2020/3/2
 */

@Component
@RabbitListener(queues = "stats.item.report")
public class StatsQueueReceiver {
    @Autowired
    private StatsService statsService;

    @RabbitHandler
    public void process(String statsDomain) {
        statsService.saveStatsItem(statsDomain, 1l);
    }
}
