package com.octo.cxf.services;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration("classpath:spring-test.xml")
public class CxfClientTest extends AbstractJUnit4SpringContextTests {
	
	@Autowired
	@Qualifier("helloClient")
	private HelloWorld helloClient;
	
	@Test
	public void testClientCall() {
		String result = helloClient.sayHello();
		System.out.println(result);
	}
	
	
}
