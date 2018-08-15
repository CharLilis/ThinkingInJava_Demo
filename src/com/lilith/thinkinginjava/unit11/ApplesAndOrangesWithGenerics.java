package com.lilith.thinkinginjava.unit11;

import java.util.ArrayList;
/**
 * P217
 * 在容器中使用泛型
 * @author 56580
 *
 */
public class ApplesAndOrangesWithGenerics {
	public static void main(String[] args) {
		ArrayList<Apple> apples = new ArrayList<Apple>();
		for(int i=0; i<3; i++) {
			apples.add(new Apple());
		}
//		apples.add(new Orange());
		for(int i=0; i<apples.size(); i++) {
			((Apple)apples.get(i)).returnId();
		}
	}
}
