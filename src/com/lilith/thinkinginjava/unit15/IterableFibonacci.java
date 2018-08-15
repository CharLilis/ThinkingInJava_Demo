package com.lilith.thinkinginjava.unit15;

import java.util.Iterator;
/**
 * P360
 * 泛型的使用
 * 使用适配器
 * @author Perform
 *
 */
public class IterableFibonacci extends Fibonacci implements Iterable<Integer>{
	private int n;
	public IterableFibonacci(int count) {
		n = count;
	}
	@Override
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {
			public boolean hasNext() {
				return n > 0;
			}
			public Integer next() {
				n--;
				return IterableFibonacci.this.next();
			}
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}
	public static void main(String[] args) {
		for(int i : new IterableFibonacci(18)) {
			System.out.print(i + " ");
		}
	}

}
