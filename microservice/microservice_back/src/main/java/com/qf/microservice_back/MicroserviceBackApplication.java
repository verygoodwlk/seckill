package com.qf.microservice_back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = "com.qf")
@EnableEurekaClient
public class MicroserviceBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceBackApplication.class, args);
    }

}
