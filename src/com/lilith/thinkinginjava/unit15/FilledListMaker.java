package com.lilith.thinkinginjava.unit15;

import java.util.*;
/**
 * 
 * @author Perform
 *
 * @param <T>
 */
public class FilledListMaker<T> {
	List<T> create(T t, int size){
		List<T> list = new ArrayList<T>();
		for(int i = 0; i < size; i++) {
			list.add(t);
		}
		return list;
	}
	public static void main(String[] args) {
		FilledListMaker<String> str = new FilledListMaker<String>();
		List<String> list = str.create("Hello", 4);
		System.out.println(list);
	}
}
