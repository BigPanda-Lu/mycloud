package com.ms.alicloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AliCloudProviderApplication9001 {
    public static void main(String[] args) {
        SpringApplication.run(AliCloudProviderApplication9001.class,args);
    }
}
