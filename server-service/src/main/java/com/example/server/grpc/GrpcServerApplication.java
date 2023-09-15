package com.example.server.grpc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication(scanBasePackages = "com.example")
@ConfigurationPropertiesScan(basePackages = "com.example")
public class GrpcServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(GrpcServerApplication.class, args);
    }
}
