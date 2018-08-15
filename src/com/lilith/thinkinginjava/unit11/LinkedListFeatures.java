package com.lilith.thinkinginjava.unit11;

import java.util.LinkedList;

import com.lilith.tool.Print;
/**
 * P229	LinkedList
 * LinkedList的使用
 * @author Perform
 *
 */
public class LinkedListFeatures {
	public static void main(String[] args) {
		LinkedList<String> lists = new LinkedList<>();
		lists.add("one");
		lists.add("twe");
		lists.add("three");
		lists.add("four");
		lists.add("five");
		Print.println(lists);
		//获得列表头
		Print.println("LinkedList.getFirst():" + lists.getFirst());
		Print.println("LinkedList.element():" + lists.element());
		Print.println("LinkedList.peek():" + lists.peek());
		//删除元素，默认从列表头删除
		Print.println("LinkedList.remove():" + lists.remove());
		//删除列表头元素
		Print.println("LinkedList.removeFirst():" + lists.removeFirst());
		Print.println(lists);
		//取得列表头元素
		Print.println("LinkedList.poll():" + lists.poll());
		Print.println(lists);
		//插入列表头元素
		lists.addFirst("six");
		Print.println("LinkedList.addFirst():" + lists);
		lists.offer("seven");
		Print.println("LinkedList.offer():" + lists);
		lists.add("eight");
		Print.println("LinkedList.add():" + lists);
		lists.addLast("nine");
		Print.println("LinkedList.addLast():" + lists);
		Print.println("LinkedList.removeLast():" + lists.removeLast());
		//获得列表尾元素
		Print.println("LinkedList.getLast():" + lists.getLast());
		
	}
}
