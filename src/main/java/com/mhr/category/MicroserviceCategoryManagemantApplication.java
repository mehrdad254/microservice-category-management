package com.mhr.category;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceCategoryManagemantApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceCategoryManagemantApplication.class, args);
	}

}
