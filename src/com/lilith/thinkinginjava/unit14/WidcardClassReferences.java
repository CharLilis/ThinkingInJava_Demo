package com.lilith.thinkinginjava.unit14;
/**
 * P320
 * Class泛型的引用
 * 通配符?的使用，表示任何事物
 * @author Perform
 *
 */
public class WidcardClassReferences {
	public static void main(String[] args) {
		Class<?> intClass = int.class;
		intClass = double.class;
	}
}
