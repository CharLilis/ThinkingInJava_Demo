package com.lilith.thinkinginjava.unit15;
/**
 * P385
 * 擦除的补偿
 * 生成泛型数组
 * 生成泛型数组时，编译器会擦除类型信息，泛型数组会变成一个Object数组
 * 数组转型失败是因为：没有任何方式可以推翻底层的数组类型
 * @author Perform
 *
 * @param <T>
 */
public class GenericArray2<T> {
	private Object[] array;
	public GenericArray2(int size){
		array = new Object[size];
	}
	public void put(int index, T item) {
		array[index] = item;
	}
	@SuppressWarnings("unchecked")
	public T get(int index) {
		return (T)array[index];
	}
	@SuppressWarnings("unchecked")
	public T[] rep() {
		return (T[])array;
	}
	public static void main(String[] args) {
		GenericArray2<Integer> gai = new GenericArray2<Integer>(10);
		for(int i = 0; i < 10; i++) {
			gai.put(i, i);
		}
		for(int i = 0; i < 10; i++) {
			System.out.print(gai.get(i) + " ");
		}
		System.out.println();
		try {
			Integer[] ta = gai.rep();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
