package com.lilith.thinkinginjava.unit15;
/**
 * P375
 * 泛型的擦除
 * 在定义类时声明泛型的类型
 * @author Perform
 *
 * @param <T>
 */
public class Manipulator2 <T extends HasF>{
	private T obj;
	public Manipulator2(T x) {
		obj = x;
	}
	public void manipulate() {
		obj.f();
	}
}
