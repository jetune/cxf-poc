package com.octo.cxf.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.octo.cxf.interceptors.ExceptionInterceptor;
import com.octo.cxf.interceptors.XmlInInterceptor;
import com.octo.cxf.interceptors.XmlOutInterceptor;
import com.octo.cxf.services.HelloWorldService;


@Configuration
public class ApplicationConfig {
	
	@Bean(name="helloWorldService")
	public HelloWorldService helloWorldService() {
		return new HelloWorldService();
	}
	
	
	@Bean
	public XmlInInterceptor xmlInInterceptor() {
		return new XmlInInterceptor();
	}
	
	@Bean
	public XmlOutInterceptor xmlOutInterceptor() {
		return new XmlOutInterceptor();
	}
	
	
	@Bean
	public ExceptionInterceptor exceptionInterceptor() {
		return new ExceptionInterceptor();
	}
	

}
