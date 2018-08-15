package com.lilith.thinkinginjava.unit15;

import java.util.*;

public class GenericWriting {
	static <T> void writeExact(List<T> list, T item) {
		list.add(item);
	}
	static List<Apple> apples = new ArrayList<Apple>();
	static List<Fruit> fruit = new ArrayList<Fruit>();
	static void f1() {
		writeExact(apples, new Apple());
		writeExact(fruit, new Apple());
		GenericWriting.<Fruit>writeExact(fruit, new Apple());
//		GenericWriting.<Apple>writeExact(fruit, new Apple());
	}
	static <T> void writeWithWildcard(List<? super T> list, T item) {
		List<? extends Fruit> t = new ArrayList<Apple>();
		List<? super Apple> t1 = new ArrayList<Jonathan>();
		list.add(item);
	}
	static void f2() {
		writeWithWildcard(apples, new Apple());
		writeWithWildcard(fruit, new Apple());
	}
	public static void main(String[] args) {
		f1();
		f2();
	}
}
