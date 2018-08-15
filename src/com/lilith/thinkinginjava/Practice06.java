package com.lilith.thinkinginjava;

import org.junit.Test;
/**
 * P102 可变参数列表的方法
 * @author Perform
 *
 */
public class Practice06 {
//	@Test
	public void test02() {
		Desk desk = new Desk("4");
		Desk[] desks = new Desk[5];
	}
	
	@Test
	public void test03() {
		Desk[] desks = new Desk[5];
		for(int i = 0; i < desks.length; i++) {
			desks[i] = new Desk(i+"");
		}
	}
	
	void printArrays(Object... objs) {
		for(Object obj : objs) {
			System.out.println(obj.toString());
		}
	}
}
class Desk{
	Desk(String str){
		System.out.println("str = "+str);
	}
}
