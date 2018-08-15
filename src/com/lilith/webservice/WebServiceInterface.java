package com.lilith.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
interface WebServiceInterface {
	
//	@WebMethod
//	String execute(String requestStr);
	
	@WebMethod
	String sayHello(String requestStr);

}
