package com.myfirstspringapp.JobMicroservice.job;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

    @LoadBalanced
    @Bean  // for enabling autowiring in JobServiceImpl
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
