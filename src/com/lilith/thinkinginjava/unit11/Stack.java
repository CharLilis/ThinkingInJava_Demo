package com.lilith.thinkinginjava.unit11;

import java.util.LinkedList;

/**
 * P230	Stack
 * 栈，“后进先出”的容器
 * @author Perform
 *
 * @param <T>
 */
public class Stack<T> {
	private LinkedList<T> storage = new LinkedList<T>();
	/**
	 * 压入元素
	 * @return
	 */
	public void push(T t) {
		storage.addFirst(t);
	}
	/**
	 * 返回栈顶元素
	 * @return
	 */
	public T peek() {
		return storage.getFirst();
	}
	/**
	 * 移除并返回栈顶元素
	 * @return
	 */
	public T pop() {
		return storage.removeFirst();
	}
	/**
	 * 判断是否为空
	 * @return
	 */
	public boolean empty() {
		return storage.isEmpty();
	}
	public String toString() {
		return storage.toString();
	}
}
