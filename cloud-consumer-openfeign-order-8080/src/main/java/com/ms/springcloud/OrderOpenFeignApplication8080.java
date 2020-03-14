package com.ms.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class OrderOpenFeignApplication8080 {
    public static void main(String[] args) {
        SpringApplication.run(OrderOpenFeignApplication8080.class,args);
    }
}
