package com.lilith.thinkinginjava.unit17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import static com.lilith.tool.Print.*;
/**
 * P475
 * 深入研究容器——List的功能方法
 * @author Perform
 *
 */
public class Lists {
	private static boolean b;
	private static String s;
	private static int i;
	private static Iterator<String> it;
	private static ListIterator<String> lit;
	public static void basicTest(List<String> a) {
		a.add(1, "x");
		a.add("x");
		
		a.addAll(Countries.names(25));
		
		a.addAll(3, Countries.names(25));
		
		b = a.contains("1");
		
		b = a.containsAll(Countries.names(25));
		
		s = a.get(1);
		i = a.indexOf("1");
		b = a.isEmpty();
		it = a.iterator();
		lit = a.listIterator();
		lit = a.listIterator(3);
		
		i = a.lastIndexOf("1");
		a.remove(1);
		a.remove("3");
		a.set(1, "y");
		
		a.removeAll(Countries.names(25));
		
		a.removeAll(Countries.names(25));
		i = a.size();
		a.clear();
	}
	public static void iterMotion(List<String> a) {
		//可双向遍历
		ListIterator<String> it = a.listIterator();
		b = it.hasNext();
		//检查游标是否有上一个元素，有则返回（true）
		b = it.hasPrevious();
		s = it.next();
		i = it.nextIndex();
		//取出上一个，并将游标向上移一个
		s = it.previous();
		i = it.previousIndex();
	}
	
	public static void iterMnipulation(List<String> a) {
		ListIterator<String> it = a.listIterator();
		it.add("47");
		println(a);
		println(it.next());
		it.remove();
		println(a);
		println(it.next());
		it.set("47");
		println(a);
	}
	
	public static void testVisual(List<String> a) {
		println(a);
		List<String> b = Countries.names(25);
		println("b = " + b);
		a.addAll(b);
		a.addAll(b);
		println(a);
		
		ListIterator<String> x = a.listIterator(a.size()/2);
		x.add("one");
		println(a);
		println(x.next());
		x.remove();
		println(x.next());
		x.set("47");
		println(a);
		x = a.listIterator(a.size());
		while(x.hasPrevious()) {
			println(x.previous() + " ");
		}
		println();
		println("testVisual finished");
	}
	public static void testLinkedList() {
		LinkedList<String> ll = new LinkedList<String>();
		ll.addAll(Countries.names(25));
		println(ll);
		ll.addFirst("one");
		ll.addFirst("two");
		println(ll);
		println(ll.getFirst());
		println(ll.removeFirst());
		println(ll.removeFirst());
		println(ll.removeLast());
		println(ll);
	}
	public static void main(String[] args) {
		basicTest(new LinkedList<String>(Countries.names(25)));
		basicTest(new ArrayList<String>(Countries.names(25)));
		iterMotion(new LinkedList<String>(Countries.names(25)));
		iterMotion(new ArrayList<String>(Countries.names(25)));
		iterMnipulation(new LinkedList<String>(Countries.names(25)));
		iterMnipulation(new ArrayList<String>(Countries.names(25)));
		testVisual(new LinkedList<String>(Countries.names(25)));
		testLinkedList();
	}
}
