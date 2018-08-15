package com.lilith.thinkinginjava.unit15;
/**
 * P384
 * 擦除的补偿
 * 在泛型代码中创建数组
 * @author Perform
 *
 * @param <T>
 */
public class GenericArray<T> {
	private T[] array;
	@SuppressWarnings("unchecked")
	public GenericArray(int sz){
		array = (T[])new Object[sz];
	}
	public void put(int index, T item) {
		array[index] = item;
	}
	public T get(int index) {
		return array[index];
	}
	public T[] rep() {
		return array;
	}
	public static void main(String[] args) {
		GenericArray<Integer> gai =
				new GenericArray<Integer>(10);
//		Integer[] ia = gai.rep();
		Object[] oa = gai.rep();
	}
}
