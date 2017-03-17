package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableEurekaServer
@SpringBootApplication
public class HystrixeurekaApplication {
	
	@RequestMapping(value="/recommended")
	public String readList(){
		return "checking 1 2 3";
	}
	public static void main(String[] args) {
		SpringApplication.run(HystrixeurekaApplication.class, args);
	}
}
