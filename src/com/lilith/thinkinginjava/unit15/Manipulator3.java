package com.lilith.thinkinginjava.unit15;
/**
 * P375
 * 泛型的擦除
 * @author Perform
 *
 */
public class Manipulator3 {
	private HasF obj;
	public Manipulator3(HasF x) {
		obj = x;
	}
	public void manipulate() {
		obj.f();
	}
}
