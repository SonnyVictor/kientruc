package com.sad.bus.futa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BusFutaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BusFutaApplication.class, args);
    }

}

