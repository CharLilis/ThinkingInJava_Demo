package com.lilith.thinkinginjava.unit17;

import static com.lilith.tool.Print.*;
/**
 * P483
 * 深入研究容器——队列
 * 双向队列测试
 * @author 56580
 *
 */
public class DequeTest {
	static void fillTest(Deque<Integer> deque) {
		for(int i = 20; i < 27; i++) {
			deque.addFrist(i);
		}
		for(int i = 50; i < 55; i++) {
			deque.addLast(i);
		}
	}
	public static void main(String[] args) {
		Deque<Integer> d = new Deque<Integer>();
		fillTest(d);
		println(d);
		while(d.size() != 0) {
			print(d.removerFrist() + " ");
		}
		println();
		fillTest(d);
		while(d.size() != 0) {
			print(d.removeLast() + " ");
		}
	}
}
