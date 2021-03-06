package com.lilith.thinkinginjava.unit16;
/**
 * P440
 * 数组——数组与泛型
 * 不可以实例化带参数类型的数组，可以参数化数组本身的类型
 * @author 56580
 *
 */
public class ParameterizedArrayType {
	public static void main(String[] args) {
		Integer[] ints = {1, 2, 3, 4, 5};
		Double[] doubles = {1.1, 2.2, 3.3, 4.4, 5.5};
		Integer[] ints2 = new ClassParameter<Integer>().f(ints);
		Double[] doubles2 = new ClassParameter<Double>().f(doubles);
		ints2 = MethodParameter.f(ints);
		doubles2 = MethodParameter.f(doubles);
	}
}
class ClassParameter<T>{
	public T[] f(T[] arg) {
		return arg;
	}
}
class MethodParameter{
	public static <T> T[] f(T[] arg) {
		return arg;
	}
}