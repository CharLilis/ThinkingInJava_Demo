package com.lilith.webclient;

public class ClientDemo {
	public static void main(String[] args) {
		ServiceInterfaceService sis = new ServiceInterfaceService();
		ServiceInterface si = sis.getServiceInterfacePort();
		String returnStr = si.sayHello("good");
		System.out.println(returnStr);
		
	}
}
