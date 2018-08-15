package com.lilith.thinkinginjava.unit15;
/**
 * P405
 * @author Perform
 *
 * @param <T>
 */
public class BasicHolder<T> {
	T element;
	public void set(T arg) {
		element = arg;
	}
	public T get() {
		return element;
	}
	void f() {
		System.out.println(element.getClass().getSimpleName());
	}
}
