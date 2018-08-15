package com.lilith.thinkinginjava.unit15;

import net.mindview.util.BasicGenerator;

/**
 * P365
 * 通用构造工具测试类
 * @author 56580
 *
 */
public class BasicGeneratorDemo {
	public static void main(String[] args) throws Exception {
		Generator<CountObject> gen = BasicGenerator.create(CountObject.class);
		for(int i = 0; i < 5; i++) {
			System.out.println(gen.next());
		}
		System.out.println(CountObject.class.newInstance());
		System.out.println(Class.forName("com.lilith.thinkinginjava.unit15.CountObject").newInstance());
		Class c = CountObject.class;
//		Class c1 = Class.forName("");
		System.out.println(CountObject.class == Class.forName("com.lilith.thinkinginjava.unit15.CountObject"));
	}
}
