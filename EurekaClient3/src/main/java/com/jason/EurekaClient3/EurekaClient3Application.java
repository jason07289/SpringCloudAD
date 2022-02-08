package com.jason.EurekaClient3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaClient3Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClient3Application.class, args);
	}

}
