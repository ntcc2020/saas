package com.ntcc.statsservice.service.impl;

import com.ntcc.statsservice.dao.StatsItemMapper;
import com.ntcc.statsservice.entity.StatsItem;
import com.ntcc.statsservice.service.StatsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private StatsItemMapper statsItemMapper;

    public int saveStatsItem(String statsDomain, long statsValue) {
        log.info("statsservice saveStatsItem ", statsDomain, statsValue);

        StatsItem statsItem = new StatsItem();
        statsItem.setStatsDomain(statsDomain);

        StatsItem result = statsItemMapper.selectOne(statsItem);
        int ret;
        if (result != null) {
            statsItem.setId(result.getId());
            statsItem.setStatsValue(result.getStatsValue() + statsValue);
            ret = statsItemMapper.updateByPrimaryKey(statsItem);
        } else {
            statsItem.setStatsValue(statsValue);
            ret = statsItemMapper.insert(statsItem);
        }

        return ret;
    }

    public long getStatsItem(String statsDomain) {
        log.info("statsservice getStatsItem ", statsDomain);

        StatsItem statsItem = new StatsItem();
        statsItem.setStatsDomain(statsDomain);

        StatsItem result = statsItemMapper.selectOne(statsItem);
        long ret = 0;
        if (result != null) {
            ret = result.getStatsValue();
        }

        return ret;
    }
}
