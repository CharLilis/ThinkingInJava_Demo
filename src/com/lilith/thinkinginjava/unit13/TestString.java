package com.lilith.thinkinginjava.unit13;

public class TestString {
	public static void main(String[] args) {
		String a = "abc";
		String b = "ABC";
		//比较两个字符串的内容，不区分大小写
		System.out.println(a.equalsIgnoreCase(b));
		System.out.printf("Row1 :[%d %f]\n", 3, 3.3);
	}
}
