package com.xian.eureka_feign_hystrix.service;

import com.xian.eureka_feign_hystrix.service.impl.FeignHystrixServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "eureka-provider",fallback = FeignHystrixServiceImpl.class)
public interface FeignHystrixService {

	@RequestMapping("/hello")
	public String getInfo(@RequestParam String name);
}
