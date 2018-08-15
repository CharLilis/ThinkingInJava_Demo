package com.lilith.demo;

public class Demo02 extends Demo{
	static Demo02 demo03 = new Demo02();
	public Demo02() {
		System.out.println("------Demo02实例化------");
	}
	/**
	 * 测试静态方法是否可以被重写（不能）
	 */
	public static void fucntion() {
		System.out.println("测试静态方法是否可以被重写");
	}
	
	@Override
	public void testF() {
		System.out.println("这是Demo02");
	}
	
	public static void main(String[] args) {
		Demo02.demo03.testF();
		Demo demo = new Demo();
		demo.fucntion();
		demo.testF();
		Demo demo02 = new Demo02();
		demo02.fucntion();
		demo02.testF();
	}
}
