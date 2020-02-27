package com.bookwizme.cloudadminservice;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableAdminServer
public class CloudAdminServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudAdminServiceApplication.class, args);
    }

}
