package com.lilith.thinkinginjava.unit14;
/**
 * P322
 * Class泛型的使用
 * newInstance()的使用
 * ?和super的使用
 * @author Perform
 *
 */
public class GenericToyTest {
	public static void main(String[] args) throws Exception {
		Class<FancyToy> ftClass = FancyToy.class;
		FancyToy fancyToy = ftClass.newInstance();
		Class<? super FancyToy> up = ftClass.getSuperclass();
		Object obj = up.newInstance();
	}
}
