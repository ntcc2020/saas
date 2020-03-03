package com.ntcc.statsweb.service.hystrix;

import com.ntcc.statsweb.service.StatsServiceRemote;
import org.springframework.stereotype.Component;

/**
 * StatsServiceHystrix
 *
 * @author zhongwenhao
 * @date 2020/3/2
 */

@Component
public class StatsServiceHystrix implements StatsServiceRemote {
    @Override
    public long getStatsItem(String statsDomain) {
        return 0;
    }
}
