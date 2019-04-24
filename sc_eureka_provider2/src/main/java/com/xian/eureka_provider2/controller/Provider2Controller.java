package com.xian.eureka_provider2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
* @Date 19.4.23
*/

@RestController
public class Provider2Controller {

	@RequestMapping("/hello")
	public String sayHello(@RequestParam String name){
		return name+"welcome to cloud provider 10007";
	}

}
