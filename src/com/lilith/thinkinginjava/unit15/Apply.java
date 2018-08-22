package com.lilith.thinkinginjava.unit15;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Apply {
	public static <T, S extends Iterable<? extends T>> void apply(S sep, Method method, Object... args) {
		try {
			for(T t : sep) {
				method.invoke(t, args);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
class Shape{
	public void rotate() {
		System.out.println(this + " rotate");
	}
	public void resize(int newSize) {
		System.out.println(this + " resize " + newSize);
	}
}
class Square extends Shape{}
class FilledList<T> extends ArrayList<T>{
	public FilledList(Class<? extends T> type, int size) {
		try {
			//填充size个T对象
			for(int i = 0; i < size; i++) {
				add(type.newInstance());
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		} 
	}
}
