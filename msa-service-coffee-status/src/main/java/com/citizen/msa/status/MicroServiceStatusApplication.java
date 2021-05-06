package com.citizen.msa.status;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroServiceStatusApplication {
    public static void main(String[] args) {
        SpringApplication.run(MicroServiceStatusApplication.class, args);
    }
}
