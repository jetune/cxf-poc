package com.octo.cxf.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration("classpath:spring-web.xml")
public class HelloWorldServiceTest extends AbstractJUnit4SpringContextTests {
	@Autowired
	HelloWorldService helloWorldService;
	
	@Test
	public void testSpringContextIsOk() {
		assertNotNull(helloWorldService);
	}
	
	@Test
	public void testTheServiceReturnHello() {
		assertEquals("Hello world", helloWorldService.sayHello());
	}
}
