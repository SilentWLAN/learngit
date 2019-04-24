package com.xian.eureka_consumer2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;

@SpringBootApplication
@EnableDiscoveryClient   //该服务是消费者服务
@RibbonClients            //使用ribbon负载均衡
public class ScEurekaConsumer2Application {

	public static void main(String[] args) {
		SpringApplication.run(ScEurekaConsumer2Application.class, args);
	}

}
