package com.ntcc.salaryweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * SalaryWebApplication
 * salaryweb boot类
 *
 * @author zhongwenhao
 * @date 2020/3/2
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrixDashboard
public class SalaryWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SalaryWebApplication.class, args);
    }

}
