package com.lilith.thinkinginjava;

import org.junit.Test;
/**
 * 第94页的练习
 * @author Perform
 *
 */
public class Practice01 {
	/**
	 * 练习1
	 * 打印1到100的数字
	 */
	@Test
	public void test01() {
		int i = 0;
		do {
			i++;
			System.out.println("i = " + i);
		}while(i < 100);
	}
	
	/**
	 * 练习2
	 * 在练习1的基础上改为在47时跳出程序
	 */
	@Test
	public void test02() {
		int i = 0;
		do {
			i++;
			System.out.println("i = " + i);
			if(i == 47) break;
		}while(i < 100);
	}
	
	
}
