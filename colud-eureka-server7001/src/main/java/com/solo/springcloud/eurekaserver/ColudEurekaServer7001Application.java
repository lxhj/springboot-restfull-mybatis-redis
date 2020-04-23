package com.solo.springcloud.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableEurekaServer
@Configuration
public class ColudEurekaServer7001Application {

    public static void main(String[] args) {
        SpringApplication.run(ColudEurekaServer7001Application.class, args);
    }

}
