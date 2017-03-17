package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@EnableCircuitBreaker
@RestController
@SpringBootApplication
@EnableHystrixDashboard
@EnableHystrix
public class HystrixeurekaclientApplication {
	
	@Autowired
	  private BookService bookService;

	  @Bean
	  public RestTemplate rest(RestTemplateBuilder builder) {
	    return builder.build();
	  }

	  @RequestMapping("/to-read")
	  public String toRead() {
	    return bookService.readingList();
	  }

	  public static void main(String[] args) {
	    SpringApplication.run(HystrixeurekaclientApplication.class, args);
	  }
}
