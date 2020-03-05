package com.ntcc.recordservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * RecordServiceApplication
 * record服务 boot类
 *
 * @author zhongwenhao
 * @date 2020/3/2
 */

@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = "com.ntcc.servicecommon.dao")
public class RecordServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RecordServiceApplication.class, args);
    }

}
