package com.lilith.thinkinginjava.unit15;
/**
 * P354
 * 元组的应用
 * 通过一个新对象，来持有想要返回的多个对象
 * @author Perform
 *
 * @param <A>
 * @param <B>
 * @param <C>
 */
public class ThreeTuple <A, B, C> extends TwoTuple<A, B>{
	public final C third;
	public ThreeTuple(A a, B b, C c) {
		super(a, b);
		this.third = c;
	}
	public String toString() {
		return "(" + first + ", " + second + ", " + third + ")";
	}

}
