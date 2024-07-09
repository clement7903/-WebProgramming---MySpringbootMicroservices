package com.myfirstspringapp.JobMicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class JobMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobMicroserviceApplication.class, args);
	}

}
