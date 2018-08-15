package com.lilith.thinkinginjava.unit15;
/**
 * P382
 * 擦除的补偿
 * 模板方法设计模式
 * @author Perform
 *
 */
public class CreatorGeneric {
	public static void main(String[] args) {
		Creator c = new Creator();
		c.f();
	}
}
abstract class GenericWithCreate<T>{
	final T t;
	GenericWithCreate() {
		t = create();
	}
	abstract T create();
}
class X{}
class Creator extends GenericWithCreate<X>{
	@Override
	X create() {
		return new X();
	}
	void f() {
		System.out.println(t.getClass().getSimpleName());
	}
}