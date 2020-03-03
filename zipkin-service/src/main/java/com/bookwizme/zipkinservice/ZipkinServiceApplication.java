package com.bookwizme.zipkinservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.internal.EnableZipkinServer;

/**
 * ZipkinServiceApplication
 * 链路跟踪服务 boot类
 * 
 * @author zhongwenhao
 * @date 2020/3/2
 */

@EnableZipkinServer
@SpringBootApplication
@EnableEurekaClient
public class ZipkinServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinServiceApplication.class, args);
    }

}
