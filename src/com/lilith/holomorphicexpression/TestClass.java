package com.lilith.holomorphicexpression;

import org.junit.Test;

public class TestClass {
//	@Test
	public void testStringMatches() {
		String regex = "(\\+\\d{2}\\s)?\\d{11}";
		String phoneNo = "+86 14223432342";
		System.out.println(phoneNo.matches(regex));
	}
	
	@Test
	public void testMatchesURL() {
		String regex = "(http://)?(www\\.){1}\\w*(\\.com){1}";
		String url = "www.44334.com";
		System.out.println(url.matches(regex));
	}
}
