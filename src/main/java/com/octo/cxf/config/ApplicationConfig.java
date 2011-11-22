package com.octo.cxf.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.octo.cxf.services.HelloWorldService;


@Configuration
public class ApplicationConfig {
	
	@Bean(name="helloWorldService")
	public HelloWorldService helloWorldService() {
		List<String> list = new ArrayList<String>();
		return new HelloWorldService();
	}
	

}
