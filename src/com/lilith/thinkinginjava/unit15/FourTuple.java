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
 */
public class FourTuple<A, B, C, D> extends ThreeTuple<A, B, C> {
	public final D fourth;
	public FourTuple(A a, B b, C c, D d) {
		super(a, b, c);
		this.fourth = d;
	}
	public String toString() {
		return "(" + first + ", " + second + ", "
					+ third + ", " + fourth + ")";
	}
}
