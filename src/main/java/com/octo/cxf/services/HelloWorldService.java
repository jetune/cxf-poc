package com.octo.cxf.services;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.octo.cxf.services.exceptions.BusinessException;
import com.octo.cxf.services.exceptions.TechnicalException;

import java.util.ArrayList;
import java.util.List;

public class HelloWorldService implements HelloWorld {

    @WebMethod
    public String sayHello() {
        return "Hello world";
    }

    @WebMethod
    public void makeBusinessException() throws BusinessException {
    	throw new BusinessException();
    }

}
