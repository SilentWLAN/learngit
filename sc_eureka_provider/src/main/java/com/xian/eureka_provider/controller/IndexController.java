package com.xian.eureka_provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* @Date 19.4.22
*/

@RestController
public class IndexController {

	@RequestMapping("/hello")
	public String sayHello(String name){
		return name+"welcome to cloud provider 10001";
	}
}
