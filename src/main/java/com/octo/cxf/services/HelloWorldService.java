package com.octo.cxf.services;

import javax.jws.WebMethod;
import javax.jws.WebService;
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
        List<String> myList = new ArrayList<String>();
        return "Hello world";
    }


}
