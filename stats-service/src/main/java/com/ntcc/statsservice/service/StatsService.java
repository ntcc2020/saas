package com.ntcc.statsservice.service;

/**
 * StatsService
 *
 * @author zhongwenhao
 * @date 2020/3/2
 */

public interface StatsService {
    public int saveStatsItem(String statsDomain, long statsValue);

    public long getStatsItem(String statsDomain);
}
