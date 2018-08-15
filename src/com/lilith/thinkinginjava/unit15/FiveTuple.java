package com.lilith.thinkinginjava.unit15;
/**
 * P355
 * 元组的应用
 * 通过一个新对象，来持有想要返回的多个对象
 * @author Perform
 *
 * @param <A>
 * @param <B>
 * @param <C>
 * @param <D>
 * @param <E>
 */
public class FiveTuple <A, B, C, D, E> extends FourTuple<A, B, C, D>{
	public final E fifth;
	public FiveTuple(A a, B b, C c, D d, E e) {
		super(a, b, c, d);
		this.fifth = e;
	}
	public String toString() {
		return "(" + first + ", " + second + ", "
					+ third + ", " + fourth + ", " + fifth + ")";
	}
}
