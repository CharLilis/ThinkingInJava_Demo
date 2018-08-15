package com.lilith.thinkinginjava.unit10;
/**
 * P205	
 * 通过内部类实现多重继承
 * @author 56580
 *
 */
public class MultiImplementation {
	static void takesD(D d) {}
	static void takesE(E e) {}
	public static void main(String[] args) {
		Z z = new Z();
		takesD(z);
		takesE(z.makeE());
	}
}
class D{}
abstract class E{}
class Z extends D{
	E makeE() {
		return new E() {};
	}
}