package com.lilith.thinkinginjava.unit15;

import java.util.*;
/**
 * P383
 * 擦除的补偿
 * 在使用数组的地方应使用ArrayList
 * 优点：1、获得数组的行为
 * 	   2、获得泛型提供的编译器的类型安全
 * @author Perform
 *
 * @param <T>
 */
public class ListOfGenerics<T> {
	private List<T> array = new ArrayList<T>();
	public void add(T t) {
		array.add(t);
	}
	public T get(int index) {
		return array.get(index);
	}
}
