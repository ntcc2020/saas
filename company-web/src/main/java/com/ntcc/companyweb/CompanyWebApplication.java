package com.ntcc.companyweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * CompanyWebApplication
 * companyweb boot类
 *
 * @author zhongwenhao
 * @date 2020/3/2
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrixDashboard
public class CompanyWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(CompanyWebApplication.class, args);
    }

}
