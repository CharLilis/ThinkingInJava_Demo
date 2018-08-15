package com.lilith.thinkinginjava.unit14;
/**
 * P321
 * Class泛型的使用
 * ?和extends配合使用
 * @author Perform
 *
 */
public class BoundedClassReferences {
	public static void main(String[] args) {
		Class<? extends Number> bounded = int.class;
		bounded = double.class;
		bounded = Number.class;
	}
}
