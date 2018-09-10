package com.lilith.thinkinginjava.unit16;
/**
 * P430
 * 展示自动包装机制不适用于数组
 * @author 56580
 *
 */
public class Demo11 {
	public static void main(String[] args) {
		Integer a = null;
		int b = 8;
		a = b;
		Integer[] c = new Integer[6];
		c[0] = b;
		int d = c[0];
		
		//自动包装机制不适用于数组
//		Integer[] e = new int[6];
	}
}

