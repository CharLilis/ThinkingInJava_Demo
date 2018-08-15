package com.lilith.thinkinginjava.unit10.orange;

import com.lilith.thinkinginjava.unit10.apple.Apple;
import com.lilith.thinkinginjava.unit10.banana.Banana;
/**
 * P195 练习6
 * ReadApple被protected修饰，只能被Banana的子类访问
 * 内部类为什么没有默认构造器
 * @author 56580
 *
 */
public class Orange extends Banana{
	
	public Apple apple() {
		return new ReadApple();
	}
	
	public static void main(String[] args) {
		Orange o = new Orange();
		Apple a = o.apple();
		a.eat();
	}
}
