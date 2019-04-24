package com.xian.eureka_consumer2.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
* @Date 19.4.22
*/

@Configuration
public class RibbonConfig {

	@Bean
	@LoadBalanced            //负载均衡
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
