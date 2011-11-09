package com.octo.cxf.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.octo.cxf.services.HelloWorldService;


@Configuration
public class ApplicationConfig {
	
	@Bean(name="helloWorldService")
	public HelloWorldService helloWorldService() {
		return new HelloWorldService();
	}
	

}
