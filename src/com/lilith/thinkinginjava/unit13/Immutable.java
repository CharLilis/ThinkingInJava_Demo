package com.lilith.thinkinginjava.unit13;

import com.lilith.tool.Print;

/**
 * P283
 * 不可变字符串String
 * String中对String值做修改的方法返回的都是包含修改后字符串的全新String对象
 * @author Perform
 *
 */
public class Immutable {
	static String upcase(String s) {
		return s.toUpperCase();
	}
	public static void main(String[] args) {
		String s = "howdy";
		Print.println(s);
		String ss = upcase(s);
		Print.println(ss);
		Print.println(s);
	}
}
