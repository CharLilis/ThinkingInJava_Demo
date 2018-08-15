package com.lilith.thinkinginjava.unit15;

import java.util.*;
/**
 * P378
 * 泛型的擦除
 * @author Perform
 *
 * @param <T>
 */
public class ListMaker<T> {
	public List<T> create(){
		return new ArrayList<T>();
	}
	public static void main(String[] args) {
		ListMaker<String> strList = new ListMaker<String>();
		List<String> str = strList.create();
	}
}
