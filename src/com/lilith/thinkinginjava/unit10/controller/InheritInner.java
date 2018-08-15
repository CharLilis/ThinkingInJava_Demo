package com.lilith.thinkinginjava.unit10.controller;

import com.lilith.tool.Print;
/**
 * P212	内部类的继承
 * 当发生内部类继承时，导出类需要在构造时传入外围类对象
 * @author 56580
 *
 */
public class InheritInner extends WithInner.Inner{
	public InheritInner(WithInner wi) {
		wi.super();
	}
	public static void main(String[] args) {
		WithInner wi1 = new WithInner();
		WithInner wi2 = new WithInner();
		InheritInner ii = new InheritInner(wi1);
		
	}
}
class WithInner{
	private static int id = 0;
	public WithInner() {
		id ++;
		Print.println("WithInner id = " + id);
	}
	class Inner{}
}
