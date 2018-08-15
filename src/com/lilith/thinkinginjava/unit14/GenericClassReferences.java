package com.lilith.thinkinginjava.unit14;
/**
 * P320
 * Class的泛型操作
 * 使用Class的泛型可以增加编译器的校验
 * @author Perform
 *
 */
public class GenericClassReferences {
	public static void main(String[] args) {
		Class intClass = int.class;
		Class<Integer> genercIntClass = int.class;
		genercIntClass = Integer.class;
		intClass = double.class;
//		genercIntClass = double.class;
	}
}
