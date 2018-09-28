package com.lilith.thinkinginjava.unit17;

import java.util.LinkedList;
/**
 * P482
 * 深入研究容器——队列
 * 双向队列Deque，由LinkedList实现
 * @author 56580
 *
 * @param <T>
 */
public class Deque<T> {
	private LinkedList<T> deque = new LinkedList<T>();
	public void addFrist(T t) {
		deque.addFirst(t);
	}
	public void addLast(T t) {
		deque.addLast(t);
	}
	public void getFrist() {
		deque.getFirst();
	}
	public void getLast() {
		deque.getLast();
	}
	public T removerFrist() {
		return deque.removeFirst();
	}
	public T removeLast() {
		return deque.removeLast();
	}
	public int size() {
		return deque.size();
	}
	public String toString() {
		return deque.toString();
	}
}
