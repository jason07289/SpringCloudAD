package com.jason.ApiGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@EnableZuulServer // @EnableZuulProxy를 사용하면 @EnableZuulServer + PreDecorationFilter + RibbonRoutingFilter + SimpleHostRoutingFilter 기능을 추가로 사용가능
@EnableEurekaClient
@SpringBootApplication
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

}
