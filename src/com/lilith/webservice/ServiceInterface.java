package com.lilith.webservice;

import javax.jws.WebService;

@WebService
public class ServiceInterface implements WebServiceInterface{

//	@Override
//	public String execute(String requestStr) {
//		System.out.println("处理成功");
//		return "SUCCESS";
//	}

	@Override
	public String sayHello(String requestStr) {
		System.out.println("+_+_+_+_+_+_+_+_+_+_+_");
		return "Say Hello!";
	}

}
