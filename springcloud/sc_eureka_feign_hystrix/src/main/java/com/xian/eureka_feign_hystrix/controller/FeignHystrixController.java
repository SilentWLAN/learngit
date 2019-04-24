package com.xian.eureka_feign_hystrix.controller;

import com.xian.eureka_feign_hystrix.service.FeignHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
* @Date 19.4.23
*/

@RestController
public class FeignHystrixController {

	@Autowired
	FeignHystrixService feignHystrixService;
	@RequestMapping("/logiin")
	public String Info(@RequestParam String name){

		String info = feignHystrixService.getInfo(name);

		return info;
	}

}
