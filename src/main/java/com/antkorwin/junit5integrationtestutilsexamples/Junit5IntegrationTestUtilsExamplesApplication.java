package com.antkorwin.junit5integrationtestutilsexamples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Junit5IntegrationTestUtilsExamplesApplication {

    public static void main(String[] args) {
        SpringApplication.run(Junit5IntegrationTestUtilsExamplesApplication.class, args);
    }
}
