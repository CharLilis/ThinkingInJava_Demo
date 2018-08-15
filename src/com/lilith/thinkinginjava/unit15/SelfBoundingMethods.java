package com.lilith.thinkinginjava.unit15;
/**
 * P407
 * 泛型-自限定类型
 * @author Perform
 *
 */
public class SelfBoundingMethods {
	static <T extends SelfBounded<T>> T f(T arg) {
		return arg.set(arg).get();
	}
	public static void main(String[] args) {
		A a = f(new A());
	}
}
