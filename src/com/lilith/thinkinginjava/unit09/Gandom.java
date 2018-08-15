package com.lilith.thinkinginjava.unit09;

import com.lilith.tool.Print;
/**
 * P171 练习2 测试创建抽象类实例
 * @author Perform
 *
 */
public abstract class Gandom {
	public Gandom() {
		Print.println("System Open");
	}

	public void action() {
		Print.println("I`m Gandom");
	}
	public static void main(String[] args) {
//		Gandom g = new Gandom();
	}
}
