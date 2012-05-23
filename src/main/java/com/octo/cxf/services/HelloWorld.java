package com.octo.cxf.services;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.octo.cxf.services.exceptions.BusinessException;

@WebService
public interface HelloWorld {

	@WebMethod
	String sayHello();
	@WebMethod
	void makeBusinessException() throws BusinessException;
}
