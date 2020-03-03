package com.ntcc.statsservice.controller;

import com.ntcc.statsservice.service.StatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * StatsController
 *
 * @author zhongwenhao
 * @date 2020/3/2
 */

@RestController
public class StatsController {
    @Autowired
    private StatsService statsService;

    @RequestMapping(value = "/get/stats", method = RequestMethod.GET)
    public long getStatsItem(String statsDomain) {
        return statsService.getStatsItem(statsDomain);
    }

}
