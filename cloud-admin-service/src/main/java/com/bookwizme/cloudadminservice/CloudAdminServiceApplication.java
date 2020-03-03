package com.bookwizme.cloudadminservice;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * CloudAdminServiceApplication
 * cloud admin服务 boot类
 *
 * @author zhongwenhao
 * @date 2020/3/2
 */

@SpringBootApplication
@EnableEurekaClient
@EnableAdminServer
public class CloudAdminServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudAdminServiceApplication.class, args);
    }

}
