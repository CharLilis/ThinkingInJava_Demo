package com.lilith.demo;

import org.junit.Test;

public class TestClass {
	@Test
	public void testAssert() {
		int i = 0;
		for(; i < 5; i++) {
			System.out.println(i);
		}
		--i;
		assert i == 5;
		
		int c = 0;
		int b = c;
		c = b;
	}
	
	public static void main(String[] args) {
		TestClass02 testClass = TestClass02.getInstance();
		testClass.test();
	}

}
