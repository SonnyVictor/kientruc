package com.sad.bus.vexere;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BusVexereApplication {

    public static void main(String[] args) {
        SpringApplication.run(BusVexereApplication.class, args);
    }

}

