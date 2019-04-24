package com.xian.eureka_feign_hystrix.service.impl;

import com.xian.eureka_feign_hystrix.service.FeignHystrixService;
import org.springframework.stereotype.Service;

/**
* @Date 19.4.23
*/

@Service
public class FeignHystrixServiceImpl implements FeignHystrixService {
	@Override
	public String getInfo(String name) {
		return name+"熔断";
	}
}
