package com.lilith.thinkinginjava.unit15;
/**
 * P402
 * 泛型-问题
 * 转型和警告
 * @author 56580
 *
 */
public class FenericCast {
	private static final int size = 10;
	public static void main(String[] args) {
		FixedSizeStack<String> fss = new FixedSizeStack<String>(size);
		for(String s : "A B C D E F G H I J".split(" ")) {
			fss.push(s);
		}
		for(int i = 0; i < size; i++) {
			String s = fss.pop();
			System.out.print(s + " ");
		}
	}
}
class FixedSizeStack<T>{
	private int index = 0;
	private Object[] objs = null;
	public FixedSizeStack(int size) {
		objs = new Object[size];
	}
	public void push(T t) {
		objs[index++] = t;
	}
	@SuppressWarnings("unchecked")//消除警告
	public T pop() {
		return (T)objs[--index];
	}
}