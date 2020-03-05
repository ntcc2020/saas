package com.ntcc.salaryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * SalaryServiceApplication
 * salary服务 boot类
 *
 * @author zhongwenhao
 * @date 2020/3/2
 */

@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = "com.ntcc.servicecommon.dao")
public class SalaryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SalaryServiceApplication.class, args);
    }

}
