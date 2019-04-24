package com.xian.eureka_ribbon_hystrix.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.xian.eureka_ribbon_hystrix.service.HystrixRemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
* @Date 19.4.23
*/

@Service
public class HystrixRemoteServiceImpl implements HystrixRemoteService {


	@Autowired
	RestTemplate restTemplate;


	@Override
	@HystrixCommand(fallbackMethod ="hystrixError" )
	public String getInfo(String name) {
		String forObject = restTemplate.getForObject("http://eureka-provider/hello?name=" + name, String.class);

		return forObject;
	}

	private String hystrixError(String name){
		return name+" , welcome to err";
	}
}
