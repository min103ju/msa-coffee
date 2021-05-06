package com.citizen.msa.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroServiceOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(MicroServiceOrderApplication.class);
    }
}
