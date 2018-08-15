package com.lilith.thinkinginjava.unit05;

import org.junit.Test;

/**
 * P106	枚举的使用，创建enum时，编译器会自动添加
 * 一些有用的特性，例如会创建toString()方法
 * @author Perform
 *
 */
public class SimpleEnumUse {
	public static void main(String[] args) {
		Practice08 howHot = Practice08.MEDIUM;
		System.out.println(howHot);
		
		for(Practice08 p : Practice08.values()) {
			System.out.println(p + ", ordinal " + p.ordinal());
		}
		
	}
	/**
	 * 枚举在switch语法上的使用
	 */
	@Test
	public void testSwitch() {
		Practice08 howHot = Practice08.NOT;
//		String howHot = "";
		switch (howHot) {
		case NOT:
			System.out.println("not");
			break;

		default:
			System.out.println("default");
			break;
		}
	}
}
