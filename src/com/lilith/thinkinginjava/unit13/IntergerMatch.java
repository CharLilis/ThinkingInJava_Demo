package com.lilith.thinkinginjava.unit13;
/**
 * P296
 * 正则表达式
 * @author Perform
 *
 */
public class IntergerMatch {
	public static void main(String[] args) {
		System.out.println("-1234".matches("-?\\d+"));
		System.out.println("5678".matches("-?\\d+"));
		//有无“-”的纯数字
		System.out.println("+911".matches("-?\\d+"));
		System.out.println("+911".matches("(-|\\+)?\\d+"));
	}
}
