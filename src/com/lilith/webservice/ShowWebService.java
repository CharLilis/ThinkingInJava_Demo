package com.lilith.webservice;

import javax.xml.ws.Endpoint;

import org.junit.Test;

public class ShowWebService {

	public static void main(String[] args) {
		String servicePath = "http://localhost:8989/WS_Server/Webservice";
		Endpoint.publish(servicePath, new ServiceInterface());
		System.out.println("发布成功");
	}
}
