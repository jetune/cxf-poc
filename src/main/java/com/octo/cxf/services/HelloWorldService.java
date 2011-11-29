package com.octo.cxf.services;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.octo.cxf.services.exceptions.BusinessException;
import com.octo.cxf.services.exceptions.TechnicalException;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by IntelliJ IDEA.
 * User: mikael
 * Date: 09/11/11
 * Time: 18:44
 * To change this template use File | Settings | File Templates.
 */
@WebService
public class HelloWorldService {

    @WebMethod
    public String sayHello() {
        return "Hello world";
    }

    @WebMethod
    public void makeTechnicalException() throws TechnicalException {
    	throw new TechnicalException();
    }
    
    @WebMethod
    public void makeBusinessException() throws BusinessException {
    	throw new BusinessException();
    }

}
