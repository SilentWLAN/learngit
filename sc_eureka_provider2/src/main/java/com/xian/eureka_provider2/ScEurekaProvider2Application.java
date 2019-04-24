package com.xian.eureka_provider2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient       //服务提供者
public class ScEurekaProvider2Application {

	public static void main(String[] args) {
		SpringApplication.run(ScEurekaProvider2Application.class, args);
	}

}
