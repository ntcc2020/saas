package com.ntcc.statsservice.service.impl;

import com.ntcc.statsservice.service.StatsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * StatsServiceImpl
 *
 * @author zhongwenhao
 * @date 2020/3/2
 */

@Service
@Slf4j
public class StatsServiceImpl implements StatsService {
    public int saveStatsItem(String statsDomain, long statsValue) {
        log.info("statsservice saveStatsItem ", statsDomain, statsValue);

        return 0;
    }

    public long getStatsItem(String statsDomain) {
        log.info("statsservice getStatsItem ", statsDomain);

        return 0;
    }
}
