package com.lilith.demo;

public class TestClass02 {
	
	private static TestClass02 testClass = null;
	
	private TestClass02(){
		
	}
	
	public void test() {
		System.out.println("111");
	}
	 
	
	public static TestClass02 getInstance() {
		if(testClass == null){
			testClass = new TestClass02();
		}
		return testClass;
	}

}
