package com.lilith.thinkinginjava.unit11;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
/**
 * P228
 * ListIterator是Iterator的子类，相比于父类，ListIterator支持双向移动，只支持List类
 * 并且可以使用set()替换最后读取到的元素，可以使用List.listIterator(n)指定初始化位置
 * @author Perform
 *
 */
public class ListIteration {
	public static void main(String[] args) {
		List<String> lists = new ArrayList<String>();
		lists.add("cat");
		lists.add("dog");
		lists.add("air");
		lists.add("mouse");
		lists.add("good");
		lists.add("one");
		System.out.println(lists);
		ListIterator<String> it = lists.listIterator();
		//向后移动
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		//向前移动
		while(it.hasPrevious()) {
			System.out.print(it.previous() + " ");
		}
		System.out.println();
		it = lists.listIterator(2);
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
			it.set("five");
		}
		System.out.println();
		while(it.hasPrevious()) {
			System.out.print(it.previous()+" ");
		}
		System.out.println();
		System.out.println(lists);
	}
}
