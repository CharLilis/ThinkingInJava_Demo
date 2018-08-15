package com.lilith.thinkinginjava.unit15;
/**
 * P409
 * 泛型-参数协变
 * @author 56580
 *
 */
public class SelfBoundingAndCovariantArguments {
	void testA(Setter s1, Setter s2, SelfBoundSetter sbs) {
		s1.set(s2);
		s1.set(new C1());
//		s1.set(sbs);编译器不能将基类出入方法中
	}
}
interface SelfBoundSetter<T extends SelfBoundSetter<T>>{
	void set(T arg);
}
interface Setter extends SelfBoundSetter<Setter>{}

class C1 implements Setter{
	public void set(Setter arg) {
		
	}
}