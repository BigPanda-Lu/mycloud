package com.ms.springcloud.conf;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignLoggerConfig {

    @Bean
    Logger.Level getFeignLogger(){
        return Logger.Level.FULL;
    }
}
