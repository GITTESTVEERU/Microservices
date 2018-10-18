package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.config.RibbonConfiguration;

@SpringBootApplication
@RestController
@RibbonClient(name="paymentservice", configuration=RibbonConfiguration.class)
public class CustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
	}
	
	@Autowired
	private RestTemplate template;
	
	@RequestMapping("/invokePayment")
	public String makePayment(){
		String url="http://paymentservice/payment"; //no particular provider port
		return template.getForObject(url, String.class);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate template() {
		return new  RestTemplate();
	}
}
