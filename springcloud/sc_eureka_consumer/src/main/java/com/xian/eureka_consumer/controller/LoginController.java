package com.xian.eureka_consumer.controller;

import com.xian.eureka_consumer.service.RemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* @Date 19.4.22
*/

@Controller
public class LoginController {

	@Autowired
	RemoteService remoteService;
	@RequestMapping("/login")
	@ResponseBody
	public String login(@RequestParam String name){
		String info = remoteService.getInfo(name);
		return info;
	}
}
