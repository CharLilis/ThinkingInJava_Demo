package com.lilith.thinkinginjava.unit15;

import java.util.Arrays;

/**
 * P375
 * 泛型的擦除
 * 由于Java是RTTI，所以会发生泛型的擦除现象
 * 在“足够复杂”的情况下可以考虑使用泛型
 * @author Perform
 *
 * @param <T>
 */
public class ReturnGenericType <T extends HasF>{
	private T obj;
	public ReturnGenericType(T x) {
		obj = x;
	}
	public T get() {
		return obj;
	}
	public static void main(String[] args) {
		System.out.println(Arrays.toString(ReturnGenericType.class.getTypeParameters()));
	}
}
