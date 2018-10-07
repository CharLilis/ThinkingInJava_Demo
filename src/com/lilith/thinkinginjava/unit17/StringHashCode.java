package com.lilith.thinkinginjava.unit17;

public class StringHashCode {
	public static void main(String[] args) {
		String[] strs = "hello hello".split(" ");
		System.out.println(strs[0].hashCode());
		System.out.println(strs[1].hashCode());
	}
}
