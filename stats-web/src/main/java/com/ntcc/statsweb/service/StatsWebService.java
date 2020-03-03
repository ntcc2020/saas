package com.ntcc.statsweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * StatsWebService
 * 
 * @author zhongwenhao
 * @date 2020/3/2
 */

@Service
@Configuration
@EnableCaching
public class StatsWebService implements Serializable {
    @Autowired
    private StatsServiceRemote statsServiceRemote;

    //
    public long getRegisterCount() {
        return statsServiceRemote.getStatsItem("register");
    }
}
