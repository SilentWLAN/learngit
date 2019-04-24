package com.xian.eureka_provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient   //服务为一个提供者
public class ScEurekaProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScEurekaProviderApplication.class, args);
	}

}
