package com.ntcc.statsweb.service;

import com.ntcc.statsweb.service.hystrix.StatsServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * StatsServiceRemote
 *
 * @author zhongwenhao
 * @date 2020/3/2
 */

@FeignClient(value = "stats-service", fallback = StatsServiceHystrix.class)
public interface StatsServiceRemote {
    @RequestMapping(value = "/get/stats", method = RequestMethod.GET)
    public long getStatsItem(@RequestParam(value = "statsDomain") String statsDomain);
}
