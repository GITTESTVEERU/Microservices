package com.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AvailabilityFilteringRule;
import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.PingUrl;

@Configuration
public class RibbonConfiguration {
	
	@Autowired
	IClientConfig ribbonClient;
	
	@Bean
	public IPing ping(IClientConfig ribbonClient){	
		return new PingUrl();
		
	}
	/*@Bean
	public IRule rule(IClientConfig ribbonClient) {
		return new AvailabilityFilteringRule();
	}*/
}
