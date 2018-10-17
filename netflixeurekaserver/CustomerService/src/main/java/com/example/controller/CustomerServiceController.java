package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CustomerServiceController {
	
	
	
	    @Autowired
	    RestTemplate restTemplate;
	 
	    @RequestMapping(value = "/getCustomerDetails/{customerId}", method = RequestMethod.GET)
	    public String getStudents(@PathVariable String customerId)
	    {
	        System.out.println("Getting School details for " + customerId);
	 
	        String response = restTemplate.exchange("http://AccountService/getAcctDetails/{customerId}",
	                                HttpMethod.GET, null, new ParameterizedTypeReference<String>() {}, customerId).getBody();
	 
	        System.out.println("Response Received as " + response);
	 
	        return "customer Id  -  " + customerId + " \n customer Details " + response;
	    }
	 
	    @Bean
	    @LoadBalanced
	    public RestTemplate restTemplate() {
	        return new RestTemplate();
	    }
	} 


