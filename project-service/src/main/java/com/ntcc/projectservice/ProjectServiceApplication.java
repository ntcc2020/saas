package com.ntcc.projectservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * ProjectServiceApplication
 * project服务 boot类
 *
 * @author zhongwenhao
 * @date 2020/3/2
 */

@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = "com.ntcc.servicecommon.dao")
public class ProjectServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectServiceApplication.class, args);
    }

}
