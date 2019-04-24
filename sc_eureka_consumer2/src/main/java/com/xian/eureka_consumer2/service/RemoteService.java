package com.xian.eureka_consumer2.service;


import org.springframework.cloud.netflix.ribbon.RibbonClientName;
import org.springframework.stereotype.Service;


public interface RemoteService {

	public String info(String name);
}
