package com.lilith.thinkinginjava;

import org.junit.Test;
/**
 * P102 可变参数列表的方法
 * @author Perform
 *
 */
public class Practice07 {
//	@Test
	public void test01() {
		System.out.print(new int[0].getClass());
	}
	
//	@Test
	public void test02() {
		arrayString("00","1","2");
	}
	
	public static void main(String... args) {
		for(String str : args) {
			System.out.println("str = "+ str);
		}
	}
	
	public static void arrayString(String...strings) {
		for(String str : strings) {
			System.out.println("str="+str);
		}
	}
	
}
