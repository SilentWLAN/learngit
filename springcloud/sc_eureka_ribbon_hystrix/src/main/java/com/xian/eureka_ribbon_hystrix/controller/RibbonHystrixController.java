package com.xian.eureka_ribbon_hystrix.controller;

import com.xian.eureka_ribbon_hystrix.service.HystrixRemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
* @Date 19.4.23
*/

@RestController
public class RibbonHystrixController {

	@Autowired
	HystrixRemoteService hystrixRemoteService;

	@RequestMapping("/login")
	public String Ribbon(@RequestParam String name){
		return hystrixRemoteService.getInfo(name);
	}

}
