package com.lilith.thinkinginjava.unit15;

import java.lang.reflect.Array;
import java.util.Arrays;
/**
 * P377
 * 体验泛型中的擦除
 * @author Perform
 *
 * @param <T>
 */
public class ArrayMaker<T> {
	private Class<T> kind;
	public ArrayMaker(Class<T> type) {
		this.kind = type;
	}
	@SuppressWarnings("unchecked")
	T[] create(int size) {
		//在泛型中创建数据使用Array.newInstance()
		return (T[])Array.newInstance(kind, size);
	}
	public static void main(String[] args) {
		ArrayMaker<String> maker = new ArrayMaker<>(String.class);
		String[] arr = maker.create(9);
		System.out.println(Arrays.toString(arr));
	}
}
