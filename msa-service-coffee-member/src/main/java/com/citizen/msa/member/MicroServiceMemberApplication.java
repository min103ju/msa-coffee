package com.citizen.msa.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroServiceMemberApplication {
    public static void main(String[] args) {
        SpringApplication.run(MicroServiceMemberApplication.class, args);
    }
}
