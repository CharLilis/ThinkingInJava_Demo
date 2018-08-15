package com.lilith.thinkinginjava.unit10;
/**
 * P204	为什么使用内部类
 * 1、在一些情况下，实现类只能继承一个接口，但是与调用方法不兼容
 * 2、用内部类实现继承多个类或者抽象类（多重继承）
 * @author 56580
 *
 */
public class MultiInterfaces {
	static void takesA(A a) {};
	static void takesB(B b) {};
	public static void main(String[] args) {
		X x = new X();
		Y y = new Y();
		takesA(x);
		takesA(y);
		takesB(x);
		//兼容方法
		takesB(y.makeB());
	}
}
interface A{}
interface B{}
class X implements A,B{}
class Y implements A{
	B makeB() {
		return new B() {};
	}
}