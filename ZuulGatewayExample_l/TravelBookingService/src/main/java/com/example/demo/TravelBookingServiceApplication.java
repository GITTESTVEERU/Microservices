package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages={"com.example.controller"})
public class TravelBookingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TravelBookingServiceApplication.class, args);
	}
}
