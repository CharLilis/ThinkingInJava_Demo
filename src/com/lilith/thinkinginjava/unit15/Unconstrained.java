package com.lilith.thinkinginjava.unit15;
/**
 * P405
 * 泛型-自限定类型
 * @author Perform
 *
 */
public class Unconstrained {
	public static void main(String[] args) {
		BasicOther b = new BasicOther(), b2 = new BasicOther();
		b.set(new Other());
		Other other = b.get();
		b.f();
	}
}
class Other{}
class BasicOther extends BasicHolder<Other>{}
