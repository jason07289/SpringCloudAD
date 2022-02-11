package com.jason.EurekaClient1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RefreshScope
@RestController
public class SampleController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@HystrixCommand
	@RequestMapping("/hello")
	public String printHelloWorld() throws InterruptedException {
		//Thread.sleep(1000); 사용자변경 테스트33
		String result = restTemplate.getForObject("http://eurekaclient2/hello", String.class);

		return result;
	}
}
