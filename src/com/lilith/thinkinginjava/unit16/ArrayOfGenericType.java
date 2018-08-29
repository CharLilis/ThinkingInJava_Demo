package com.lilith.thinkinginjava.unit16;
/**
 * P441
 * @author 56580
 *
 * @param <T>
 */
public class ArrayOfGenericType<T> {
	T[] array;
	@SuppressWarnings("unchecked")
	public ArrayOfGenericType(int size) {
//		array = T[size];
		array = (T[])new Object[size];
	}
	
	public <U> U[] makeArray() {
//		return new U[20];
		return (U[])new Object[20];
	}
}
