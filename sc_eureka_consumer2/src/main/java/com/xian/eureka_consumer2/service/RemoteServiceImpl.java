package com.xian.eureka_consumer2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
* @Date 19.4.22
*/

@Service
public class RemoteServiceImpl implements RemoteService {


	@Autowired
	private RestTemplate restTemplate;

	@Override
	public String info(String name) {
		String object = restTemplate.getForObject("http://eureka-provider/hello?name=" + name, String.class);
		return object;
	}
}
