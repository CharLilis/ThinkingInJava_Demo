package com.lilith.thinkinginjava.unit15;
/**
 * P374
 * 泛型的擦除
 * 由于泛型的擦除，导致虚拟机认为T对象中没有f()，编译不通过
 * @author Perform
 *
 */
public class Manipulation {
	public static void main(String[] args) {
		HasF hf = new HasF();
		Manipulator<HasF> manipulator = new Manipulator(hf);
		manipulator.manipulate();
	}
}
class Manipulator<T>{
	private T obj;
	public Manipulator(T obj) {
		this.obj = obj;
	}
	public void manipulate() {
//		obj.f();
	}
}