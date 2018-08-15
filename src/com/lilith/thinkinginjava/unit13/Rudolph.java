package com.lilith.thinkinginjava.unit13;
/**
 * P298
 * 正则表达式
 * @author 56580
 *
 */
public class Rudolph {
	public static void main(String[] args) {
		for(String pattern : new String[] {"Rudolph", "[rR]udolph", "[rR][aeiou][a-z]ol.*", "R.*"}) {
			System.out.println("Rudolph".matches(pattern));
		}
		
		System.out.println("abcabcabc".matches("abc+"));
		System.out.println("abcabcabc".matches("(abc)+"));
	}
}
