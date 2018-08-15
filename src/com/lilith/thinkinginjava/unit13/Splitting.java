package com.lilith.thinkinginjava.unit13;

import java.util.Arrays;
/**
 * P296
 * 字符串的正则表达式的应用
 * @author Perform
 *
 */
public class Splitting {
	private static String knights = "Then, when you have found the shrubbery, you must cut down the mightiest tree in the forest... with... a herring!";
	public static void split(String regex) {
		System.out.println(Arrays.toString(knights.split(regex)));
	}
	public static void main(String[] args) {
		split(" ");
		split("\\W+");
		split("n\\W+");
	}
}
