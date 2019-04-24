package com.xian.eureka_ribbon_hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.ribbon.RibbonClients;

@SpringBootApplication
@EnableDiscoveryClient
@RibbonClients
@EnableHystrix
public class ScEurekaRibbonHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScEurekaRibbonHystrixApplication.class, args);
	}

}
