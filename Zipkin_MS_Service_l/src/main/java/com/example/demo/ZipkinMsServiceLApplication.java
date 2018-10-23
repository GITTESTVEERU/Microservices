package com.example.demo;

import org.apache.log4j.spi.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ZipkinMsServiceLApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinMsServiceLApplication.class, args);
	}
}

@RestController
class ZipkinController {
	


	@Autowired
	public RestTemplate restTemplate;

	@Bean
	public RestTemplate template() {
		return new RestTemplate();
	}
	
	@Bean
	public AlwaysSampler getDefaultSampler() {
		return new AlwaysSampler();
	}
	

	@GetMapping("/zipkin_l")
	public String getFirstZipkin() {
		return "Zipik server one called...";

	}

	@GetMapping("/zipkin_2")
	public String invokeFirstZipkin() {
		return restTemplate.getForObject("http://localhost:7000/zipkin_l", String.class);
	}
}
