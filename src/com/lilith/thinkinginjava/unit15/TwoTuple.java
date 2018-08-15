package com.lilith.thinkinginjava.unit15;
/**
 * P354
 * 元组的应用
 * 通过一个新对象，来持有想要返回的多个对象
 * final的修饰让使用者不能修改域引用、只能修改引用的对象
 * @author Perform
 *
 * @param <A>
 * @param <B>
 */
public class TwoTuple<A, B> {
	public final A first;
	public final B second;
	public TwoTuple(A a, B b) {
		first = a;
		second = b;
	}
	@Override
	public String toString() {
		return "(" + first + ", " + second + ")";
	}
	public static void main(String[] args) {
		TwoTuple<String, String> t = new TwoTuple<String, String>("1", "2");
		System.out.println(t.first);
	}
}
