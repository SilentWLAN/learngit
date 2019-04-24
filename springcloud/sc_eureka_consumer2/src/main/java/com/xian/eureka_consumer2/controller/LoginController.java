package com.xian.eureka_consumer2.controller;

import com.xian.eureka_consumer2.service.RemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
* @Date 19.4.22
*/

@RestController
public class LoginController {


	@Autowired
	RemoteService remoteService;
	@RequestMapping("/login")
	public String login(@RequestParam String name){
		return remoteService.info(name);
	}
}
