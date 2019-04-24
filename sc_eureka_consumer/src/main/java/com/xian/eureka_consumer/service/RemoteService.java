package com.xian.eureka_consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
* @Date 19.4.22
*/

@FeignClient(name = "eureka-provider")
public interface RemoteService {

	@RequestMapping("/hello")
	public String getInfo(@RequestParam String name);

}
